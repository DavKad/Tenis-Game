package com.game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean control = true;
        Game tennisGame = new Game();
        while(control){
            System.out.println();
            System.out.println("Scoreboard");
            System.out.println("Please enter the player that wins a point");
            System.out.println("Server = 1");
            System.out.println("Receiver = 2");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();
            switch(choose){
                case 1:
                    tennisGame.server.addPoint();
                    break;
                case 2:
                    tennisGame.receiver.addPoint();
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }
            System.out.println(tennisGame.resultOfTheGame());
            control = tennisGame.isEndOfGame();
        }
    }
}
