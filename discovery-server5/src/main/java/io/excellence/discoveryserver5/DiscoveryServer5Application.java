package io.excellence.discoveryserver5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServer5Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServer5Application.class, args);
	}

}
