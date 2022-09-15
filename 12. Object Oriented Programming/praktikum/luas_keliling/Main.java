package luas_keliling;

public class Main {
    public static void main(String[] args){
        calculate(4, 7, 8, 3, 4);
    }

    private static void calculate(int s, int p, int l, int a, int t){
        Persegi rumusPersegi = new Persegi();
        PersegiPanjang rumusPersegiPanjang = new PersegiPanjang();
        Segitiga rumusSegitiga = new Segitiga();

        System.out.println("========== LUAS ==========");
        System.out.println("Persegi : " + rumusPersegi.luas(s));
        System.out.println("Segitiga :" + rumusSegitiga.luas(a, t));
        System.out.println("Persegi Panjang :" + rumusPersegiPanjang.luas(p, l));

        System.out.println("========== KELILING ==========");
        System.out.println("Persegi : " + rumusPersegi.keliling(s));
        System.out.println("Segitiga :" + rumusSegitiga.keliling(a, t));
        System.out.println("Persegi Panjang :" + rumusPersegiPanjang.keliling(p, l));
    }
}
