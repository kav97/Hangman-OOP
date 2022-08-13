package org.example;

public class Results {

    public static void displayLives ( byte numberOfLivesRemaining ) {
        if ( numberOfLivesRemaining == 0 ) {
            System.out.println( "You have " + numberOfLivesRemaining + " lives remaining... game over." );
        } else {
            System.out.println( "You have " + numberOfLivesRemaining + " lives remaining..." );
        }
    }
}
