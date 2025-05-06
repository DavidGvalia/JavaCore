package org.example;

import java.util.Scanner;

public class Exeptions {
    public static void main(String[] args) {
        //Программа, которая запрашивает у пользователя два числа и выполняет деление
        Scanner scanner = new Scanner(System.in);
        int first_number = 0;
        int second_number = 0;
        int result = 0;
        System.out.println("Enter first number: ");
        try {
            first_number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Not a number");
        }
        System.out.println("Enter second number: ");
        try {
            second_number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Not a number");
        }

        try {
            result = first_number / second_number;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }


    }
}
