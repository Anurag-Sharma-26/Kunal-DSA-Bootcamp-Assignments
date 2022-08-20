package com.assignment_05.easy;

import java.util.Arrays;
import java.util.Scanner;

public class SentenceIsPangram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(checkPangram(str));
    }
    static boolean checkPangram(String sentence){
        boolean[] arr = new boolean[26];
        for(int i=0; i<sentence.length(); i++){
            int a = sentence.charAt(i);
            arr[a -'a'] = true;
        }
        for (boolean b : arr) {
            if (!b) return false;
        }
        return true;
    }
}
