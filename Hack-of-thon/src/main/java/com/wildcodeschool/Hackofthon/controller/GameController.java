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
		Card[] computerDeck = HearthOfThon.createOrdiDeck();
		model.addAttribute("playerDeck", playerDeck);
		model.addAttribute("computerDeck", computerDeck);
		return "board";
	}
}