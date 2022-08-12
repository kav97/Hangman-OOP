package org.example;

public class Results {

    public static void displayLives ( int numberOfLivesRemaining ) {
        if ( numberOfLivesRemaining == 7 ) {
            System.out.println( "You have 7 lives remaining" );
        } else if ( numberOfLivesRemaining == 6 ) {
            System.out.println( "You have 6 lives remaining..." );
        } else if ( numberOfLivesRemaining == 5 ) {
            System.out.println( "You have 5 lives remaining..." );
        } else if ( numberOfLivesRemaining == 4 ) {
            System.out.println( "You have 4 lives remaining..." );
        } else if ( numberOfLivesRemaining == 3 ) {
            System.out.println( "You have 3 lives remaining..." );
        } else if ( numberOfLivesRemaining == 2 ) {
            System.out.println( "You have 2 lives remaining..." );
        } else if ( numberOfLivesRemaining == 1 ) {
            System.out.println( "You have 1 lives remaining..." );
        } else if ( numberOfLivesRemaining == 0 ) {
            System.out.println( "You have 0 lives remaining... game over." );
        }
    }
}
