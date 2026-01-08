package cw;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder strB = new StringBuilder(120);
        StringBuilder str = new StringBuilder("Helo group java31-61");
        StringBuilder b = strB.append(" World!");
        strB.append(" World!");
        strB.append(" World!");
        strB.append(" World!");


//        System.out.println(strB);
        b.append(" ").append(new char[]{'A', 2, 212, 4, 5}).append(false);
        b.insert(7, "------");
        b.replace(6, 10, "!!!");


        b.ensureCapacity(300);
        b.trimToSize();
        b.append("111");
        int index = b.indexOf("World");
        System.out.println("index: " + index);
        displaySizeAndCapacity(b);

        displaySizeAndCapacity(b);

        System.out.println(SnakeCaseToCamelCase.toCamelCase("hello__World"));


    }

    public static void displaySizeAndCapacity(StringBuilder sb) {
        System.out.println("size: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println(sb);
    }
}
