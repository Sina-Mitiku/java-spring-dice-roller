package com.example.challenge.javaspringdiceroller.controllers;

import com.example.challenge.javaspringdiceroller.models.DiceRoll;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class RollsController {
  @GetMapping("/rolls/new")
  public String getNew(@RequestParam(required = false) Integer guess, @RequestParam(required = false) Integer diceCount, Model model) {
    //Implement your logic here
   DiceRoll newDiceRoll = new DiceRoll();
   int diceRoll = 0;
   String guessResult = "";

   if (diceCount == null) {
     diceCount = 1;
   }
   for(int i = 1; i <= diceCount; i++) {
     diceRoll += newDiceRoll.getRandomNumber();
   }

   if (guess != null && guess == diceRoll){
     guessResult += "YOU GUESSED THE NUMBER";
   } else if(guess != null && guess < diceRoll) {
     guessResult += "Nope. Sorry. Tyr Again";
   } else if(guess != null && guess > diceRoll) {
     guessResult += "Close. If we were playing price is right rules, you would have won.";
   } else{
     guessResult += "No guess provided";
   }

    model.addAttribute("num", diceRoll);
    model.addAttribute("guessResult", guessResult);

    //render src/main/webapp/rolls/show.jsp
    return "show";
  }

}
