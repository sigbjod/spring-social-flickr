package org.springframework.social.flickr.api;

import java.util.List;

public class PhotoList {
	private Integer page, pages, perpage, total, has_next_page;
	private List<Photo> photos;

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
	 * @return the has_next_page
	 */
	public Integer getHas_next_page() {
		return has_next_page;
	}

	/**
	 * @param has_next_page
	 *            the has_next_page to set
	 */
	public void setHas_next_page(Integer has_next_page) {
		this.has_next_page = has_next_page;
	}

	/**
	 * @return the photos
	 */
	public List<Photo> getPhotos() {
		return photos;
	}

	/**
	 * @param photos
	 *            the photos to set
	 */
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlickrPhotoList [page=" + page + ", pages=" + pages
				+ ", perpage=" + perpage + ", total=" + total
				+ ", has_next_page=" + has_next_page + ", photos=" + photos
				+ "]";
	}

}
