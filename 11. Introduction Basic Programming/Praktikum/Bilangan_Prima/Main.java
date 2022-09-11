package Bilangan_Prima;

public class Main {
    private static boolean primeNumber(int number){
        boolean result = true;

        if (number == 0 || number == 1){
            result = false;
        }
        else {
            for (int i = 2; i <= number / 2; i++){
                if (number % i == 0){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
}
