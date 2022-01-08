package io.excellence.discoveryservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaClient
public class DiscoveryService1Application {
	
	@RequestMapping("/")
    public String home() {
        return "Hello world";
    }
	

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryService1Application.class, args);
		
	}

}
