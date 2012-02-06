package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.flickr.api.PhotoList;

@JsonDeserialize(using = PhotoListContainerDeserializer.class)
public class PhotoListContainer {
	private final PhotoList photos;

	public PhotoListContainer(PhotoList photos) {
		this.photos = photos;
	}

	public PhotoList getPhotos() {
		return photos;
	}
}
