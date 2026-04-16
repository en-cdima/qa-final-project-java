package com.cdima.homework;

public class Main {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        try {
            User user1 = new User("testuser", 25);
            userRepository.addUser(user1);
            System.out.println("Utilizator adăugat cu succes: " + user1);
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare la adăugarea utilizatorului: " + e.getMessage());
        }

        try {
            AdminUser adminUser = new AdminUser("admin", 30, "full_access");
            userRepository.addUser(adminUser);
            System.out.println("Utilizator adăugat cu succes: " + adminUser);
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare la adăugarea utilizatorului: " + e.getMessage());
        }

        try {
            User shortUsernameUser = new User("ab", 22);
            userRepository.addUser(shortUsernameUser);
            System.out.println("Utilizator adăugat cu succes: " + shortUsernameUser);
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare la adăugarea utilizatorului: " + e.getMessage());
        }

        try {
            User negativeAgeUser = new User("baduser", -5);
            userRepository.addUser(negativeAgeUser);
            System.out.println("Utilizator adăugat cu succes: " + negativeAgeUser);
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare la adăugarea utilizatorului: " + e.getMessage());
        }

        System.out.println("\nLista utilizatorilor valizi adăugați în repository:");
        for (User user : userRepository.getUsers()) {
            System.out.println(user);
        }
    }
}