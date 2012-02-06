package org.springframework.social.flickr.api;

import java.util.Date;

public class Photo {
	private Long id;
	private Integer server, farm, ispublic, isfriend, isfamily;
	private String owner, secret, title;

	// TODO See how to integrate extras
	// license, date_upload, date_taken, owner_name, icon_server, original_format, last_update, geo, tags, machine_tags, o_dims, views, media, path_alias, url_sq, url_t, url_s, url_m, url_o
	private Date date_taken;

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
	 * @return the ispublic
	 */
	public Integer getIspublic() {
		return ispublic;
	}

	/**
	 * @param ispublic
	 *            the ispublic to set
	 */
	public void setIspublic(Integer ispublic) {
		this.ispublic = ispublic;
	}

	/**
	 * @return the isfriend
	 */
	public Integer getIsfriend() {
		return isfriend;
	}

	/**
	 * @param isfriend
	 *            the isfriend to set
	 */
	public void setIsfriend(Integer isfriend) {
		this.isfriend = isfriend;
	}

	/**
	 * @return the isfamily
	 */
	public Integer getIsfamily() {
		return isfamily;
	}

	/**
	 * @param isfamily
	 *            the isfamily to set
	 */
	public void setIsfamily(Integer isfamily) {
		this.isfamily = isfamily;
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
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
	 * @return the date_taken
	 */
	public Date getDate_taken() {
		return date_taken;
	}

	/**
	 * @param date_taken
	 *            the date_taken to set
	 */
	public void setDate_taken(Date date_taken) {
		this.date_taken = date_taken;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Photo [id=" + id + ", server=" + server + ", farm=" + farm
				+ ", ispublic=" + ispublic + ", isfriend=" + isfriend
				+ ", isfamily=" + isfamily + ", owner=" + owner + ", secret="
				+ secret + ", title=" + title + ", date_taken=" + date_taken
				+ "]";
	}
}
