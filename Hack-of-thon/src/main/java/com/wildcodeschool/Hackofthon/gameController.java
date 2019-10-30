package com.wildcodeschool.Hackofthon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class gameController {
	
	
	@GetMapping("/") 
	public String indexController() {
		
		return "index";
	}
	
	
	@GetMapping("/board")
	public String firstTurnController(Model model, @RequestParam String card) {

		return "board";
	}
	
	
	@GetMapping("/board/$card=2")
	public String fightController(Model model, @RequestParam String card) {
		
		
/*		Card computercard = HearthOfThon.createPlayerDeck();
		Card playercard = 
		model.addAttribute("computercard", computercard);
		model.addAttribute("playercard", playercard); */
	}
}