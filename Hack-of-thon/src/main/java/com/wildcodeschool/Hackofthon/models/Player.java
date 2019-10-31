package com.wildcodeschool.Hackofthon.models;

import java.util.ArrayList;

public class Player {
	
	//Attributs
	private ArrayList<Card> hand;
	private double experience;
	private String name;
	private String rank;
	
	//constructeurs
	public Player(double experience, String name) {
		this.experience = experience;
		this.name = name;
	}
	
	//getter et setter
	
	public ArrayList<Card> getHand(){
		return this.hand;
	}
	
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	
	public double getExperience() {
		return this.experience;
	}
	
	public void setExperience(double experience) {
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