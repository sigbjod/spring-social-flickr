package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.flickr.api.helper.parameter.HelperStringParameter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlickrUserMixin {
	@JsonCreator
	FlickrUserMixin(@JsonProperty("nsid") String nsid,
			@JsonProperty("id") String id,
			@JsonProperty("username") HelperStringParameter username) {
	}
}
