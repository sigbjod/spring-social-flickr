package org.springframework.social.flickr.api;

public interface PhotosetsOperations {

	/**
	 * Gets information about a photoset
	 * 
	 * @see http://www.flickr.com/services/api/flickr.photosets.getInfo.html
	 * @param id
	 *            The photoset id
	 * @return A FlickrPhotoset
	 */
	Photoset getInfo(Long id);

	/**
	 * Get the photosets for the authentified user
	 * 
	 * @see http://www.flickr.com/services/api/flickr.photosets.getList.html
	 * @return A FlickrPhotosetList
	 */
	PhotosetList getList();

	/**
	 * Get the photosets for a given user
	 * 
	 * @see http://www.flickr.com/services/api/flickr.photosets.getList.html
	 * @param nsid
	 *            The user's id
	 * @param page
	 * @param perPage
	 * @return A FlickrPhotosetList
	 */
	PhotosetList getList(String nsid, int page, int perPage);

	/**
	 * Get the photos in a set
	 * 
	 * @see http://www.flickr.com/services/api/flickr.photosets.getPhotos.html
	 * @param photosetId
	 * @return A FlickrPhotoset
	 */
	Photoset getPhotos(Long photosetId);

	/**
	 * Get the photos in a set
	 * 
	 * @see http://www.flickr.com/services/api/flickr.photosets.getPhotos.html
	 * @param photosetId
	 * @param extras
	 * @param privacyFilter
	 * @param perPage
	 * @param page
	 * @param media
	 * @return A FlickrPhotoset
	 */
	Photoset getPhotos(Long photosetId, String[] extras,
			int privacyFilter, int perPage, int page, String media);

	// TODO Unimplemented methods
	// ? addPhoto
	// ? create
	// ? delete
	// ? editMeta
	// ? editPhotos
	// ? getContext
	// ? orderSets
	// ? removePhoto
	// ? removePhotos
	// ? reorderPhotos
	// ? setPrimaryPhoto

}
