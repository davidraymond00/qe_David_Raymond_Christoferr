package Volume;

public class Main {

    public static void main(String[] args){
        balok(3, 6, 10);
        kubus(10);
        tabung(7, 10);
    }

    public static void balok(int p, int l, int t){
        BangunRuang rumusBalok = new BangunRuang();
        System.out.println(rumusBalok.volumeBalok(p, l, t));
    }

    public static void kubus(int s){
        BangunRuang rumusKubus = new BangunRuang();
        System.out.println(rumusKubus.volumeKubus(s));
    }

    public static void tabung(int r, int t){
        BangunRuang rumusTabung = new BangunRuang();
        System.out.println(rumusTabung.volumeTabung(r, t));
    }
}
