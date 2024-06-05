package day26.StringClass.Assignment;

import java.util.Scanner;

public class CharacterPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int totalCharacters = input.length();
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int specialCount = 0;

        for (int i = 0; i < totalCharacters; i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCount++;
            }
        }

        double uppercasePercentage = (double) uppercaseCount / totalCharacters * 100;
        double lowercasePercentage = (double) lowercaseCount / totalCharacters * 100;
        double digitPercentage = (double) digitCount / totalCharacters * 100;
        double specialPercentage = (double) specialCount / totalCharacters * 100;

        System.out.println("Percentage of Uppercase Letters: " + uppercasePercentage + "%");
        System.out.println("Percentage of Lowercase Letters: " + lowercasePercentage + "%");
        System.out.println("Percentage of Digits: " + digitPercentage + "%");
        System.out.println("Percentage of Special Characters (including spaces): " + specialPercentage + "%");

        scanner.close();
    }
}
