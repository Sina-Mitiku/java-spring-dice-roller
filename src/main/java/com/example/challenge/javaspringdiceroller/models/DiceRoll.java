package com.example.challenge.javaspringdiceroller.models;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class DiceRoll {
  private int num;

//  public int getRandom() {
//    return random;
//  }

  public void setNum(int num) {
    this.num = num;
  }

  public int getNum(int min, int max) {
    Random random = new Random();
    return random.nextInt((max-min) +1) +min;
  }
}
