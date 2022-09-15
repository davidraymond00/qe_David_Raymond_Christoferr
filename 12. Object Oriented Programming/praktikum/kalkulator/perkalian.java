package kalkulator;

public class perkalian extends kalkulator {
    int x;
    int y;

    public perkalian (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float perkalian () {
        return this.x * this.y;
    }
}
