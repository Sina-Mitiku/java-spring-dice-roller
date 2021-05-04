package com.example.challenge.javaspringdiceroller.controllers;

import com.example.challenge.javaspringdiceroller.models.DiceRoll;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/rolls")
public class RollsController {
  @GetMapping("/rolls/new")
  public String getNew(@RequestParam int guess, Model model) {
    //Implement your logic here
    DiceRoll newRoll = new DiceRoll();
    newRoll.setNum(newRoll.getNum(1,6));
    //this will allow you to use the variable `num` in your JSP/JSTL view
    model.addAttribute(newRoll);

    //render src/main/webapp/rolls/show.jsp
    return "rolls/show";
  }
}
