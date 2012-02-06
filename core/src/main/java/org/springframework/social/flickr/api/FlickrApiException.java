package org.springframework.social.flickr.api;

import org.springframework.social.SocialException;

@SuppressWarnings("serial")
public class FlickrApiException extends SocialException {

	private final int code;

	public FlickrApiException(int code, String message) {
		super(message);
		this.code = code;
	}

	public int getCode() {
		return code;
	}

}
