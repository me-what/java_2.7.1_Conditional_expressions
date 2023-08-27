public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        System.out.println(a == b); // false
        System.out.println(a == 10); // true
        System.out.println();

        int a2 = 10;
        int b2 = 4;
        System.out.println(a2 != b2); // true
        System.out.println(a2 != 10); // false
        System.out.println();

        int a3 = 10;
        int b3 = 4;
        System.out.println(a3 < b3);   // false
        System.out.println();

        int a4 = 10;
        int b4 = 4;
        System.out.println(a4 > b4);   // true

        boolean c5 = 10 >= 10;    // true
        boolean b5 = 10 >= 4;     // true
        boolean d5 = 10 >= 20;    // false

        boolean c6 = 10 <= 10;    // true
        boolean b6 = 10 <= 4;     // false
        boolean d6 = 10 <= 20;    // true
        System.out.println();

        System.out.println((5 > 6) || (4 < 6)); // true
        System.out.println((5 > 6) || (4 > 6)); // false
        System.out.println((5 > 6) && (4 < 6)); // false
        System.out.println((50 > 6) && (4 / 2 < 3)); // true
        System.out.println((5 < 6) ^ (4 > 6)); // true
        System.out.println((50 > 6) ^ (4 / 2 < 3)); // false
    }
}