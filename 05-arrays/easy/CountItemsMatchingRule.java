package com.assignment_05.easy;

import java.util.*;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ruleKey = "type";
        String ruleValue = "silver";
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int j = 0;
        switch (ruleKey) {
            case "color"-> j = 1;
            case "name"-> j = 2;
        }
        int count = 0;
        for(List<String> l : items){
            if(l.get(j).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}

