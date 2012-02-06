package org.springframework.social.flickr.api.impl.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.springframework.social.flickr.api.Group;

public class GroupContainerDeserializer extends
		AbstractFlickrDeserializer<GroupContainer> {

	@Override
	public GroupContainer deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		return deserializeResponseObject(jp, "group", GroupContainer.class,
				Group.class);
	}
}
