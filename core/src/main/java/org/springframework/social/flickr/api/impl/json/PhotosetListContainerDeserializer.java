package org.springframework.social.flickr.api.impl.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.springframework.social.flickr.api.PhotosetList;

public class PhotosetListContainerDeserializer extends
		AbstractFlickrDeserializer<PhotosetListContainer> {

	@Override
	public PhotosetListContainer deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		return deserializeResponseObject(jp, "photosets",
				PhotosetListContainer.class, PhotosetList.class);
	}
}
