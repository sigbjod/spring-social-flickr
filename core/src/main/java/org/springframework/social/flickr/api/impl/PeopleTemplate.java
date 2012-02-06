package org.springframework.social.flickr.api.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.social.flickr.api.FlickrProfile;
import org.springframework.social.flickr.api.FlickrUser;
import org.springframework.social.flickr.api.Group;
import org.springframework.social.flickr.api.PeopleOperations;
import org.springframework.social.flickr.api.PhotoList;
import org.springframework.social.flickr.api.impl.json.FlickrProfileContainer;
import org.springframework.social.flickr.api.impl.json.FlickrUserContainer;
import org.springframework.social.flickr.api.impl.json.GroupListContainer;
import org.springframework.social.flickr.api.impl.json.PhotoListContainer;

public class PeopleTemplate extends AbstractFlickrOperations implements
		PeopleOperations {

	public PeopleTemplate(FlickrTemplate flickr, boolean isAuthorized) {
		super(flickr, isAuthorized);
		// TODO Auto-generated constructor stub
	}

	@Override
	public FlickrUser findByEmail(String email) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("find_email", email);
		return get(buildUri("flickr.people.findByEmail", params),
				FlickrUserContainer.class).getUser();
	}

	@Override
	public FlickrUser findByUsername(String username) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("username", username);
		return get(buildUri("flickr.people.findByUsername", params),
				FlickrUserContainer.class).getUser();
	}

	@Override
	public FlickrProfile getInfo(String nsid) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("user_id", nsid);
		return get(buildUri("flickr.people.getInfo", params),
				FlickrProfileContainer.class).getProfile();
	}

	@Override
	public PhotoList getPhotos() {
		// TODO Needs to be authenticated
		return getPhotos("me");
	}

	@Override
	public PhotoList getPhotos(String nsid) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("user_id", nsid);
		return get(buildUri("flickr.people.getPhotos", params),
				PhotoListContainer.class).getPhotos();
	}

	@Override
	public PhotoList getPhotos(String nsid, int safeSearch, Long minUploadDate,
			Long maxUploadDate, Date minTakenDate, Date maxTakenDate,
			int contentType, int privacyFilter, String[] extras, int perPage,
			int page) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("user_id", nsid);
		params.put("safe_search", new Integer(safeSearch).toString());
		params.put("min_upload_date", new Long(minUploadDate).toString());
		params.put("max_upload_date", new Long(maxUploadDate).toString());
		params.put("min_taken_date", minTakenDate.toString());
		params.put("max_taken_date", maxTakenDate.toString());
		params.put("content_type", new Integer(contentType).toString());
		params.put("privacy_filter", new Integer(privacyFilter).toString());
		String extrasString = "";
		for (String extra : extras) {
			extrasString += extra + ",";
		}
		if (!extrasString.equals("")) {
			extrasString = extrasString.substring(0, extrasString.length() - 1);
		}
		params.put("extras", extrasString);
		params.put("per_page", new Integer(perPage).toString());
		params.put("page", new Integer(page).toString());
		return get(buildUri("flickr.people.getPhotos", params),
				PhotoListContainer.class).getPhotos();
	}

	@Override
	public PhotoList getPhotosOf() {
		// TODO Needs to be authenticated
		return getPhotos("me");
	}

	@Override
	public PhotoList getPhotosOf(String nsid) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("user_id", nsid);
		return get(buildUri("flickr.people.getPhotosOf", params),
				PhotoListContainer.class).getPhotos();
	}

	@Override
	public PhotoList getPhotosOf(String nsid, String ownerid, String[] extras,
			int perPage, int page) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("user_id", nsid);
		params.put("owner_id", ownerid);
		String extrasString = "";
		for (String extra : extras) {
			extrasString += extra + ",";
		}
		if (!extrasString.equals("")) {
			extrasString = extrasString.substring(0, extrasString.length() - 1);
		}
		params.put("extras", extrasString);
		params.put("per_page", new Integer(perPage).toString());
		params.put("page", new Integer(page).toString());
		return get(buildUri("flickr.people.getPhotosOf", params),
				PhotoListContainer.class).getPhotos();
	}

	@Override
	public List<Group> getPublicGroups(String nsid) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("user_id", nsid);
		return get(buildUri("flickr.people.getPublicGroups", params),
				GroupListContainer.class).getGroups();
	}

	@Override
	public List<Group> getPublicGroups(String nsid, int invitation_only) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("user_id", nsid);
		params.put("invitation_only", new Integer(invitation_only).toString());
		return get(buildUri("flickr.people.getPublicGroups", params),
				GroupListContainer.class).getGroups();
	}

	@Override
	public PhotoList getPublicPhotos(String nsid) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("user_id", nsid);
		return get(buildUri("flickr.people.getPublicPhotos", params),
				PhotoListContainer.class).getPhotos();
	}

	@Override
	public PhotoList getPublicPhotos(String nsid, int safeSearch,
			String[] extras, int perPage, int page) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("user_id", nsid);
		params.put("safe_search", new Integer(safeSearch).toString());
		String extrasString = "";
		for (String extra : extras) {
			extrasString += extra + ",";
		}
		if (!extrasString.equals("")) {
			extrasString = extrasString.substring(0, extrasString.length() - 1);
		}
		params.put("extras", extrasString);
		params.put("per_page", new Integer(perPage).toString());
		params.put("page", new Integer(page).toString());
		return get(buildUri("flickr.people.getPublicPhotos", params),
				PhotoListContainer.class).getPhotos();
	}

	@Override
	public FlickrUser getUploadStatus() {
		// TODO Needs to be authenticated
		return get(buildUri("flickr.people.getUploadStatus"),
				FlickrUserContainer.class).getUser();
	}

}
