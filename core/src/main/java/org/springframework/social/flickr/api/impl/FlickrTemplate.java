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
package org.springframework.social.flickr.api.impl;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.social.flickr.api.Flickr;
import org.springframework.social.flickr.api.GalleriesOperations;
import org.springframework.social.flickr.api.PeopleOperations;
import org.springframework.social.flickr.api.PhotosOperations;
import org.springframework.social.flickr.api.PhotosetsOperations;
import org.springframework.social.flickr.api.TestOperations;
import org.springframework.social.flickr.api.impl.json.FlickrModule;
import org.springframework.social.oauth1.AbstractOAuth1ApiBinding;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.web.client.RestTemplate;

public class FlickrTemplate extends AbstractOAuth1ApiBinding implements Flickr {
	private GalleriesOperations galleriesOperations;
	private PeopleOperations peopleOperations;
	private PhotosetsOperations photosetsOperations;
	private PhotosOperations photosOperations;
	private TestOperations testOperations;

	public FlickrTemplate(String consumerKey, String consumerSecret,
			String accessToken, String accessTokenSecret) {
		super(consumerKey, consumerSecret, accessToken, accessTokenSecret);
		initialize();
	}

	@Override
	public GalleriesOperations galleriesOperations() {
		return galleriesOperations;
	}

	@Override
	public PeopleOperations peopleOperations() {
		return peopleOperations;
	}

	@Override
	public PhotosetsOperations photosetsOperations() {
		return photosetsOperations;
	}

	@Override
	public PhotosOperations photosOperations() {
		return photosOperations;
	}

	@Override
	public TestOperations testOperations() {
		return testOperations;
	}

	@Override
	protected void configureRestTemplate(RestTemplate restTemplate) {
		restTemplate.setErrorHandler(new FlickrErrorHandler());
	}

	@Override
	protected MappingJacksonHttpMessageConverter getJsonMessageConverter() {
		MappingJacksonHttpMessageConverter converter = super
				.getJsonMessageConverter();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new FlickrModule());
		List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
		supportedMediaTypes.add(MediaType.TEXT_PLAIN);
		supportedMediaTypes.add(MediaType.TEXT_XML);
		supportedMediaTypes.add(MediaType.APPLICATION_JSON);
		converter.setSupportedMediaTypes(supportedMediaTypes);
		converter.setObjectMapper(objectMapper);
		return converter;
	}

	// private helpers
	private void initialize() {
		// Wrap the request factory with a BufferingClientHttpRequestFactory so that the error handler can do repeat reads on the response.getBody()
		super.setRequestFactory(ClientHttpRequestFactorySelector
				.bufferRequests(getRestTemplate().getRequestFactory()));
		initSubApis();
	}

	private void initSubApis() {
		this.galleriesOperations = new GalleriesTemplate(this, isAuthorized());
		this.peopleOperations = new PeopleTemplate(this, isAuthorized());
		this.photosetsOperations = new PhotosetsTemplate(this, isAuthorized());
		this.photosOperations = new PhotosTemplate(this, isAuthorized());
		this.testOperations = new TestTemplate(this, isAuthorized());
	}
}
