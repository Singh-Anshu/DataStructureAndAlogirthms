package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Anshu");
        hm.put(2, "Mayur");
        hm.put(3, "Amit");
        hm.put(4, "Girish");
        hm.put(null, "AAA");
        hm.put(5, null);
        hm.put(6, null);
        hm.put(7, null);

        hm.replace(2, "Ankit"); // replacing the value by key

        hm.remove(7); // it will remove entry of 7
        System.out.println("printing the size of Hashmap: "+ hm.size());

        System.out.println("Checking contains the key or not: "+hm.containsKey(10)); // return value in true or false
        if(hm.containsValue("Anshu")) {
//            System.out.println("Checking contains the Value or not: "+ );
            hm.put(1, hm.get(1) + " Singh");
        }
         // return value in true or false
        System.out.println("getting the value from key: "+ hm.get(3)); // if key is present then value be return otherwise null be return

        System.out.println("Checking hashmap is empty or not: "+hm.isEmpty()); // checking if hasmap is empty or not
        System.out.println("printing hasmap in map format: "+hm); // printing hashmap in map form

        // printing hashmap by first method
        for(Map.Entry map : hm.entrySet()){

            System.out.println(map.getKey() + "\t->\t" + map.getValue());
        }

        // printing hashmap by Second method
       /* Set set = hm.entrySet();
        System.out.println(set);

        Iterator itr = set.iterator();

        while (itr.hasNext()) {

            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + "\t->\t" + entry.getValue());
        }*/
    }
}
