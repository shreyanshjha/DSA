package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q1: Print the sum of the first n Natural Numbers
        //Scanner sc = new Scanner (System.in);
        //int n = sc.nextInt();
        //int sum = 0;
        //for (int i=1; i<=n ;i++){
            //sum = sum + i;
        //}
        //System.out.println(sum);

        //Q2: Print the table of a number input by the user
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int result;
        for(int i=1; i<=10; i++){
            result = n*i;
            System.out.println(n + " * " + i + " = " + result );
        }
    }
}