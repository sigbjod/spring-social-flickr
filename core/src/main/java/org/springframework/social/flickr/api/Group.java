package org.springframework.social.flickr.api;

public class Group {
	private Integer admin, eigtheenplus, invitation_only;
	private String nsid, name;

	/**
	 * @return the admin
	 */
	public Integer getAdmin() {
		return admin;
	}

	/**
	 * @param admin
	 *            the admin to set
	 */
	public void setAdmin(Integer admin) {
		this.admin = admin;
	}

	/**
	 * @return the eigtheenplus
	 */
	public Integer getEigtheenplus() {
		return eigtheenplus;
	}

	/**
	 * @param eigtheenplus
	 *            the eigtheenplus to set
	 */
	public void setEigtheenplus(Integer eigtheenplus) {
		this.eigtheenplus = eigtheenplus;
	}

	/**
	 * @return the invitation_only
	 */
	public Integer getInvitation_only() {
		return invitation_only;
	}

	/**
	 * @param invitation_only
	 *            the invitation_only to set
	 */
	public void setInvitation_only(Integer invitation_only) {
		this.invitation_only = invitation_only;
	}

	/**
	 * @return the nsid
	 */
	public String getNsid() {
		return nsid;
	}

	/**
	 * @param nsid
	 *            the nsid to set
	 */
	public void setNsid(String nsid) {
		this.nsid = nsid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlickrGroup [admin=" + admin + ", eigtheenplus=" + eigtheenplus
				+ ", invitation_only=" + invitation_only + ", nsid=" + nsid
				+ ", name=" + name + "]";
	}

}
