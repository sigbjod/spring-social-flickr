package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.flickr.api.helper.parameter.HelperStringParameter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PhotosetMixin {
	@JsonCreator
	PhotosetMixin(@JsonProperty("id") Long id,
			@JsonProperty("primary") Long owner,
			@JsonProperty("secret") String secret,
			@JsonProperty("server") Integer server,
			@JsonProperty("farm") Integer farm,
			@JsonProperty("photos") Integer photos,
			@JsonProperty("videos") Integer videos,
			@JsonProperty("count_views") Integer count_views,
			@JsonProperty("count_comments") Integer count_comments,
			@JsonProperty("can_comment") Integer can_comment,
			@JsonProperty("date_create") Long date_create,
			@JsonProperty("date_update") Long date_update) {
	}

	@JsonProperty("title")
	HelperStringParameter title;

	@JsonProperty("description")
	HelperStringParameter description;
}
