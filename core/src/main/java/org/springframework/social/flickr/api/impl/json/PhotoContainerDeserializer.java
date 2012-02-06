package org.springframework.social.flickr.api.impl.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.springframework.social.flickr.api.Photo;

public class PhotoContainerDeserializer extends
		AbstractFlickrDeserializer<PhotoContainer> {

	@Override
	public PhotoContainer deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		return deserializeResponseObject(jp, "photo", PhotoContainer.class,
				Photo.class);
	}
}
