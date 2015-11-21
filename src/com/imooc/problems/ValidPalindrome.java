package com.imooc.problems;

/**
 * Created by dnzyt on 11/20/2015.
 * 用两个指针，一个从前往后移动，另一个从后往前移动，移动的过程中比较所在位置的字符是否相等
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;
        int frontIndex = 0;
        int endIndex = s.length() - 1;
        while (frontIndex < endIndex) {
            while (frontIndex < s.length() && !isValidCharacter(s.charAt(frontIndex))) {
                frontIndex++;
            }
            if (frontIndex == s.length())
                return true;

            while (endIndex >= 0 && !isValidCharacter(s.charAt(endIndex))) {
                endIndex--;
            }
            if (endIndex == 0)
                return true;

            if (Character.toLowerCase(s.charAt(frontIndex)) == Character.toLowerCase(s.charAt(endIndex))) {
                frontIndex++;
                endIndex--;
            } else
                break;


        }


        return endIndex <= frontIndex;
    }

    private boolean isValidCharacter(char a) {
        return Character.isLetter(a) || Character.isDigit(a);
    }
}
