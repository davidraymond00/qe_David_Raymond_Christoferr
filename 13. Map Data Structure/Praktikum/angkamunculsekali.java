import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class angkamunculsekali {
    public static void main(String[] args) {
        Set<String> angka1 = new HashSet<>();
        Set<String> angka2 = new HashSet<>();

        angka1.add("7");
        angka1.add("6");
        angka1.add("5");
        angka1.add("2");
        angka1.add("3");
        angka1.add("7");
        angka1.add("5");
        angka1.add("2");

        angka2.add("7");
        angka2.add("6");
        angka2.add("5");
        angka2.add("2");
        angka2.add("3");
        angka2.add("7");
        angka2.add("5");
        angka2.add("2");

        angka1.addAll(angka2);
        System.out.println(angka1);
    }
}
