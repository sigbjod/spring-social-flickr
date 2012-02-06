package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.flickr.api.helper.parameter.HelperStringParameter;
import org.springframework.social.flickr.api.helper.structure.HelperProfilePhotos;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlickrProfileMixin {
	@JsonCreator
	FlickrProfileMixin(@JsonProperty("nsid") String nsid,
			@JsonProperty("id") String id,
			@JsonProperty("ispro") Integer ispro,
			@JsonProperty("iconserver") Integer iconserver,
			@JsonProperty("iconfarm") Integer iconfarm,
			@JsonProperty("username") HelperStringParameter username,
			@JsonProperty("realname") HelperStringParameter realname,
			@JsonProperty("mbox_sha1sum") HelperStringParameter mbox_sha1sum,
			@JsonProperty("location") HelperStringParameter location,
			@JsonProperty("photosurl") HelperStringParameter photosurl,
			@JsonProperty("profileurl") HelperStringParameter profileurl,
			@JsonProperty("photos") HelperProfilePhotos photos) {
	}
}
