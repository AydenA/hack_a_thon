package com.wildcodeschool.Hackofthon;

public class Fight {
	
	private static int takeHit(Card card1, Card card2) {
		
		int damageDeal= card2.getAttack();
		
		card1.setLife((card1.getLife()+card1.getDefense())-card2.getAttack());
		return damageDeal;

		
	}
}