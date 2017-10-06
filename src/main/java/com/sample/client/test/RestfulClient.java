package com.sample.client.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sample.newfeaturerequestmapping.model.Customer;

public class RestfulClient {
	RestTemplate restTemplate;
	
	public RestfulClient(){
		restTemplate = new RestTemplate();
	}
	
	/**
	 * post entity
	 */
	public void postEntity(){
		System.out.println("Begin /POST request!");
		String postUrl = "http://localhost:8081/SpringMVRequestMapping/customer/post";
		Customer customer = new Customer(123, "Jack","dong", 23);
		ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, customer, String.class);
		System.out.println("Response for Post Request: " + postResponse.getBody());
	}
	
	
	/**
	 * get entity
	 */
	public void getEntity(){
		System.out.println("Begin /GET request!");
		String getUrl = "http://localhost:8081/SpringMVRequestMapping/customer/get?custId=1";
		ResponseEntity<Customer> getResponse = restTemplate.getForEntity(getUrl, Customer.class);
		if(getResponse.getBody() != null){
			System.out.println("Response for Get Request: " + getResponse.getBody().toString());	
		}else{
			System.out.println("Response for Get Request: NULL");
		}
	}
	
	/**
	 * put entity
	 */
	public void putEntity(){
		System.out.println("Begin /PUT request!");
		String putUrl = "http://localhost:8081/SpringMVRequestMapping/customer/put/2";
		Customer puttCustomer = new Customer(123, "Ittipol","dong", 23);
		restTemplate.put(putUrl, puttCustomer);
	}
	
	/**
	 * delete entity
	 */
	public void deleteEntity(){
		System.out.println("Begin /DELETE request!");
		String deleteUl = "http://localhost:8081/SpringMVRequestMapping/customer/delete/1";
		restTemplate.delete(deleteUl);
	}
}
