/*
 * Copyright 2002 - 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package HSPC_CDS_Hook.configuration;

import Help.services.rest.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import uk.org.lidalia.sysoutslf4j.context.SysOutOverSLF4J;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan("com.wc.walter.qa.common.services")
@PropertySources({
        @PropertySource("classpath:properties/env/${app_env}.properties"),
        @PropertySource("classpath:properties/endpoint/${app_env}-endpoint.properties"),
        @PropertySource("classpath:properties/core/webdrivermanager.properties")
})
public class AppConfig {
    @Autowired
    private Environment env;

    @Value("${rpEnabled:false}")
    private String reportPortalProviderEnabled;

    @Bean
    public static PropertySourcesPlaceholderConfigurer PropertySourcesPlaceholderConfigurer() {
        SysOutOverSLF4J.sendSystemOutAndErrToSLF4J();
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public RestService getRestService() {
        return new RestService();
    }


}
