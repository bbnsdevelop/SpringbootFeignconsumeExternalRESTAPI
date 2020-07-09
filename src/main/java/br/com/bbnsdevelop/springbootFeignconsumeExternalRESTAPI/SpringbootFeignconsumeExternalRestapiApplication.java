package br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringbootFeignconsumeExternalRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFeignconsumeExternalRestapiApplication.class, args);
	}

}
