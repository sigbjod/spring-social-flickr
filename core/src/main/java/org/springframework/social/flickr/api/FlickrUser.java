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
package org.springframework.social.flickr.api;

import org.springframework.social.flickr.api.helper.parameter.HelperStringParameter;
import org.springframework.social.flickr.api.helper.structure.HelperUserBandwidth;
import org.springframework.social.flickr.api.helper.structure.HelperUserFilesize;
import org.springframework.social.flickr.api.helper.structure.HelperUserSets;
import org.springframework.social.flickr.api.helper.structure.HelperUserVideos;

public class FlickrUser {
	private String id, nsid;
	private Integer ispro;
	private HelperStringParameter username;
	private HelperUserBandwidth bandwidth;
	private HelperUserFilesize filesize;
	private HelperUserSets sets;
	private HelperUserVideos videos;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNsid() {
		return nsid;
	}

	public void setNsid(String nsid) {
		this.nsid = nsid;
	}

	/**
	 * @return the ispro
	 */
	public Integer getIspro() {
		return ispro;
	}

	/**
	 * @param ispro
	 *            the ispro to set
	 */
	public void setIspro(Integer ispro) {
		this.ispro = ispro;
	}

	/**
	 * @return the username
	 */
	public HelperStringParameter getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(HelperStringParameter username) {
		this.username = username;
	}

	/**
	 * @return the bandwidth
	 */
	public HelperUserBandwidth getBandwidth() {
		return bandwidth;
	}

	/**
	 * @param bandwidth
	 *            the bandwidth to set
	 */
	public void setBandwidth(HelperUserBandwidth bandwidth) {
		this.bandwidth = bandwidth;
	}

	/**
	 * @return the filesize
	 */
	public HelperUserFilesize getFilesize() {
		return filesize;
	}

	/**
	 * @param filesize
	 *            the filesize to set
	 */
	public void setFilesize(HelperUserFilesize filesize) {
		this.filesize = filesize;
	}

	/**
	 * @return the sets
	 */
	public HelperUserSets getSets() {
		return sets;
	}

	/**
	 * @param sets
	 *            the sets to set
	 */
	public void setSets(HelperUserSets sets) {
		this.sets = sets;
	}

	/**
	 * @return the videos
	 */
	public HelperUserVideos getVideos() {
		return videos;
	}

	/**
	 * @param videos
	 *            the videos to set
	 */
	public void setVideos(HelperUserVideos videos) {
		this.videos = videos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlickrUser [id=" + id + ", nsid=" + nsid + ", ispro=" + ispro
				+ ", username=" + username + ", bandwidth=" + bandwidth
				+ ", filesize=" + filesize + ", sets=" + sets + ", videos="
				+ videos + "]";
	}
}
