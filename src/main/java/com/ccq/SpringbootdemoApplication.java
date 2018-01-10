package com.ccq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootdemoApplication {

	/**
	 * 热部署方式1：-javaagent:I:\IDEA2017-02\lib\springloaded-1.2.6.RELEASE.jar -noverify
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
}
