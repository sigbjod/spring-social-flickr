package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.flickr.api.PhotosetList;

@JsonDeserialize(using = PhotosetListContainerDeserializer.class)
public class PhotosetListContainer {
	private final PhotosetList photosets;

	public PhotosetListContainer(PhotosetList photosets) {
		this.photosets = photosets;
	}

	public PhotosetList getPhotosets() {
		return photosets;
	}
}
