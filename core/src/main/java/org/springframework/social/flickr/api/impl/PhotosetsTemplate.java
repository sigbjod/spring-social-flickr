package org.springframework.social.flickr.api.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.social.flickr.api.Photoset;
import org.springframework.social.flickr.api.PhotosetList;
import org.springframework.social.flickr.api.PhotosetsOperations;
import org.springframework.social.flickr.api.impl.json.PhotosetContainer;
import org.springframework.social.flickr.api.impl.json.PhotosetListContainer;

public class PhotosetsTemplate extends AbstractFlickrOperations implements
		PhotosetsOperations {

	public PhotosetsTemplate(FlickrTemplate flickr, boolean isAuthorized) {
		super(flickr, isAuthorized);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Photoset getInfo(Long photosetId) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("photoset_id", photosetId.toString());
		return get(buildUri("flickr.photosets.getInfo", params),
				PhotosetContainer.class).getPhotoset();
	}

	@Override
	public PhotosetList getList() {
		// TODO Needs to be authenticated
		return get(buildUri("flickr.photosets.getList"),
				PhotosetListContainer.class).getPhotosets();
	}

	@Override
	public PhotosetList getList(String nsid, int page, int perPage) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("user_id", nsid);
		params.put("page", new Integer(page).toString());
		params.put("per_page", new Integer(perPage).toString());
		return get(buildUri("flickr.photosets.getList", params),
				PhotosetListContainer.class).getPhotosets();
	}

	@Override
	public Photoset getPhotos(Long photosetId) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("photoset_id", photosetId.toString());
		return get(buildUri("flickr.photosets.getPhotos", params),
				PhotosetContainer.class).getPhotoset();
	}

	@Override
	public Photoset getPhotos(Long photosetId, String[] extras,
			int privacyFilter, int perPage, int page, String media) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("photoset_id", photosetId.toString());
		String extrasString = "";
		for (String extra : extras) {
			extrasString += extra + ",";
		}
		if (!extrasString.equals("")) {
			extrasString = extrasString.substring(0, extrasString.length() - 1);
		}
		params.put("extras", extrasString);
		params.put("privacy_filter", new Integer(privacyFilter).toString());
		params.put("per_page", new Integer(perPage).toString());
		params.put("page", new Integer(page).toString());
		params.put("media", media);
		return get(buildUri("flickr.photosets.getPhotos", params),
				PhotosetContainer.class).getPhotoset();
	}
}
