package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SizeMixin {
	@JsonCreator
	SizeMixin(@JsonProperty("label") String label,
			@JsonProperty("width") Integer width,
			@JsonProperty("height") Integer height,
			@JsonProperty("source") String source,
			@JsonProperty("url") String url) {
	}
}
