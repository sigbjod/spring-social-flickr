package org.springframework.social.flickr.api.impl;

import org.springframework.social.flickr.api.FlickrUser;
import org.springframework.social.flickr.api.TestOperations;
import org.springframework.social.flickr.api.impl.json.FlickrUserContainer;

public class TestTemplate extends AbstractFlickrOperations implements
		TestOperations {

	public TestTemplate(FlickrTemplate flickr, boolean isAuthorized) {
		super(flickr, isAuthorized);
		// TODO Auto-generated constructor stub
	}

	@Override
	public FlickrUser login() {
		// TODO Needs to be authenticated
		return get(buildUri("flickr.test.login"), FlickrUserContainer.class)
				.getUser();
	}

}
