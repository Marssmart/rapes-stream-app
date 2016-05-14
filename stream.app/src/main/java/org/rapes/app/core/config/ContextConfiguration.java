package org.rapes.app.core.config;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
	
	public static final String BASIC_HTTP_CLIENT="BASIC_HTTP_CLIENT";
	
	@Bean(name=BASIC_HTTP_CLIENT)
	public HttpClient basicClient(){
		return HttpClientBuilder.create().build();
	}
}

