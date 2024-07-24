package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (0 to finish):");

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("Done entering integers into the list.");

        System.out.println("What number are you looking for in the list?");
        int searchNumber = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == searchNumber) {
                System.out.println(searchNumber + " is at index " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println(searchNumber + " is not in the list.");
        }

        scanner.close();
    }
}
