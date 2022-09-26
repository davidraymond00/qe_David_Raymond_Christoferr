import java.util.HashMap;
public class arrayunique {
    public static void main(String args[])
    {int arrayWithDuplicates[] = { 1, 2, 3, 4,1,3,5,10,16 };

        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();

        for (int j = 0; j < arrayWithDuplicates.length; j++) {
            hashmap.put(arrayWithDuplicates[j], j);
        }
        System.out.println(hashmap.keySet());

    }
}
