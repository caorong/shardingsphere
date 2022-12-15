/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.agent.core.config.validator;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.agent.config.plugin.PluginConfiguration;

/**
 * Plugin configuration validator.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class PluginConfigurationValidator {
    
    /**
     * Validate plugin configuration.
     * 
     * @param type plugin type 
     * @param pluginConfig to be validated plugin configuration
     */
    public static void validate(final String type, final PluginConfiguration pluginConfig) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(pluginConfig.getHost()), "Hostname of %s is required.", type);
        Preconditions.checkArgument(pluginConfig.getPort() > 0, "Port `%s` of %s must be a positive number.", pluginConfig.getPort(), type);
    }
}
