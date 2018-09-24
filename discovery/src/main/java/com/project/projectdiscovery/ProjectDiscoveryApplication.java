package com.project.projectdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@RefreshScope
public class ProjectDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDiscoveryApplication.class, args);
	}
}
