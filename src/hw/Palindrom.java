package hw;

public class Palindrom {
    public static boolean isPalindrom(String str) {
        if (str == null || str.isBlank()) return false;
        str = str.trim();
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(str.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(str.charAt(j))) j--;
            char left = Character.toLowerCase(str.charAt(i));
            char right = Character.toLowerCase(str.charAt(j));
            if (left != right) return false;
            i++;
            j--;
        }
        return true;
    }
}
