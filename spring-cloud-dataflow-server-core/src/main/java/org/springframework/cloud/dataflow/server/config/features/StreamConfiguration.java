/*
 * Copyright 2016 the original author or authors.
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
package org.springframework.cloud.dataflow.server.config.features;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.dataflow.completion.RecoveryStrategy;
import org.springframework.cloud.dataflow.completion.StreamCompletionProvider;
import org.springframework.cloud.dataflow.core.StreamDefinitionService;
import org.springframework.cloud.dataflow.server.completion.TapOnDestinationRecoveryStrategy;
import org.springframework.cloud.dataflow.server.repository.StreamDefinitionRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ilayaperumal Gopinathan
 */
@Configuration
@ConditionalOnStreamsEnabled
public class StreamConfiguration {

	@Bean
	@ConditionalOnMissingBean(TapOnDestinationRecoveryStrategy.class)
	public RecoveryStrategy<?> tapOnDestinationExpansionStrategy(StreamCompletionProvider streamCompletionProvider,
			StreamDefinitionRepository streamDefinitionRepository, StreamDefinitionService streamDefinitionService) {
		RecoveryStrategy<?> recoveryStrategy = new TapOnDestinationRecoveryStrategy(streamDefinitionRepository, streamDefinitionService);
		streamCompletionProvider.addCompletionRecoveryStrategy(recoveryStrategy);
		return recoveryStrategy;
	}
}
