package Mean;

public class Main {

    private static float Mean (float[] numbers){
        int inc = 0;
        for (float locInc : numbers){
            inc += locInc;
        }
        return  inc / (float) numbers.length;
    }

    public static void main(String[] args){
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}
