package com.James.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class BlogApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run =  SpringApplication.run(BlogApplication.class, args);
//		String[] names = run.getBeanDefinitionNames();
//		for (String name : names) {
//			System.out.println(name);
//		}
	}

}
