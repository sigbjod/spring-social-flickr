package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupMixin {
	@JsonCreator
	GroupMixin(@JsonProperty("nsiid") String nsid,
			@JsonProperty("name") String name,
			@JsonProperty("admin") Integer admin,
			@JsonProperty("eighteenplus") Integer eighteenplus,
			@JsonProperty("invitation_only") Integer invitation_only) {
	}
}
