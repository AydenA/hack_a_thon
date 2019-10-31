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
		HearthOfThon.deckShuffle(playerDeck);
		HearthOfThon.deckShuffle(computerDeck);
		model.addAttribute("playerDeck", playerDeck);
		model.addAttribute("computerDeck", computerDeck);
		return "board";
	}
	
	@GetMapping("/board2")
	public String secondTurnController(Model model) {
		Card[] playerDeck = HearthOfThon.createPlayerDeck();
		Card[] computerDeck = HearthOfThon.createComputerDeck();
		HearthOfThon.deckShuffle(playerDeck);
		HearthOfThon.deckShuffle(computerDeck);
		model.addAttribute("playerDeck", playerDeck);
		model.addAttribute("computerDeck", computerDeck);
		/*model.addAttribute("playerDeck", Deck.getPlayerDeck());
		model.addAttribute("computerDeck", Deck.getComputerDeck());*/
		return "board2";
	}
}