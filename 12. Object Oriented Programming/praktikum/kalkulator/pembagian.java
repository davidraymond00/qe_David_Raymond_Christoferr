package kalkulator;

public class pembagian extends kalkulator{
    int x;
    int y;

    public pembagian (int x, int y) {
        this.x = x;
        this.y = y;
    }


    public float pembagian () {
        return this.x / this.y;
    }
}
