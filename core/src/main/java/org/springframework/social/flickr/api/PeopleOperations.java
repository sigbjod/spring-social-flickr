package org.springframework.social.flickr.api;

import java.util.Date;
import java.util.List;

public interface PeopleOperations {

	/**
	 * Find a user based on an email address
	 * 
	 * @see http://www.flickr.com/services/api/flickr.people.findByEmail.html
	 * @param email
	 *            The email address
	 * @return A FlickrUser containing the NSID
	 */
	FlickrUser findByEmail(String email);

	/**
	 * Find a user based on a username
	 * 
	 * @see http://www.flickr.com/services/api/flickr.people.findByUsername.html
	 * @param username
	 *            The username
	 * @return A FlickrUser containing the NSID
	 */
	FlickrUser findByUsername(String username);

	/**
	 * Find a user based on a NSID
	 * 
	 * @see http://www.flickr.com/services/api/flickr.people.getInfo.html
	 * @param nsid
	 *            The user's NSID
	 * @return A FlickrProfile
	 */
	FlickrProfile getInfo(String nsid);

	/**
	 * Find the photos for the authenticated user
	 * 
	 * @see http://www.flickr.com/services/api/flickr.people.getPhotos.html
	 * @return The list of photos
	 */
	PhotoList getPhotos();

	/**
	 * Find the photos for a given user
	 * 
	 * @see http://www.flickr.com/services/api/flickr.people.getPhotos.html
	 * @param nsid
	 *            The user's id
	 * @return The list of photos
	 */
	PhotoList getPhotos(String nsid);

	/**
	 * Find the photos for a given user with all possible parameters
	 * 
	 * @see http://www.flickr.com/services/api/flickr.people.getPhotos.html
	 * @param nsid
	 *            The user's id
	 * @param safeSearch
	 * @param minUploadDate
	 * @param maxUploadDate
	 * @param minTakenDate
	 * @param maxTakenDate
	 * @param contentType
	 * @param privacyFilter
	 * @param extras
	 * @param perPage
	 * @param page
	 * @return The list of photos
	 */
	PhotoList getPhotos(String nsid, int safeSearch, Long minUploadDate,
			Long maxUploadDate, Date minTakenDate, Date maxTakenDate,
			int contentType, int privacyFilter, String[] extras, int perPage,
			int page);

	/**
	 * Find the photos of a given user
	 * 
	 * @see http://www.flickr.com/services/api/flickr.people.getPhotosOf.html
	 * @return The list of photos
	 */
	PhotoList getPhotosOf();

	/**
	 * Find the photos of a given user
	 * 
	 * @see http://www.flickr.com/services/api/flickr.people.getPhotosOf.html
	 * @param nsid
	 *            The user's id
	 * @return The list of photos
	 */
	PhotoList getPhotosOf(String nsid);

	/**
	 * Find the photos of a given user
	 * 
	 * @see http://www.flickr.com/services/api/flickr.people.getPhotosOf.html
	 * @param nsid
	 *            The user's id
	 * @param ownerid
	 *            The owner id
	 * @param extras
	 * @param perPage
	 * @param page
	 * @return The list of photos
	 */
	PhotoList getPhotosOf(String nsid, String ownerid, String[] extras,
			int perPage, int page);

	/**
	 * Find the public groups of a given user
	 * 
	 * @see http://www.flickr.com/services/api/flickr.people.getPublicGroups.html
	 * @param nsid
	 *            The user's id
	 * @return The list of groups
	 */
	List<Group> getPublicGroups(String nsid);

	/**
	 * Find the public groups of a given user
	 * 
	 * @see http://www.flickr.com/services/api/flickr.people.getPublicGroups.html
	 * @param nsid
	 *            The user's id
	 * @param invitation_only
	 * @return The list of groups
	 */
	List<Group> getPublicGroups(String nsid, int invitation_only);

	/**
	 * Find the list of public photos for a given user
	 * 
	 * @see http://www.flickr.com/services/api/flickr.people.getPublicPhotos.html
	 * @param nsid
	 *            The user's id
	 * @return The list of photos
	 */
	PhotoList getPublicPhotos(String nsid);

	/**
	 * Find the list of public photos for a given user
	 * 
	 * @see http://www.flickr.com/services/api/flickr.people.getPublicPhotos.html
	 * @param nsid
	 *            The user's id
	 * @param safeSearch
	 * @param extras
	 * @param perPage
	 * @param page
	 * @return The list of photos
	 */
	PhotoList getPublicPhotos(String nsid, int safeSearch, String[] extras,
			int perPage, int page);

	/**
	 * Find information for the calling user related to photos uploads
	 * 
	 * @return A FlickUser containing the user information
	 */
	FlickrUser getUploadStatus();
}
