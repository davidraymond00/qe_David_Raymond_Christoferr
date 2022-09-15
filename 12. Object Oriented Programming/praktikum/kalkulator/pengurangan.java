package kalkulator;

public class pengurangan extends kalkulator{
    int x;
    int y;

    public pengurangan (int x, int y) {
        this.x = x;
        this.y = y;
    }


    public float pengurangan () {
        return (float) (x-y);
    }
}
