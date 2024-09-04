package org.example;

public class Solution {
    public int maximum69Number(int num) {
        //convert integer num to a String
        String temp = String.valueOf(num);
        //create a StringBuilder
        StringBuilder sb = new StringBuilder();
        //create a boolean flag
        boolean flag = true;
        //iterate through the length of the String
        for (int i = 0; i < temp.length(); i++) {
            //find the first "6" in the String and replace it with a "9"
            if (flag && temp.charAt(i) == '6') {
                flag = false;
                sb.append('9');
            } else {
                sb.append(temp.charAt(i));
            }
        }
        //create a String from the StringBuilder and return the integer value of that String
        return Integer.parseInt(sb.toString());
    }
}
