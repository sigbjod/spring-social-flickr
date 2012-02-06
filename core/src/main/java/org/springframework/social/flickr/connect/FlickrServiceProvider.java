/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.flickr.connect;

import org.springframework.social.flickr.api.Flickr;
import org.springframework.social.flickr.api.impl.FlickrTemplate;
import org.springframework.social.oauth1.AbstractOAuth1ServiceProvider;

public class FlickrServiceProvider extends
		AbstractOAuth1ServiceProvider<Flickr> {
	private final String consumerKey, consumerSecret;

	public FlickrServiceProvider(String consumerKey, String consumerSecret) {
		super(consumerKey, consumerSecret, new FlickrOAuth1Template(
				consumerKey, consumerSecret));
		this.consumerKey = consumerKey;
		this.consumerSecret = consumerSecret;
	}

	@Override
	public Flickr getApi(String accessToken, String secret) {
		return new FlickrTemplate(consumerKey, consumerSecret, accessToken,
				secret);
	}

}