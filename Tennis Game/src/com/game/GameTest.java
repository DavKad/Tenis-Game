package com.game;

import org.junit.Assert;
import org.junit.Test;


public class GameTest {

    @Test
    public void resultOfTheGame() {
        Game testGame = new Game();
        Assert.assertNotNull(testGame.resultOfTheGame());
    }

    @Test
    public void playerName() {
        Game testGame = new Game();
        Assert.assertNotNull(testGame.playerName());
    }
}