package com.softtek.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorServiceConsumingRunner  implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		 // s1= create the obj of rest template class 
		RestTemplate Template = new RestTemplate();
		
		// define service url
		String serviceurl="http://localhost:8080/SpringRest-Proj11-providerApp/Actor/wish";
		
		//generate http request with get mode to consume the web service API
		ResponseEntity<String> response = Template.getForEntity(serviceurl, String.class);
		
		// display the received details from the response 
		System.out.println("Response body(Output) " +response.getBody());
		System.out.println("Response COde value" +response.getStatusCodeValue());
		System.err.println(response.getStatusCode().name());
		
		
		
		
	}

}
