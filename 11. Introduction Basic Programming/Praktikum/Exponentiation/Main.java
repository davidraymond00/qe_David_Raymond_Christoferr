package Exponentiation;

public class Main {
    private static int pangkat(int a, int b) {
        double ans = 1;
        if (b != 0) {
            int abs = 0;
            if (b > 0) {
                abs = b;
            } else {
                abs = (-1) * b;
            }
            for (int i = 1; i <= abs; i++) {
                ans *= a;
            }
            if (b < 0) {
                ans = 1.0 / ans;
            }
        } else {
            ans = 1;
        }
        return (int) ans;
    }

    public static void main(String[] args){
        System.out.println(pangkat(2, 3));
        System.out.println(pangkat(5, 3));
        System.out.println(pangkat(10, 2));
        System.out.println(pangkat(2, 5));
        System.out.println(pangkat(7, 3));
    }
}
