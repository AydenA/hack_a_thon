package com.wildcodeschool.Hackofthon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.Hackofthon.models.Card;
import com.wildcodeschool.Hackofthon.models.HearthOfThon;

@Controller
public class GameController {
	
	private int turnCount = 1;
	private static Card[] computerDeck = HearthOfThon.createOrdiDeck();
	private static Card[] playerDeck = HearthOfThon.createPlayerDeck();
	
	@GetMapping("/") 
	public String indexController() {
		
		return "index";
	}
	
	
	@GetMapping("/board")
	public String firstTurnController(Model model, @RequestParam String cardnum, @RequestParam String attack) {		
		
		if (Integer.parseInt(cardnum) == 1 && turnCount == 1) {
			Card computerCard = computerDeck[0];
			Card playerCard = playerDeck[0];
			model.addAttribute("computercard", computerCard);
			model.addAttribute("playercard1", playerCard);
			turnCount ++;
			return "board";
		}
		
		if (Integer.parseInt(cardnum) == 1 && turnCount == 2) {
			
			Card playerCard = playerDeck[1];
			model.addAttribute("playercard2", playerCard);
			return "board";
		}
		
		if (Integer.parseInt(attack) == 1) {
			int damageDeal = HearthOfThon.takeHit();
			
		}
	}
	
	
}