package org.springframework.social.flickr.api.helper.structure;

public class HelperUserVideos {
	private Integer uploaded;
	private String remaining;

	/**
	 * @return the uploaded
	 */
	public Integer getUploaded() {
		return uploaded;
	}

	/**
	 * @param uploaded
	 *            the uploaded to set
	 */
	public void setUploaded(Integer uploaded) {
		this.uploaded = uploaded;
	}

	/**
	 * @return the remaining
	 */
	public String getRemaining() {
		return remaining;
	}

	/**
	 * @param remaining
	 *            the remaining to set
	 */
	public void setRemaining(String remaining) {
		this.remaining = remaining;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HelperUserVideos [uploaded=" + uploaded + ", remaining="
				+ remaining + "]";
	}

}
