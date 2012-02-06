package org.springframework.social.flickr.api;

import java.util.List;

public class PhotosetList {
	private Integer page, pages, perpage, total, cancreate;
	private List<Photoset> photoset;

	/**
	 * @return the page
	 */
	public Integer getPage() {
		return page;
	}

	/**
	 * @param page
	 *            the page to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * @return the pages
	 */
	public Integer getPages() {
		return pages;
	}

	/**
	 * @param pages
	 *            the pages to set
	 */
	public void setPages(Integer pages) {
		this.pages = pages;
	}

	/**
	 * @return the perpage
	 */
	public Integer getPerpage() {
		return perpage;
	}

	/**
	 * @param perpage
	 *            the perpage to set
	 */
	public void setPerpage(Integer perpage) {
		this.perpage = perpage;
	}

	/**
	 * @return the total
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * @return the cancreate
	 */
	public Integer getCancreate() {
		return cancreate;
	}

	/**
	 * @param cancreate
	 *            the cancreate to set
	 */
	public void setCancreate(Integer cancreate) {
		this.cancreate = cancreate;
	}

	/**
	 * @return the photoset
	 */
	public List<Photoset> getPhotoset() {
		return photoset;
	}

	/**
	 * @param photoset
	 *            the photoset to set
	 */
	public void setPhotoset(List<Photoset> photoset) {
		this.photoset = photoset;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlickrPhotosetList [page=" + page + ", pages=" + pages
				+ ", perpage=" + perpage + ", total=" + total + ", cancreate="
				+ cancreate + ", photoset=" + photoset + "]";
	}

}
