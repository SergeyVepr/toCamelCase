package hw;

import java.util.Arrays;

public class UniqueWords {
    public static int countUniqueWords(String str) {
        if (str == null || str.isBlank()) return 0;
        String[] words = new String[16];
        int count = 0;
        int start = -1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                if (start == -1) start = i;
            } else {
                if (start != -1) {
                    String w = str.substring(start, i).toLowerCase();
                    if (count == words.length) words = Arrays.copyOf(words, words.length * 2);
                    words[count++] = w;
                    start = -1;
                }
            }
        }
        if (start != -1){
            String w = str.substring(start).toLowerCase();
            if (count == words.length) words = Arrays.copyOf(words, words.length  + 1);
            words[count++] = w;
        }
        if(count == 0) return 0;
        Arrays.sort(words, 0, count);
        int unique = 1;
        for (int i = 1; i < count; i++) {
            if(!words[i].equals(words[i - 1])) unique++;
        }
        return unique;
    }
}
