package nic.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudVendorProducerWithRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudVendorProducerWithRibbonApplication.class, args);
	}

}
