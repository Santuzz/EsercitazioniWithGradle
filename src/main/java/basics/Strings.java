package basics;

/**
 * You can find many more here:
 * https://www.w3resource.com/java-exercises/string/index.php
 *
 * Preferences -> Editor -> General -> Code folding -> One-line methods (uncheck)
 * Code -> Folding -> Collapse All
 * Code -> Folding -> Expand Doc Comments
 */
public class Strings {
    /**
     * Write a function accepting a string[]
     * returning a single String representing the concatenation of all basics.Strings of the array
     * see StringBuilder
     */
    public static String concatenate(String[] strings) {
        StringBuilder str = new StringBuilder();
        for (String iesim : strings) {
            str.append(iesim);
        }
        return str.toString();
    }

    /**
     * Write a function accepting a string
     * returning the same string but reversed
     */
    public static String reverse(String s) {
        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }

    /**
     * Write a function accepting a string
     * returning the string without the first two characters.
     */
    public static String removeFirstTwoChars(String s) {
        StringBuilder two = new StringBuilder();
        for (int i = 2; i < s.length(); i++) {
            two.append(s.charAt(i));
        }
        return two.toString();
        // return s.substring(2);
    }

    /**
     * Write a function accepting a string
     * returning the string without the first two characters.
     * Keep the first character if it is 'H' and
     * keep the second character if it is 'e'.
     */
    public static String removeFirstTwoCharsIf(String s) {
        if (s.charAt(0) == 'H' && s.charAt(1) == 'e') {
            return s;
        } else if (s.charAt(0) == 'H') {
            return s.charAt(0) + s.substring(2);
        } else if (s.charAt(1) == 'e') {
            return s.substring(1);
        } else
            return s.substring(2);
    }

    /**
     * Write a function accepting a string
     * returning true if "good" appears at the beginning of the string
     */
    public static boolean goodAtTheBeginning(String s) {
        return s.startsWith("good");
    }

    /**
     * Write a function accepting a string
     * returning true if "good" appears
     * starting at index 0 or 1 in the given string.
     * see substring() method
     */
    public static boolean goodAroundTheBeginning(String s) {
        return s.startsWith("good") || s.startsWith("good", 1);
    }

    /**
     * Write a function accepting a string
     * returning the same string (trimmed of the first and last characters) if the first or last characters are equal
     * or returning the same string (without trimming anything) otherwise
     * see substring(), charAt() methods
     */
    public static String removeFirstLast(String s) {
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }

    /**
     * Write a function accepting a string
     * returning all recurring characters contained into the string as a char[]
     */
    public static char[] duplicateChars(String input) {
        char[] charazzi = new char[input.length()];
        char[] complete;
        int k = 0;
        for (int j = 0; j < input.length() - 1; j++) {
            for (int i = j - 1; i >= 0; i--) {
                if (input.charAt(i) == input.charAt(j)) {
                    charazzi[k] = input.charAt(i);
                    k++;
                }
            }
        }
        complete = new char[k];
        System.arraycopy(charazzi, 0, complete, 0, k);
        return complete;
    }

    /**
     * Write a function accepting a string
     * returning true if the string is a palindrome.
     * see StringBuilder methods
     */

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}


