package cw;

public class SnakeCaseToCamelCase {

    public static String toCamelCase(String s) {
        s = s.toLowerCase();
        if (s == null || s.isBlank()) return "";
        StringBuilder res = new StringBuilder();
        boolean upperNext = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '_' && i == 0) continue;
            if (c == '_') upperNext = true;
            else {
                if (upperNext) {
                    res.append(Character.toUpperCase(c));
                    upperNext = false;
                } else res.append(c);
            }
        }
        res.trimToSize();
        return res.toString();
    }
}