package org.example.Strings;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "Молоко делили ледоколом";
        String s2 = "асса";
        System.out.println(isPalindrome(s1));

    }
    public static boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        char[] charArray = lowerCase.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ') {
                list.add(charArray[i]);
            }
        }
        boolean isPalindrome = false;
        for (int i = 0; i < list.size() / 2; i++) {

            if (list.get(i).equals(list.get(list.size() - 1 - i))) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;

    }
}
