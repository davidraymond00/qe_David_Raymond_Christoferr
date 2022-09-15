package Volume;

public class BangunRuang {

    public int volumeKubus(int s){
        return (s*s*s);
    }

    public int volumeBalok(int p, int l, int t){
        return (p*t*l);
    }

    public int volumeTabung(int r, int t){
        double phi = 3.14;
        return (int) ((phi * r * r) * t);
    }
}
