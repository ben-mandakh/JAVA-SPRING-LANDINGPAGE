///////// BEGINNING /////////////////////////////////////////

package com.codingdojo.landingpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

///////// IMPORT FOR MAPPING AND CONTROLLER /////////////////

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

///////// RESTCONTROLLER /////////////////////////////////////

@RestController
public class LandingPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(LandingPageApplication.class, args);
	}
///////// ROUTE FOR LOCALHOST:8080 ///////////////////////////
	
	@RequestMapping("/")
	public String greeting() {
		return "<h4> Hello client! How are you doing?  </h4>";
	}
///////// ROUTE FOR LOCALHOST:8080/random ////////////////////
	
	@RequestMapping("/random")
	public String greeting2() {
		return "<h4> Spring Boot is great! So easy to just respond with strings  </h4>";
	}

}

///////// END /////////////////////////////////////////////////
