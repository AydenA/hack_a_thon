package com.wildcodeschool.Hackofthon.models;

public class Deck{
	
	private Card card;
	private ArrayList<Card> cardsDeck;
	private final static String JSON_MONSTERS_PATH = "monsters.json";
	
	public deck() {
		
		ObjectMapper objectMapper = new ObjectMapper();
		try {
		    JsonNode root = objectMapper.readTree(new File(JSON_MONSTERS_PATH));	    
		    for (int i = 0 ; i < root.size() ; i++) {
		    	card = objectMapper.convertValue(root.get(i), Card.class);
		    	this.cardsDeck.add(card);
		    }
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

}