package com.company;

import java.util.Scanner;

public class Player {
    private String name;
    private int points;
    private int numberOfWins;
    private int playStatus; // 0 = not playing, 1 = playing, 2 = hold, 3 = bust

    public void setName() {
        System.out.println("WELCOME TO THE CODING CASINO! I am Jack the greatest black-jacker of all time. What is your name?");
        Scanner userInput = new Scanner(System.in);
        name = userInput.nextLine();
        System.out.println("Well hello" + name);
    }

    public Player(String theirName) {
        setName();
        points = 0;
        numberOfWins = 0;
        playStatus = 0;
    }

    public void clearPoints() {
        points = 0;
        points = 0;
    }


    public void addPoints(int pointsToAdd) {
        points += pointsToAdd;
    }

    public String getName() {
        return name;
    }

    public void setPlayStatus(int status) {
        playStatus = status; //Don't over think this!
        // The Blackjack object will be changing the player's status over time, this method should just provide a way to change it

        /* ---------------------------------
        if (Blackjack.gameBegan == true) {
            playStatus = 1;
        }
        if (Blackjack.gameBegan == false) {
            playStatus = 0;
        } ---------------------------------*/

    }

    public int getPlayStatus() {
        return playStatus;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public int getPoints(){
        return points;
    }
}

