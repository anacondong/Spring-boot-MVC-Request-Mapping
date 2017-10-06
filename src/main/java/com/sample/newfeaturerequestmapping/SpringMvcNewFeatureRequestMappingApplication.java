package com.sample.newfeaturerequestmapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sample.client.test.RestfulClient;

@SpringBootApplication
public class SpringMvcNewFeatureRequestMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcNewFeatureRequestMappingApplication.class, args);
		
			RestfulClient restfulClient = new RestfulClient();
			/*
			 *POST ENTITY 
			 */
			restfulClient.postEntity();
			
			/*
			 * GET ENTITY
			 */
			restfulClient.getEntity();
			
			/*
			 * PUT ENTITY
			 */
			restfulClient.putEntity();
			
			/*
			 * DELETE ENTITY 
			 */
			restfulClient.deleteEntity();
	}
}
