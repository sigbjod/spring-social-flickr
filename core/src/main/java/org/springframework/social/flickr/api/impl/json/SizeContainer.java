package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.flickr.api.Size;

@JsonDeserialize(using = SizeContainerDeserializer.class)
public class SizeContainer {
	private final Size size;

	public SizeContainer(Size size) {
		this.size = size;
	}

	/**
	 * @return the size
	 */
	public Size getSize() {
		return size;
	}

}
