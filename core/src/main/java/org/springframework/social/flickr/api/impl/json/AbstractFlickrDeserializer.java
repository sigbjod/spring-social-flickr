package org.springframework.social.flickr.api.impl.json;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.type.TypeReference;

public abstract class AbstractFlickrDeserializer<T> extends JsonDeserializer<T> {

	public List<?> deserializeResponseList(JsonParser jp, String propertyName,
			TypeReference typeRef) throws IOException, JsonProcessingException {
		while (true) {
			String fieldname = jp.getCurrentName();
			jp.nextToken();
			if (propertyName.equals(fieldname)) {
				List<?> result = (List) jp.readValueAs(typeRef);
				return result;
			}
		}
	}

	public <C> C deserializeResponseObject(JsonParser jp, String propertyName,
			Class<C> container, Class<?> containee) throws IOException,
			JsonProcessingException {
		while (true) {
			String fieldname = jp.getCurrentName();
			jp.nextToken();
			if (propertyName.equals(fieldname)) {
				while (jp.nextToken() != JsonToken.END_OBJECT) {
					try {
						return container.getConstructor(containee).newInstance(
								jp.readValueAs(containee));
					} catch (Exception e) {
						return null;
					}
				}
			}
		}
	}
}
