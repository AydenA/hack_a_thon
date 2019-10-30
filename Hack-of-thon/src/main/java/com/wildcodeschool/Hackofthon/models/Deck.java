package com.wildcodeschool.Hackofthon.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

		
public class Deck {
			

		static String url = "https://hackathon-wild-hackoween.herokuapp.com/monsters";
		private Card[] cardsList;
		
		private static Card[] createCards() {
			
			WebClient webClient = WebClient.create(url);
			Mono<String> call = webClient.get()
				      .retrieve()
			      .bodyToMono(String.class);
			String response = call.block();
			ObjectMapper objectMapper = new ObjectMapper();

			

			try {
				JsonNode root = objectMapper.readTree(response);

				} 
				catch (IOException e) {
				   e.printStackTrace();

				}
			
			Card[] cards = null;

			try {

				JsonNode monster = objectMapper.readTree(response).get("monsters");

			   cards = objectMapper.convertValue(monster, Card[].class);
			} 
			
			catch (IOException e) {

			   e.printStackTrace();

			}
			
			return cards;

		}


}

