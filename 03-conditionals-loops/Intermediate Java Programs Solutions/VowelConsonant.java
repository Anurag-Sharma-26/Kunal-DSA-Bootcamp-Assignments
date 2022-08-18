package com.assignment_03_intermediate;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char s = scan.next().trim().charAt(0);
        switch (s) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println(s + " is Vowel.");
            default -> System.out.println(s + " is Consonant.");
        }
    }


}
