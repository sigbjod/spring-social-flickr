package org.springframework.social.flickr.api.helper.structure;

public class HelperUserFilesize {
	private Long maxbytes, maxkb;

	/**
	 * @return the maxbytes
	 */
	public Long getMaxbytes() {
		return maxbytes;
	}

	/**
	 * @param maxbytes
	 *            the maxbytes to set
	 */
	public void setMaxbytes(Long maxbytes) {
		this.maxbytes = maxbytes;
	}

	/**
	 * @return the maxkb
	 */
	public Long getMaxkb() {
		return maxkb;
	}

	/**
	 * @param maxkb
	 *            the maxkb to set
	 */
	public void setMaxkb(Long maxkb) {
		this.maxkb = maxkb;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HelperUserFilesize [maxbytes=" + maxbytes + ", maxkb=" + maxkb
				+ "]";
	}

}
