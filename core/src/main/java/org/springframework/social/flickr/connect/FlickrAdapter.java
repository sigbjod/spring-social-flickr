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

import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.flickr.api.Flickr;
import org.springframework.social.flickr.api.FlickrProfile;
import org.springframework.web.client.HttpClientErrorException;

public class FlickrAdapter implements ApiAdapter<Flickr> {

	@Override
	public boolean test(Flickr flickr) {
		try {
			flickr.testOperations().login();
			return true;
		} catch (HttpClientErrorException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void setConnectionValues(Flickr flickr, ConnectionValues values) {
		FlickrProfile profile = flickr.peopleOperations().getInfo("test");
		values.setProviderUserId(profile.getNsid());
		values.setDisplayName(profile.getRealname().get_content());
		// TODO Set this later on
		// values.setImageUrl(null);
	}

	@Override
	public UserProfile fetchUserProfile(Flickr flickr) {
		FlickrProfile user = flickr.peopleOperations().getInfo("test");
		return new UserProfileBuilder().setName(
				user.getRealname().get_content()).setUsername(
				user.getUsername().get_content()).build();
	}

	@Override
	public void updateStatus(Flickr flickr, String message) {
		throw new UnsupportedOperationException();
	}

}
