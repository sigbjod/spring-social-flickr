package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.flickr.api.FlickrUser;

@JsonDeserialize(using = FlickrUserContainerDeserializer.class)
public class FlickrUserContainer {
	private final FlickrUser user;

	public FlickrUserContainer(FlickrUser user) {
		this.user = user;
	}

	public FlickrUser getUser() {
		return user;
	}

}
