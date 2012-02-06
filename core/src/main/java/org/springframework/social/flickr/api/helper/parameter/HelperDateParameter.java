package org.springframework.social.flickr.api.helper.parameter;

import java.util.Date;

public class HelperDateParameter {
	private Date _content;

	/**
	 * @return the _content
	 */
	public Date get_content() {
		return _content;
	}

	/**
	 * @param _content
	 *            the _content to set
	 */
	public void set_content(Date _content) {
		this._content = _content;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return _content.toString();
	}
}
