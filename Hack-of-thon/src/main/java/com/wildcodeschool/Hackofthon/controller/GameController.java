package com.wildcodeschool.Hackofthon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.Hackofthon.models.Card;
import com.wildcodeschool.Hackofthon.models.HearthOfThon;

@Controller
public class GameController {
	
	private static String displayMessage;
	private static Card[] playerDeck;
	private static Card[] computerDeck;
	private static int playerLife;
	private static int computerLife;
	
	@GetMapping("/") 
	public String indexController() {
		
		return "index";
	}
	
	
	@GetMapping("/board")
	public String firstTurnController(Model model) {
		playerDeck = HearthOfThon.createPlayerDeck();
		computerDeck = HearthOfThon.createComputerDeck();
		playerLife = HearthOfThon.getPlayerLife();
		computerLife = HearthOfThon.getComputerLife();
		model.addAttribute("playerDeck", playerDeck);
		model.addAttribute("computerDeck", computerDeck);
		model.addAttribute("playerLife",playerLife);
		model.addAttribute("computerLife",computerLife);
		return "board";
	}
	
	@GetMapping("/board2")
	public String secondTurnController(Model model, @RequestParam(value="idMonster",
			required=true) String idMonster) {
		int damageDeals = HearthOfThon.takeHit(computerDeck[Integer.valueOf(idMonster)],playerDeck[Integer.valueOf(idMonster)]);
		if (damageDeals < 0) {
			damageDeals = 0;
		}
		computerLife -= damageDeals;
		displayMessage = "Vous avez infligé" + damageDeals + "dégats.";
		if (computerDeck[Integer.valueOf(idMonster)].getLife() <= 0) {
			computerDeck[Integer.valueOf(idMonster)] = computerDeck[0];
		}
		if (playerLife <= 0) {
			return "defeat";
		}
		if (computerLife <= 0) {
			return "victory";
		}
		model.addAttribute("playerDeck", playerDeck);
		model.addAttribute("computerDeck", computerDeck);
		model.addAttribute("playerLife",playerLife);
		model.addAttribute("computerLife",computerLife);
		model.addAttribute("displayMessage", displayMessage);
		return "board2";
	}
	
	@GetMapping("/victory")
	public String returnVictory() {
		return "victory";
	}
	
	@GetMapping("/defeat")
	public String returnloose() {
		return "defeat";
	}
}