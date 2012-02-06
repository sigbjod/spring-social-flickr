package org.springframework.social.flickr.api.impl.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.springframework.social.flickr.api.FlickrUser;

public class FlickrUserContainerDeserializer extends
		AbstractFlickrDeserializer<FlickrUserContainer> {

	@Override
	public FlickrUserContainer deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		return deserializeResponseObject(jp, "user", FlickrUserContainer.class,
				FlickrUser.class);
	}
}
