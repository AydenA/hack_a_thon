package com.wildcodeschool.Hackofthon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.Hackofthon.models.Card;
import com.wildcodeschool.Hackofthon.models.HearthOfThon;

@Controller
public class GameController {
	
	@GetMapping("/") 
	public String indexController() {
		
		return "index";
	}
	
	
	@GetMapping("/board")
	public String firstTurnController(Model model) {
		Card[] playerDeck = HearthOfThon.createPlayerDeck();
		Card[] computerDeck = HearthOfThon.createComputerDeck();
		model.addAttribute("playerDeck", playerDeck);
		model.addAttribute("computerDeck", computerDeck);
		model.addAttribute("playerLife",HearthOfThon.getPlayerLife());
		model.addAttribute("computerLife",HearthOfThon.getComputerLife());
		return "board";
	}
	
	@GetMapping("/board2")
	public String secondTurnController(Model model, @RequestParam(value="idMonster",
			required=true) String idMonster) {
		Card[] playerDeck = HearthOfThon.getPlayerDeck();
		Card[] computerDeck = HearthOfThon.getComputerDeck();
		model.addAttribute("playerDeck", playerDeck);
		model.addAttribute("computerDeck", computerDeck);
		model.addAttribute("playerLife",HearthOfThon.getPlayerLife());
		model.addAttribute("computerLife",HearthOfThon.getComputerLife());
		HearthOfThon.takeHit(playerDeck[1], computerDeck[1]);
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