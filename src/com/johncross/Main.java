package com.johncross;

//overloading - same method name but different vars

public class Main {

    public static void main(String[] args) {

//        int newScore = calculateScore("John", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(6, 5));
        System.out.println(calcFeetAndInchesToCentimeters(-157));

    }

//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("No player name, no player score");
//        return 0;
//    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double toCentimeters = ((feet * 12) + inches) * 2.54;
            return toCentimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double remainingInches = inches % 12;
            double feetInInches = inches / 12;
            double toCentimeters = calcFeetAndInchesToCentimeters((int)feetInInches, remainingInches);
            return toCentimeters;
        } else {
            return -1;
        }
    }

}
