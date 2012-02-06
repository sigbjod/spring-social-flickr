package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.flickr.api.Group;

@JsonDeserialize(using = GroupContainerDeserializer.class)
public class GroupContainer {
	private final Group group;

	public GroupContainer(Group group) {
		this.group = group;
	}

	public Group getGroup() {
		return group;
	}

}
