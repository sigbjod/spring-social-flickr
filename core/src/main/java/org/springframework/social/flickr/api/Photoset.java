package org.springframework.social.flickr.api;

import java.util.List;

import org.springframework.social.flickr.api.helper.parameter.HelperStringParameter;

public class Photoset {
	private Integer server, farm, photos, videos, count_views, count_comments,
			can_comment;
	private Long id, primary, date_create, date_update;
	private String owner, secret;
	private HelperStringParameter title, description;
	private List<Photo> photo;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the primary
	 */
	public Long getPrimary() {
		return primary;
	}

	/**
	 * @param primary
	 *            the primary to set
	 */
	public void setPrimary(Long primary) {
		this.primary = primary;
	}

	/**
	 * @return the server
	 */
	public Integer getServer() {
		return server;
	}

	/**
	 * @param server
	 *            the server to set
	 */
	public void setServer(Integer server) {
		this.server = server;
	}

	/**
	 * @return the farm
	 */
	public Integer getFarm() {
		return farm;
	}

	/**
	 * @param farm
	 *            the farm to set
	 */
	public void setFarm(Integer farm) {
		this.farm = farm;
	}

	/**
	 * @return the photos
	 */
	public Integer getPhotos() {
		return photos;
	}

	/**
	 * @param photos
	 *            the photos to set
	 */
	public void setPhotos(Integer photos) {
		this.photos = photos;
	}

	/**
	 * @return the videos
	 */
	public Integer getVideos() {
		return videos;
	}

	/**
	 * @param videos
	 *            the videos to set
	 */
	public void setVideos(Integer videos) {
		this.videos = videos;
	}

	/**
	 * @return the count_views
	 */
	public Integer getCount_views() {
		return count_views;
	}

	/**
	 * @param count_views
	 *            the count_views to set
	 */
	public void setCount_views(Integer count_views) {
		this.count_views = count_views;
	}

	/**
	 * @return the count_comments
	 */
	public Integer getCount_comments() {
		return count_comments;
	}

	/**
	 * @param count_comments
	 *            the count_comments to set
	 */
	public void setCount_comments(Integer count_comments) {
		this.count_comments = count_comments;
	}

	/**
	 * @return the can_comment
	 */
	public Integer getCan_comment() {
		return can_comment;
	}

	/**
	 * @param can_comment
	 *            the can_comment to set
	 */
	public void setCan_comment(Integer can_comment) {
		this.can_comment = can_comment;
	}

	/**
	 * @return the date_create
	 */
	public Long getDate_create() {
		return date_create;
	}

	/**
	 * @param date_create
	 *            the date_create to set
	 */
	public void setDate_create(Long date_create) {
		this.date_create = date_create;
	}

	/**
	 * @return the date_update
	 */
	public Long getDate_update() {
		return date_update;
	}

	/**
	 * @param date_update
	 *            the date_update to set
	 */
	public void setDate_update(Long date_update) {
		this.date_update = date_update;
	}

	/**
	 * @return the secret
	 */
	public String getSecret() {
		return secret;
	}

	/**
	 * @param secret
	 *            the secret to set
	 */
	public void setSecret(String secret) {
		this.secret = secret;
	}

	/**
	 * @return the title
	 */
	public HelperStringParameter getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(HelperStringParameter title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public HelperStringParameter getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(HelperStringParameter description) {
		this.description = description;
	}

	/**
	 * @return the photo
	 */
	public List<Photo> getPhoto() {
		return photo;
	}

	/**
	 * @param photo
	 *            the photo to set
	 */
	public void setPhoto(List<Photo> photo) {
		this.photo = photo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlickrPhotoset [primary=" + primary + ", server=" + server
				+ ", farm=" + farm + ", photos=" + photos + ", videos="
				+ videos + ", count_views=" + count_views + ", count_comments="
				+ count_comments + ", can_comment=" + can_comment + ", id="
				+ id + ", date_create=" + date_create + ", date_update="
				+ date_update + ", owner=" + owner + ", secret=" + secret
				+ ", title=" + title + ", description=" + description
				+ ", photo=" + photo + "]";
	}

}
