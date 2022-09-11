package Draw_XYZ;

public class Main {
    private static void DrawXYZ(int n){
        int a = 0;
        for (int i = 0; i < n; i++){
            System.out.println();
            for (int j = 1; j <= n; j++){

                ++a;

                if (a % 3 == 0){
                    System.out.print(" X ");
                }
                else if (a % 2 == 1){
                    System.out.print(" Y ");
                }
                else if (a % 2 == 0){
                    System.out.print(" Z ");
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(1);
    }
}
