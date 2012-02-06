package org.springframework.social.flickr.api.helper.structure;

import org.springframework.social.flickr.api.helper.parameter.HelperDateParameter;
import org.springframework.social.flickr.api.helper.parameter.HelperIntegerParameter;
import org.springframework.social.flickr.api.helper.parameter.HelperLongParameter;

public class HelperProfilePhotos {
	private HelperLongParameter firstdate;
	private HelperDateParameter firstdatetaken;
	private HelperIntegerParameter count;

	/**
	 * @return the firstdate
	 */
	public HelperLongParameter getFirstdate() {
		return firstdate;
	}

	/**
	 * @param firstdate
	 *            the firstdate to set
	 */
	public void setFirstdate(HelperLongParameter firstdate) {
		this.firstdate = firstdate;
	}

	/**
	 * @return the firstdatetaken
	 */
	public HelperDateParameter getFirstdatetaken() {
		return firstdatetaken;
	}

	/**
	 * @param firstdatetaken
	 *            the firstdatetaken to set
	 */
	public void setFirstdatetaken(HelperDateParameter firstdatetaken) {
		this.firstdatetaken = firstdatetaken;
	}

	/**
	 * @return the count
	 */
	public HelperIntegerParameter getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(HelperIntegerParameter count) {
		this.count = count;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HelperProfilePhotos [firstdate=" + firstdate
				+ ", firstdatetaken=" + firstdatetaken + ", count=" + count
				+ "]";
	}

}
