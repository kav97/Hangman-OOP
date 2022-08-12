package org.example;

import java.util.ArrayList;

public class Main {
    public static void main( String[] args ) {

        System.out.println( "Welcome to hangman..." );

        int livesRemaining = 7;

        String word = Dictionary.getAnimal();

        ArrayList<String> hiddenWord = new ArrayList<>();

        for ( int i = 0; i < word.length(); i++ ){
            hiddenWord.add( "_" );
        }

        System.out.println( hiddenWord );

        while ( livesRemaining > 0 ) {

            UserInput userInput = new UserInput();
            String currentInput = userInput.getInput();

            if ( word.contains( currentInput ) ){
                System.out.println( "You guessed correct!" );
                for ( int i = 0; i < word.length(); i++ ){
                    if ( word.charAt(i) == currentInput.charAt(0) ){
                        hiddenWord.set( i, Character.toString(word.charAt(i) ) );
                    }
                }
                if( !hiddenWord.contains( "_" ) ) {
                    System.out.println( hiddenWord );
                    System.out.println( "You won, congrats!" );
                    break;
                }
            } else {
                livesRemaining--;
            }

            System.out.println( hiddenWord );
            Results.displayLives( livesRemaining );
        }
    }
}