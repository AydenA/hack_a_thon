package com.wildcodeschool.Hackofthon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.Hackofthon.models.Card;
import com.wildcodeschool.Hackofthon.models.HearthOfThon;

@Controller
public class GameController {
	
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
		computerLife -= HearthOfThon.takeHit(playerDeck[Integer.valueOf(idMonster)],computerDeck[Integer.valueOf(idMonster)]);
		model.addAttribute("playerDeck", playerDeck);
		model.addAttribute("computerDeck", computerDeck);
		model.addAttribute("playerLife",playerLife);
		model.addAttribute("computerLife",computerLife);
		return "board2";
	}
}