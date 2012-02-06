package org.springframework.social.flickr.api.impl.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.springframework.social.flickr.api.Photoset;

public class PhotosetContainerDeserializer extends
		AbstractFlickrDeserializer<PhotosetContainer> {

	@Override
	public PhotosetContainer deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		return deserializeResponseObject(jp, "photoset",
				PhotosetContainer.class, Photoset.class);
	}
}
