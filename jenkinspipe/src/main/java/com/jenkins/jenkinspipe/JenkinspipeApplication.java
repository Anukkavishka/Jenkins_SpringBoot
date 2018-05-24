package com.jenkins.jenkinspipe;

import javax.xml.ws.RespectBinding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinspipeApplication {
	
	@ResponseBody
	@RequestMapping("/jenkins/")
	public String Respon() {
		
		return "Top of the morning to you sir!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinspipeApplication.class, args);
	}
}
