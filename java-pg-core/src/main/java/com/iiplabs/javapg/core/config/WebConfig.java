package com.iiplabs.javapg.core.config;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		String origins[] = { "http://localhost:8080" };

		registry.addMapping("/api/**")
				.allowedOrigins(origins)
				.allowedMethods("GET", "POST", "HEAD", "OPTIONS")
				.allowedHeaders("*")
				.allowCredentials(true);
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		ObjectMapper mapper = Jackson2ObjectMapperBuilder.json().defaultViewInclusion(true).build();
		converters.add(new MappingJackson2HttpMessageConverter(mapper));
	}

}
