package com.assignment1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();
        scanner.close();
        
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + limit + ": ");
        System.out.print(a + ", " + b);
        
        while (a + b <= limit) {
            int temp = a + b;
            System.out.print(", " + temp);
            a = b;
            b = temp;
        }
        System.out.println();
    }
}

