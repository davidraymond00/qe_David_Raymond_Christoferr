import java.util.*;
public class arraymerge {
    public static void main(String args[]) {
        Set<String> nama1 = new HashSet<String>();
        Set<String> nama2 = new HashSet<String>();
        Set<String> nama3 = new HashSet<String>();
        Set<String> nama4 = new HashSet<String>();

        nama1.add("kazuya");
        nama1.add("jin");
        nama1.add("lee");
        nama2.add("kazuya");
        nama2.add("feng");

        nama3.add("lee");
        nama3.add("jin");
        nama4.add("kazuya");
        nama4.add("panda");

        nama1.addAll(nama2);
        nama3.addAll(nama4);
        System.out.println(nama1);
        System.out.println(nama3);
    }
}
