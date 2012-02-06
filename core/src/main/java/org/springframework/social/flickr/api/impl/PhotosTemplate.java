package org.springframework.social.flickr.api.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.social.flickr.api.PhotosOperations;
import org.springframework.social.flickr.api.Size;
import org.springframework.social.flickr.api.impl.json.SizeListContainer;

public class PhotosTemplate extends AbstractFlickrOperations implements
		PhotosOperations {

	public PhotosTemplate(FlickrTemplate flickr, boolean isAuthorized) {
		super(flickr, isAuthorized);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Size> getSizes(Long photoId) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("photo_id", photoId.toString());
		return get(buildUri("flickr.photos.getSizes", params),
				SizeListContainer.class).getSizes();
	}
}
