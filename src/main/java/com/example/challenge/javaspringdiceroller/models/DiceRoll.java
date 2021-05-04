package com.example.challenge.javaspringdiceroller.models;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class DiceRoll {
  public int getRandomNumber() {
    Random random = new Random();
    int number = random.nextInt((6) + 1);
    return number;
  }
}
