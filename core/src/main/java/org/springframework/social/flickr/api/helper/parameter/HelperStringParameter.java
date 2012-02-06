package org.springframework.social.flickr.api.helper.parameter;

public class HelperStringParameter {
	private String _content;

	/**
	 * @return the _content
	 */
	public String get_content() {
		return _content;
	}

	/**
	 * @param _content
	 *            the _content to set
	 */
	public void set_content(String _content) {
		this._content = _content;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return _content;
	}
}
