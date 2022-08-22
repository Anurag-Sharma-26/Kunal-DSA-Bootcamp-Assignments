package com.assignment_05.easy;

import java.util.*;
public class ArrayFormInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int len = num.length - 1;
        while (len >= 0 || k!= 0){
            if(len>=0){
                k += num[len--];
            }
            list.addFirst(k%10);
            k /= 10;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(addToArrayForm(arr, 3));
    }
}
