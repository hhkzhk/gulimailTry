package com.atguigu.gulimall.thirdpart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GilimallThirdPartApplication {

	public static void main(String[] args) {
		SpringApplication.run(GilimallThirdPartApplication.class, args);
	}

}
