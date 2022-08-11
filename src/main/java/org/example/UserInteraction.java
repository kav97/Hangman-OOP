package org.example;

import java.util.Scanner;

public class UserInteraction {
    public String getInput() {

        System.out.println("Guess a letter: ");
        Scanner scanner = new Scanner( System.in );
        return scanner.nextLine();
    }
}
