package com.te.springboot.configuration;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@org.springframework.context.annotation.Configuration
@EnableSwagger2
public class Configuration {

	@Bean
	public Docket superHeroApiDoc() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.te.springboot")).build();
	}
}
