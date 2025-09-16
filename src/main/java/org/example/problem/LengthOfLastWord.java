package org.example.problem;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
//        s = s.trim();
//        return s.substring(s.lastIndexOf(" ") + 1).length();

        int count = 0;
        boolean isText = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                isText = true;
                count++;
            }
            if (isText && s.charAt(i) == ' ') {
                break;
            }
        }
        return count;
    }
}
