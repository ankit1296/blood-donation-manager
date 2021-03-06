package com.apk.donationManager.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	public Docket getApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Plasma/Blood donation API")
				.description("Plasma/Blood donation API reference for developers")
				.termsOfServiceUrl("http://plasmadonation.com")
				.contact("karveankit40@gmail.com").license("Plasma/Blood donation License")
				.licenseUrl("karveankit40@gmail.com").version("1.0").build();
	}

}
