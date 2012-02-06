package org.springframework.social.flickr.api.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.social.flickr.api.FlickrApiException;
import org.springframework.web.client.DefaultResponseErrorHandler;

public class FlickrErrorHandler extends DefaultResponseErrorHandler {

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {
		Map<String, String> errorDetails = extractErrorDetailsFromResponse(response);

		int code = Integer.valueOf(String.valueOf(errorDetails.get("code")))
				.intValue();
		String message = String.valueOf(errorDetails.get("message"));

		throw new FlickrApiException(code, message);
	}

	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		if (super.hasError(response)) {
			return true;
		}
		// only bother checking the body for errors if we get past the default error check
		String content = readFully(response.getBody());
		return content.contains("\"stat\":\"fail\"") || content.equals("false");
	}

	private Map<String, String> extractErrorDetailsFromResponse(
			ClientHttpResponse response) throws IOException {
		ObjectMapper mapper = new ObjectMapper(new JsonFactory());
		return mapper.<Map<String, String>> readValue(response.getBody(),
				new TypeReference<Map<String, String>>() {
				});
	}

	private String readFully(InputStream in) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		StringBuilder sb = new StringBuilder();
		while (reader.ready()) {
			sb.append(reader.readLine());
		}
		return sb.toString();
	}
}
