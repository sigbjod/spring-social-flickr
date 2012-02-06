package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.flickr.api.Photoset;

@JsonDeserialize(using = PhotosetContainerDeserializer.class)
public class PhotosetContainer {
	private final Photoset photoset;

	public PhotosetContainer(Photoset photoset) {
		this.photoset = photoset;
	}

	public Photoset getPhotoset() {
		return photoset;
	}

}
