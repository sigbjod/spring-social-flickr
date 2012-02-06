package org.springframework.social.flickr.api.impl.json;

import java.util.List;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.flickr.api.Group;

@JsonDeserialize(using = GroupListContainerDeserializer.class)
public class GroupListContainer {
	private final List<Group> groups;

	public GroupListContainer(List<Group> groups) {
		this.groups = groups;
	}

	public List<Group> getGroups() {
		return groups;
	}
}
