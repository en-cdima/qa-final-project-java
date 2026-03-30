package com.cdima.homework;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username;
        boolean valid;
        boolean hasSpace;
        boolean hasDigit;

        do {
            System.out.println("Introdu un username: ");
            username = scanner.nextLine();

            valid = true;

            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                System.out.println();
                valid = false;
                continue;
            }
            hasSpace = false;
            hasDigit = false;

            for (int i=0; i < username.length(); i++) {

                char ch = username.charAt(i);

                if (ch == ' ') {
                    hasSpace = true;
                    break;
                }
                if (Character.isDigit(ch))
                    hasDigit = true;
            }

            if (hasSpace) {
                System.out.println("Eroare: Username-ul nu poate contine spatii");
                System.out.println();
                valid = false;
                continue;
            }

            if (!hasDigit) {
                System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra");
                System.out.println();
                valid = false;
            }

        }
        while (!valid);

        System.out.println("Username acceptat: " + username);
        scanner.close();
    }
}
