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
import org.springframework.social.flickr.api.helper.structure.HelperProfilePhotos;

public class FlickrProfile extends FlickrUser {
	private Integer ispro, iconserver, iconfarm;
	private HelperStringParameter realname, mbox_sha1sum, location, photosurl,
			profileurl;
	private HelperProfilePhotos photos;

	/**
	 * @return the ispro
	 */
	@Override
	public Integer getIspro() {
		return ispro;
	}

	/**
	 * @param ispro
	 *            the ispro to set
	 */
	@Override
	public void setIspro(Integer ispro) {
		this.ispro = ispro;
	}

	/**
	 * @return the iconserver
	 */
	public Integer getIconserver() {
		return iconserver;
	}

	/**
	 * @param iconserver
	 *            the iconserver to set
	 */
	public void setIconserver(Integer iconserver) {
		this.iconserver = iconserver;
	}

	/**
	 * @return the iconfarm
	 */
	public Integer getIconfarm() {
		return iconfarm;
	}

	/**
	 * @param iconfarm
	 *            the iconfarm to set
	 */
	public void setIconfarm(Integer iconfarm) {
		this.iconfarm = iconfarm;
	}

	/**
	 * @return the realname
	 */
	public HelperStringParameter getRealname() {
		return realname;
	}

	/**
	 * @param realname
	 *            the realname to set
	 */
	public void setRealname(HelperStringParameter realname) {
		this.realname = realname;
	}

	/**
	 * @return the mbox_sha1sum
	 */
	public HelperStringParameter getMbox_sha1sum() {
		return mbox_sha1sum;
	}

	/**
	 * @param mbox_sha1sum
	 *            the mbox_sha1sum to set
	 */
	public void setMbox_sha1sum(HelperStringParameter mbox_sha1sum) {
		this.mbox_sha1sum = mbox_sha1sum;
	}

	/**
	 * @return the location
	 */
	public HelperStringParameter getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(HelperStringParameter location) {
		this.location = location;
	}

	/**
	 * @return the photosurl
	 */
	public HelperStringParameter getPhotosurl() {
		return photosurl;
	}

	/**
	 * @param photosurl
	 *            the photosurl to set
	 */
	public void setPhotosurl(HelperStringParameter photosurl) {
		this.photosurl = photosurl;
	}

	/**
	 * @return the profileurl
	 */
	public HelperStringParameter getProfileurl() {
		return profileurl;
	}

	/**
	 * @param profileurl
	 *            the profileurl to set
	 */
	public void setProfileurl(HelperStringParameter profileurl) {
		this.profileurl = profileurl;
	}

	/**
	 * @return the photos
	 */
	public HelperProfilePhotos getPhotos() {
		return photos;
	}

	/**
	 * @param photos
	 *            the photos to set
	 */
	public void setPhotos(HelperProfilePhotos photos) {
		this.photos = photos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlickrProfile [id=" + getId() + ", nsid=" + getNsid()
				+ ", username=" + getUsername() + ", ispro=" + ispro
				+ ", iconserver=" + iconserver + ", iconfarm=" + iconfarm
				+ ", realname=" + realname + ", mbox_sha1sum=" + mbox_sha1sum
				+ ", location=" + location + ", photosurl=" + photosurl
				+ ", profileurl=" + profileurl + ", photos=" + photos + "]";
	}
}
