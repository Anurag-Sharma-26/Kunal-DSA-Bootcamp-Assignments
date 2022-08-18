package com.assignment_03_intermediate;

public class SecondLastProblem {
    public static void main(String[] args) {
        System.out.println("August has 31 days.");
        int days = 31;
        int count = 0;
        for(int i = 1; i <= days; i++){
            if(i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Kunal is allowed to go out with his friends on " + count + " days of August");
    }
}
