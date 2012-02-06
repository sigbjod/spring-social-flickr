/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.flickr.api.impl.json;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.module.SimpleModule;
import org.springframework.social.flickr.api.FlickrProfile;
import org.springframework.social.flickr.api.FlickrUser;
import org.springframework.social.flickr.api.Group;
import org.springframework.social.flickr.api.Photo;
import org.springframework.social.flickr.api.Photoset;
import org.springframework.social.flickr.api.Size;

public class FlickrModule extends SimpleModule {

	public FlickrModule() {
		super(FlickrModule.class.getName(), new Version(1, 0, 0, null));
	}

	@Override
	public void setupModule(SetupContext context) {
		context.setMixInAnnotations(Group.class, GroupMixin.class);
		context.setMixInAnnotations(Photo.class, PhotoMixin.class);
		context.setMixInAnnotations(Photoset.class, PhotosetMixin.class);
		context.setMixInAnnotations(FlickrProfile.class,
				FlickrProfileMixin.class);
		context.setMixInAnnotations(FlickrUser.class, FlickrUserMixin.class);
		context.setMixInAnnotations(Size.class, SizeMixin.class);
	}
}
