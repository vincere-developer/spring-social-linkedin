/*
 * Copyright 2014 the original author or authors.
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
package org.springframework.social.linkedin.api.impl.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ShareContentMixin extends LinkedInObjectMixin {
	
	@JsonCreator
	ShareContentMixin(@JsonProperty("author") String description, 
		@JsonProperty("eyebrowUrl") String eyebrowUrl, 
		@JsonProperty("shortenedUrl") String shortenedUrl,
		@JsonProperty("submittedImageUrl") String submittedImageUrl,
		@JsonProperty("submittedUrl") String submittedUrl, 
		@JsonProperty("thumbnailUrl") String thumbnailUrl, 
		@JsonProperty("title") String title) {}

}