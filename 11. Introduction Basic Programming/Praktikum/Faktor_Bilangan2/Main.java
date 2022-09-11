package Faktor_Bilangan2;

public class Main {
    public static void main(String[] args){
        int bilangan = 6;
        int penyebut = bilangan;

        for (int i = 0; i < bilangan; i++){
            if (bilangan % penyebut == 0){
                System.out.println(penyebut);
            }
            penyebut--;
        }
    }
}
