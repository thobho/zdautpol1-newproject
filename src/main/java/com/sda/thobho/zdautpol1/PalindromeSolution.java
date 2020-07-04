package com.sda.thobho.zdautpol1;

import java.util.Scanner;

class PalindromeSolution {


    boolean isPalidrome(String text) {
        String reverse = new StringBuilder(text).reverse().toString();
        return reverse.equals(text);
    }


    public static void main(String[] args) {

        PalindromeSolution palindromeSolution = new PalindromeSolution();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        String userInput = in.nextLine();

        boolean answer = palindromeSolution.isPalidrome(userInput);

        if (answer) {
            System.out.println("To jest palindrome");
        } else {
            System.out.println("To nie jest palindrom");
        }

    }


}