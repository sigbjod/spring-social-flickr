package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.flickr.api.FlickrProfile;

@JsonDeserialize(using = FlickrProfileContainerDeserializer.class)
public class FlickrProfileContainer {
	private final FlickrProfile profile;

	public FlickrProfileContainer(FlickrProfile profile) {
		this.profile = profile;
	}

	public FlickrProfile getProfile() {
		return profile;
	}

}
