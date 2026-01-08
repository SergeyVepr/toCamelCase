package cw;

public class StringVsStringBuilder {
    public static final int COUNT = 1_000_000;
    public static final String WORD = "Java";

    public static void main(String[] args) {
        String res1 = "";
        long start = System.nanoTime();
        StringBuilder res2 = new StringBuilder("");
        for (int i = 0; i < COUNT; i++) {
            res1 += WORD;
        }
        System.out.println("String time: " + (System.nanoTime() - start) / 1000);
        start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            res2.append(WORD);
        }
        res2.toString();

        System.out.println("StringBuilder time: " + (System.nanoTime() - start) / 1000);

    }

    // String str = "asv_fgh_iop"; => asvFghIop;
}
