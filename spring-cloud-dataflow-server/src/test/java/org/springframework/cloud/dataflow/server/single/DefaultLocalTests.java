/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.dataflow.server.single;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author David Turanski
 * @author Corneil du Plessis
 **/
@SpringBootTest(classes = {DataFlowServerApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DefaultLocalTests {

	@Test
	void contextLoad() {
	}
}
