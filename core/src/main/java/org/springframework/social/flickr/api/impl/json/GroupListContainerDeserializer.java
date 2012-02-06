package org.springframework.social.flickr.api.impl.json;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.social.flickr.api.Group;

public class GroupListContainerDeserializer extends
		AbstractFlickrDeserializer<GroupListContainer> {

	@SuppressWarnings("unchecked")
	@Override
	public GroupListContainer deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		// FIXME Check if this is working
		return new GroupListContainer((List<Group>) deserializeResponseList(jp,
				"group", new TypeReference<List<Group>>() {
				}));

	}
}
