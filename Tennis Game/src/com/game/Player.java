package com.game;

import java.util.Arrays;
import java.util.List;

public class Player {

    List<String> playerPoints = Arrays.asList("0","15","30","40");
    private int score;

    public int getScore(){
        return score;
    }
    public void addPoint(){
        this.score = this.score +1;
    }
    public String getPoints(){
        return playerPoints.get(score);
    }
}
