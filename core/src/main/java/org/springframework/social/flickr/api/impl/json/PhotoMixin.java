package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PhotoMixin {
	@JsonCreator
	PhotoMixin(@JsonProperty("id") Long id,
			@JsonProperty("owner") String owner,
			@JsonProperty("secret") String secret,
			@JsonProperty("server") Integer server,
			@JsonProperty("title") String title,
			@JsonProperty("ispublic") Integer ispublic,
			@JsonProperty("isfriend") Integer isfriend,
			@JsonProperty("isfamily") Integer isfamily) {
	}
}
