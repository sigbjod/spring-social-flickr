package org.springframework.social.flickr.api.impl.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.springframework.social.flickr.api.Size;

public class SizeContainerDeserializer extends
		AbstractFlickrDeserializer<SizeContainer> {

	@Override
	public SizeContainer deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		return deserializeResponseObject(jp, "size", SizeContainer.class,
				Size.class);
	}
}
