/*
 * Copyright 2017 the original author or authors.
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
package org.springframework.cloud.dataflow.rest;

/**
 *
 * @author Ilayaperumal Gopinathan
 */
public class SkipperStream {

	public static final String SKIPPER_STREAM_PREFIX = "scdf_";

	public static final String USE_SKIPPER = "useSkipper";

	public static final String SKIPPER_KEY_PREFIX = "spring.cloud.dataflow.skipper";

	public static final String SKIPPER_PACKAGE_NAME = SKIPPER_KEY_PREFIX + ".packageName";

	public static final String SKIPPER_PACKAGE_VERSION = SKIPPER_KEY_PREFIX + ".packageVersion";

	public static final String SKIPPER_REPO_NAME = SKIPPER_KEY_PREFIX + ".repoName";

	public static final String SKIPPER_PLATFORM_NAME = SKIPPER_KEY_PREFIX + ".platformName";

	public static final String SKIPPER_ENABLED_PROPERTY_KEY = SKIPPER_KEY_PREFIX + ".enabled";

	public static final String SKIPPER_DEFAULT_API_VERSION = "skipper/v1";

	public static final String SKIPPER_DEFAULT_KIND = "SpringBootApp";

	public static final String SKIPPER_DEFAULT_MAINTAINER = "dataflow";
}
