package luas_keliling;

public class Segitiga implements BangunDatar{

    @Override
    public int luas(int s1, int s2) {return (int) (0.5 * s1 * s2);}

    @Override
    public int keliling(int s1, int s2) {return (s1 + s2 + sisiMiring(s1, s2));}

    public int sisiMiring(int s1, int s2){
        return (int) Math.sqrt((s1 * s1) + (s2 * s2));
    }
}
