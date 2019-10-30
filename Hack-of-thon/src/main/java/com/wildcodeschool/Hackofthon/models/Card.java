package com.wildcodeschool.Hackofthon.models;


public class Card() {
	
	private int id;
	private String name;
	private String level;
	private int attack;
	private int defense;
	private int life = 0;
	private String special;
	private String description;
	private String picture;
	
	
	public Card(int id, String name, String level, int attack, int defense, int life, String special, String description, String picture) {
		
		this.id = id;
		this.name = name;
		this.level = level;
		this.attack = attack;
		this.defense = defense;
		this.life = life;
		this.special = special;
		this.description = description;
		this.picture = picture;
	}
	
	
	public int getId() {
		
		return this.id;
	}
	
	
	public int getName() {
			
		return this.name;
	}
	
	
	public String getlevel() {
		
		return this.level;
	}
	
	
	public int getAttack() {
		
		return this.attack;
	}
	
	
	public int getDefense() {
		
		return this.defense;
	}
	
	
	public int getLife() {
		
		return this.life;
	}
	
	
	public String getSpecial() {
		
		return this.special;
	}
	
	
	public String getDescription() {
			
		return this.description;
	}
	
	
	public String getPicture() {
		
		return this.getPicture;
	}
	
	
	public void setId(int id) {
		
		this.id = id;
	}
	
	
	public void setName(int name) {
		
		this.name = name;
	}
	
	
	public void setLevel(String level) {
		
		this.level = level;
	}
	
	
	public void setAttack(int attack) {
		
		this.attack = attack;
	}
	
	
	public void setDefense(int defense) {
		
		this.defense = defense;
	}
	
	
	public void setLife(int life) {
		
		this.life = life;
	}
	
	public void setSpecial(String special) {
		
		this.special = special;
	}
	
	
	public void setDescription(String description) {
		
		this.description = description;
	}
	
	
	public void setPicture(String picture) {
		
		this.id = id;
	}	
	
}

