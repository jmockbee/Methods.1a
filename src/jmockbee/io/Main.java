package jmockbee.io;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 600;
        int levelCompleted = 5;
        int bonus = 100;
        calculateScore(gameOver,score, levelCompleted,bonus);

        score = 800;
        levelCompleted = 5;
        bonus = 20;

        calculateScore(gameOver,score, levelCompleted,bonus);
    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus ) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;

        }else{
            return-1;
            // -1 conventionally used to find errors
        }
    }
}

