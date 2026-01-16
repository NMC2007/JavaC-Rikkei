package Session_5;

public class SS5_k2 {
    public static void main(String[] args) {
        int max = 10000;

        // ================= String =================
        long start = System.nanoTime();

        String s2 = new String("Hello");
        for (int i = 0; i < max; i++) {
            s2 = s2 + " World";
        }

        long end = System.nanoTime();
        System.out.println("Thời gian thực hiện với String: " + (end - start) + " ns");

        // ================= StringBuilder =================
        start = System.nanoTime();

        StringBuilder sb2 = new StringBuilder("Hello");
        for (int i = 0; i < max; i++) {
            sb2.append(" World");
        }

        end = System.nanoTime();
        System.out.println("Thời gian thực hiện với StringBuilder: " + (end - start) + " ns");

        // ================= StringBuffer =================
        start = System.nanoTime();

        StringBuffer sbf2 = new StringBuffer("Hello");
        for (int i = 0; i < max; i++) {
            sbf2.append(" World");
        }

        end = System.nanoTime();
        System.out.println("Thời gian thực hiện với StringBuffer: " + (end - start) + " ns");
    }
}
