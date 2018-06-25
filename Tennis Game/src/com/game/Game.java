package com.game;

public class Game {

    Player server = new Player();
    Player receiver = new Player();

    boolean endOfGame = true;

    public boolean isEndOfGame() {
        return this.endOfGame;
    }

    public String resultOfTheGame(){
        if(server.getScore() >= 3 && receiver.getScore() >= 3) {
            if(Math.abs(receiver.getScore() - server.getScore()) >= 2) {
                endOfGame = false;
                System.out.println("End of the game and the winner is:  ");
                return playerName();
            } else if (server.getScore() == receiver.getScore()) {
                return "Deuce";
            }else {
                return "Advantage " + playerName();
            }
        }
        else{
            if(server.getScore() == 4 || receiver.getScore() == 4){
                endOfGame = false;
                System.out.println("End of the game and the winner is:  ");
                return playerName();
            }
        return "Server " + server.getPoints() + " : " + receiver.getPoints() + " Receiver";
        }
    }

    public String playerName(){
        return (server.getScore() > receiver.getScore()) ? "Server" : "Receiver";
    }

}
