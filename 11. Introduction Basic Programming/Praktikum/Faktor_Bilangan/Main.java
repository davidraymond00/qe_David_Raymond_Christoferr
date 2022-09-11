package Faktor_Bilangan;

public class Main {
    public static void main(String[] args){
        int bilangan = 20;
        int penyebut = 0;

        for (int i = 0; i <= bilangan; i++){
            penyebut++;
            if (bilangan % penyebut == 0){
                System.out.println(penyebut);
            }
        }
    }
}
