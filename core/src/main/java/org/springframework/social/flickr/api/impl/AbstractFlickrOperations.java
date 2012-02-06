package org.springframework.social.flickr.api.impl;

import java.net.URI;
import java.util.Collections;
import java.util.Map;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.oauth1.AbstractOAuth1ApiBinding;
import org.springframework.social.support.URIBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public abstract class AbstractFlickrOperations extends AbstractOAuth1ApiBinding {

	private final boolean isAuthorized;

	protected final FlickrTemplate flickr;

	public AbstractFlickrOperations(FlickrTemplate flickr, boolean isAuthorized) {
		this.flickr = flickr;
		this.isAuthorized = isAuthorized;
	}

	protected <T> T get(URI uri, Class<T> responseType) {
		return flickr.getRestTemplate().getForObject(uri, responseType);
	}

	protected <C> C post(URI uri, MultiValueMap<String, Object> data,
			Class<C> responseType) {
		MultiValueMap<String, Object> requestData = new LinkedMultiValueMap<String, Object>(
				data);
		return flickr.getRestTemplate().postForObject(uri, requestData,
				responseType);
	}

	protected void delete(URI uri) {
		flickr.getRestTemplate().delete(uri);
	}

	protected void requireUserAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException();
		}
	}

	protected URI buildUri(String method) {
		return buildUri(method, Collections.<String, String> emptyMap());
	}

	protected URI buildUri(String method, Map<String, String> params) {
		URIBuilder uriBuilder = URIBuilder.fromUri(API_URL_BASE).queryParam(
				"method", method).queryParam("format", FORMAT).queryParam(
				"nojsoncallback", "1");
		for (String paramName : params.keySet()) {
			uriBuilder.queryParam(paramName, String.valueOf(params
					.get(paramName)));
		}
		return uriBuilder.build();
	}

	public static final String API_URL_BASE = "http://api.flickr.com/services/rest/";
	public static final String FORMAT = "json";

}