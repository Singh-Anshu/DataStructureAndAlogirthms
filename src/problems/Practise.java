package problems;
import java.util.ArrayList;
import java.util.HashSet;

public class Practise {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();

        al.add("Anshu");
        al.add("Deepak");
        al.add("Vikas");
        al.add("'Nihal");

        HashSet hashSet = new HashSet(al);
        hashSet.add(30);
        hashSet.add(20);
        hashSet.add(null);
        hashSet.add(10);


        System.out.println("Hashset size:"+hashSet.size() );

        System.out.println(hashSet);

        System.out.println(hashSet.contains("Anshu"));
    }
}
