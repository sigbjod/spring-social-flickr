package org.springframework.social.flickr.api.impl.json;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.social.flickr.api.Size;

public class SizeListContainerDeserializer extends
		AbstractFlickrDeserializer<SizeListContainer> {

	@SuppressWarnings("unchecked")
	@Override
	public SizeListContainer deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		// FIXME Check if this is working
		return new SizeListContainer((List<Size>) deserializeResponseList(jp,
				"size", new TypeReference<List<Size>>() {
				}));

	}
}
