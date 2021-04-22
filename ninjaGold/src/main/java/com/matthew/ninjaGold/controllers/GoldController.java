package com.matthew.ninjaGold.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoldController {
	@RequestMapping("/")
	public String gold(HttpSession session, Model viewModel) {
		ArrayList<String> activity = new ArrayList<String>();
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		if(session.getAttribute("activity") == null) {
			session.setAttribute("activity", activity);
		}
		viewModel.addAttribute("totalGold", session.getAttribute("gold"));
		viewModel.addAttribute("activity", session.getAttribute("activity"));
		return "index.jsp";
	}
	
	// the same exact thing as saying @RequestMapping(value="/findGold", method=RequestMethod.POST) but shorter
	@PostMapping("/findGold")
	public String findGold(@RequestParam("building") String building, HttpSession session) {
		int goldThisTurn;
		int gold = (int)session.getAttribute("gold");
		

		ArrayList<String> activity = (ArrayList<String>)session.getAttribute("activity");
		Random r = new Random();
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd YYYY h:mma");
		if(building.equals("farm")) {
			// do farm stuff
			goldThisTurn = r.nextInt((20-10) + 1) + 10;
			activity.add(String.format("You entered a %s and earned %d gold %s \n", building, goldThisTurn, formatter.format(now)));
		} else if(building.equals("cave")) {
			// do cave stuff
			goldThisTurn = r.nextInt((10-5) + 1) + 5;
			activity.add(String.format("You entered a %s and earned %d gold %s \n", building, goldThisTurn, formatter.format(now)));
		} else if(building.equals("house")) {
			// do house stuff
			goldThisTurn = r.nextInt((5-2) + 1) + 2;
			activity.add(String.format("You entered a %s and earned %d gold %s \n", building, goldThisTurn, formatter.format(now)));
		} else {
			// do casino stuff
			goldThisTurn = r.nextInt((50 + 50) + 1) - 50;
			if(goldThisTurn > 0) {
				activity.add(String.format("You entered a %s and earned %d gold %s \n", building, goldThisTurn, formatter.format(now)));
			} else {
				activity.add(String.format("You entered a %s and lost %d gold ouch! %s \n", building, goldThisTurn, formatter.format(now)));

			}
			
		}
		int totalGold = gold += goldThisTurn;
		session.setAttribute("gold", totalGold);
		session.setAttribute("activity", activity);
		return "redirect:/";
	}
}
