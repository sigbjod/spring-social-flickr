package org.springframework.social.flickr.api.helper.structure;

public class HelperUserBandwidth {
	private Long maxbytes, maxkb, usedbytes, usedkb, remainingbytes;

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

	/**
	 * @return the usedbytes
	 */
	public Long getUsedbytes() {
		return usedbytes;
	}

	/**
	 * @param usedbytes
	 *            the usedbytes to set
	 */
	public void setUsedbytes(Long usedbytes) {
		this.usedbytes = usedbytes;
	}

	/**
	 * @return the usedkb
	 */
	public Long getUsedkb() {
		return usedkb;
	}

	/**
	 * @param usedkb
	 *            the usedkb to set
	 */
	public void setUsedkb(Long usedkb) {
		this.usedkb = usedkb;
	}

	/**
	 * @return the remainingbytes
	 */
	public Long getRemainingbytes() {
		return remainingbytes;
	}

	/**
	 * @param remainingbytes
	 *            the remainingbytes to set
	 */
	public void setRemainingbytes(Long remainingbytes) {
		this.remainingbytes = remainingbytes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HelperUserBandwidth [maxbytes=" + maxbytes + ", maxkb=" + maxkb
				+ ", usedbytes=" + usedbytes + ", usedkb=" + usedkb
				+ ", remainingbytes=" + remainingbytes + "]";
	}

}
