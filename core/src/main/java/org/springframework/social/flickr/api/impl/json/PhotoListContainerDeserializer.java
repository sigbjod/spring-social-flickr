package org.springframework.social.flickr.api.impl.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.springframework.social.flickr.api.PhotoList;

public class PhotoListContainerDeserializer extends
		AbstractFlickrDeserializer<PhotoListContainer> {

	@Override
	public PhotoListContainer deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		return deserializeResponseObject(jp, "photos",
				PhotoListContainer.class, PhotoList.class);
	}
}
