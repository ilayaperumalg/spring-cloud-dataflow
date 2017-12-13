/*
 * Copyright 2015-2016 the original author or authors.
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

package org.springframework.cloud.dataflow.rest.resource;

import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.ResourceSupport;

/**
 * Rest resource for an app registration.
 *
 * @author Glenn Renfro
 * @author Mark Fisher
 * @author Patrick Peralta
 */
public class AppRegistrationResource extends ResourceSupport {

	/**
	 * App name.
	 */
	private String name;

	/**
	 * App type.
	 */
	private String type;

	/**
	 * URI for app resource, such as {@code maven://groupId:artifactId:version}.
	 */
	private String uri;

	/**
	 * App version.
	 */
	private String version;

	/**
	 * Is default app version for all (name, type) applications
	 */
	private boolean isDefault;


	/**
	 * Default constructor for serialization frameworks.
	 */
	protected AppRegistrationResource() {
	}

	public AppRegistrationResource(String name, String type, String uri) {
		this(name, type, "empty", uri, false);
	}

	/**
	 * Construct a {@code AppRegistrationResource}.
	 *
	 * @param name app name
	 * @param type app type
	 * @param version app version
	 * @param uri uri for app resource
	 * @param isDefault is this application selected to the be default version in DSL
	 */
	public AppRegistrationResource(String name, String type, String version, String uri, boolean isDefault) {
		this.name = name;
		this.type = type;
		this.version = version;
		this.uri = uri;
		this.isDefault = isDefault;
	}

	/**
	 * @return the name of the app
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return type type of the app
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return type URI for the app resource
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @return version of the app
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @return if this app selected to be the default
	 */
	public boolean isDefault() {
		return isDefault;
	}

	/**
	 * Dedicated subclass to workaround type erasure.
	 */
	public static class Page extends PagedResources<AppRegistrationResource> {
	}

}
