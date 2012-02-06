/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.flickr.connect;

import static org.junit.Assert.assertNotNull;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.social.test.client.RequestMatchers.method;
import static org.springframework.social.test.client.RequestMatchers.requestTo;
import static org.springframework.social.test.client.ResponseCreators.withResponse;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.social.flickr.api.FlickrProfile;
import org.springframework.social.flickr.api.impl.FlickrTemplate;
import org.springframework.social.test.client.MockRestServiceServer;

public class FlickrServiceProviderTest {
	private final String consumerKey = "748cc1ca21b7ee6f251b80d3cf4733f6";
	private final String consumerSecret = "ceea1d67ec2096ad";
	private final String callbackUrl = "https://my-callback-url";
	MockRestServiceServer mockServer;
	FlickrTemplate flickr;

	@Before
	public void getFlickrTemplate() {
		/*
		 * FlickrConnectionFactory flickrConnectionFactory = new FlickrConnectionFactory(consumerKey, consumerSecret); OAuth1Operations oauthOperations = flickrConnectionFactory.getOAuthOperations(); OAuthToken fetchRequestToken = oauthOperations.fetchRequestToken(callbackUrl, null);
		 */

		flickr = new FlickrTemplate("consumerKey", "consumerSecret",
				"accessToken", "accessTokenSecret");
		mockServer = MockRestServiceServer.createServer(flickr
				.getRestTemplate());

		/*
		 * Flickr flickr = new FlickrTemplate(consumerKey, consumerSecret, fetchRequestToken.getValue(), fetchRequestToken.getSecret()); FlickrProfile userProfile = flickr.getUserProfile(); System.out.println(userProfile);
		 */
	}

	@Test
	public void getPeopleInfoTest() {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setContentType(MediaType.APPLICATION_JSON);
		mockServer.expect(requestTo("https://testpeople.json")).andExpect(
				method(GET)).andRespond(
				withResponse(jsonResource("peopleinfo"), responseHeaders));

		FlickrProfile profile = flickr.peopleOperations().getInfo("testuser");
		assertNotNull(profile);
	}

	private Resource jsonResource(String filename) {
		System.out.println(getClass());
		Resource r = new ClassPathResource(filename + ".json", getClass());
		try {
			File f = r.getFile();
			System.out.println(f.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}

}