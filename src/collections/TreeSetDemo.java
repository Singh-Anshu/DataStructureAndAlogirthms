package collections;
import java.util.TreeSet;
public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();

        treeSet.add(40);
        treeSet.add(50);
        treeSet.add(60);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(80);

        treeSet.remove(80);

       /* treeSet.add("Anshu");
        treeSet.add("Deepak");
        treeSet.add("Vikas");
        treeSet.add("Saurabh");
        treeSet.add("Pritesh");
        treeSet.add("Sachin");
        treeSet.add("Abhishek");*/
     //   treeSet.add(10);
      //  treeSet.add(null);

      //  treeSet.clear();  // clear all elements

        for (Object value: treeSet) {
            System.out.print(value+" ");
        }

    }
}
