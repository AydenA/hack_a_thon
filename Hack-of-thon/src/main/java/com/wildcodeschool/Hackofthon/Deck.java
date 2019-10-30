package com.wildcodeschool.Hackofthon;

import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class Deck{
	
	private Card card;
	private ArrayList<Card> cardsDeck;
	
	public Deck() {
		
		String url = "https://hackathon-wild-hackoween.herokuapp.com/monsters";
		WebClient webClient = WebClient.create(url);
		Mono<String> call = webClient.get().retrieve().bodyToMono(String.class);
		String response = call.block();
		ObjectMapper objectMapper = new ObjectMapper();
		try {
		    JsonNode root = objectMapper.readTree(response);	    
		    for (int i = 0 ; i < root.size() ; i++) {
		    	card = objectMapper.convertValue(root.get(i), Card.class);
		    	this.cardsDeck.add(card);
		    }
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
