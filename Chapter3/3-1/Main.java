public class Main {
    public static void main(String[] args) {
        byte a;
        a = 10;
        System.out.println(a += 3);
        a = 15;
        System.out.println(a -= 3);
        a = 20;
        System.out.println(a *= 3);
        a = 25;
        System.out.println(a /= 3);
        a = 30;
        System.out.println(a %= 3);
        /* Optional as outside of scope of exam */
        a = 35;
        System.out.println(a &= 3);
        a = 40;
        System.out.println(a ^= 3);
        a = 45;
        System.out.println(a |= 3);
        a = 50;
        System.out.println(a <<= 3);
        a = 55;
        System.out.println(a >>= 3);
        a = 60;
        System.out.println(a >>>= 3);
        /* End optional */
    }
}