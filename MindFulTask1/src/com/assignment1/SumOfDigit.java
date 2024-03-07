package com.assignment1;

import java.util.Scanner;


public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
    }
}
