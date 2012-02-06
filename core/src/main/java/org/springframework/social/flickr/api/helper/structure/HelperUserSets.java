package org.springframework.social.flickr.api.helper.structure;

public class HelperUserSets {
	private Integer created;
	private String remaining;

	/**
	 * @return the created
	 */
	public Integer getCreated() {
		return created;
	}

	/**
	 * @param created
	 *            the created to set
	 */
	public void setCreated(Integer created) {
		this.created = created;
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
		return "HelperUserSets [created=" + created + ", remaining="
				+ remaining + "]";
	}

}
