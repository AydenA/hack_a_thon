package com.wildcodeschool.Hackofthon;

import java.util.ArrayList;

public class Player {
	
	//Attributs
	private ArrayList<Card> hand;
	private int experience;
	private String name;
	private String rank;
	
	//constructeurs
	public void player(ArrayList<Card> hand , int experience, String name, String rank) {
		this.hand = hand;
		this.experience = experience;
		this.name = name;
		this.rank = rank;
	}
	
	//getter et setter
	
	public ArrayList<Card> getHand(){
		return this.hand;
	}
	
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	
	public int getExperience() {
		return this.experience;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRank() {
		return this.rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
}