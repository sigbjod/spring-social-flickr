package org.springframework.social.flickr.api.impl.json;

import java.util.List;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.flickr.api.Size;

@JsonDeserialize(using = SizeListContainerDeserializer.class)
public class SizeListContainer {
	private final List<Size> sizes;

	public SizeListContainer(List<Size> sizes) {
		this.sizes = sizes;
	}

	/**
	 * @return the size
	 */
	public List<Size> getSizes() {
		return sizes;
	}

}
