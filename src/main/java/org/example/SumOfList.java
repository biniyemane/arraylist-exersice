package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
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

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1 && numbers.size() > 1) {
                System.out.print("and " + numbers.get(i));
            } else if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + ", ");
            }
        }
        System.out.println(" were the items in the list.");

        int sum = calculateSum(numbers);
        System.out.println("The sum of that list is: " + sum);

        scanner.close();
    }

    public static int calculateSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
