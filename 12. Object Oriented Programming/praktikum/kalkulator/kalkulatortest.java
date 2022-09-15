package kalkulator;

public class kalkulatortest {
    public static void main(String[]args) {
        kalkulator kalkulator = new kalkulator();

        penjumlahan penjumlahan = new penjumlahan(3,4);
        pengurangan pengurangan = new pengurangan(15,4);
        perkalian perkalian = new perkalian(10,10);
        pembagian pembagian = new pembagian(12,3);

        System.out.println("Penjumlahan : "+penjumlahan.penjumlahan());
        System.out.println("Pengurangan : "+pengurangan.pengurangan());
        System.out.println("Perkalian : "+perkalian.perkalian());
        System.out.println("Pembagian : "+pembagian.pembagian());
    }
}
