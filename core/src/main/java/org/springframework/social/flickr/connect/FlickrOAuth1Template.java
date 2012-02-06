package org.springframework.social.flickr.connect;

import org.springframework.social.oauth1.OAuth1Template;

public class FlickrOAuth1Template extends OAuth1Template {

	public FlickrOAuth1Template(String consumerKey, String consumerSecret) {
		super(consumerKey, consumerSecret,
				"http://www.flickr.com/services/oauth/request_token",
				"http://www.flickr.com/services/oauth/authorize",
				"http://www.flickr.com/services/oauth/authenticate",
				"http://www.flickr.com/services/oauth/access_token");
	}

}
