package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.flickr.api.Photo;

@JsonDeserialize(using = PhotoContainerDeserializer.class)
public class PhotoContainer {
	private final Photo photo;

	public PhotoContainer(Photo photo) {
		this.photo = photo;
	}

	public Photo getPhoto() {
		return photo;
	}

}
