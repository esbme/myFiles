/**
 * 	Ethan Barber
 * 	01/29/24
 * 	Assignment 1
 */

import java.util.Scanner;
/*This is the creation of the class and main */
public class Methods {
    public static void main(String[] args) {
/*Scanner is needed to get user input for the game*/
        Scanner input = new Scanner(System.in);
        //loop to determine play again feature
        while(true) {
        playGame();
/*Asks user if they want to play again*/
            System.out.print("\nDo you want to play again?");
            String playAgain = input.nextLine().toUpperCase();
            if (playAgain.charAt(0) == 'N'){
                System.out.println("Goodbye!");
                break;
            }}}

    /**
     *
     * @param max is the max number that the random number could be generated up to
     * @return the random integer between 1 and the max value
     */
    public static int getRandom(int max){
        return (int)(Math.random()*max) + 1;
    }

    /**
     * takes no parameters and returns nothing
     * this method runs the guessing game until guess == answer
     */
    public static void playGame(){
            int answer = getRandom(100);

            int guess;

            //loop to play game
            do {
                guess = getGuess();

                if (guess == answer) {
                    System.out.println("You won!");
                } else {
                    hiOrLo(guess, answer);
                }

            } while (guess != answer);
        }

    /**
     *
     * @return	the user's input for guess
     */
    public static int getGuess() {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the number: ");
        int guess = input.nextInt();
        return guess;
    }

    /**
     *
     * @param guess		the value of the user's guess
     * @param answer	the randomly generated integer
     */
    public static void hiOrLo(int guess, int answer) {
        //Example of conditional operator
        System.out.println(answer < guess ? "Lower" : "Higher");
        return;
    }

}
