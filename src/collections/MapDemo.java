package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map map = new HashMap();

        map.put("Anshu", "Singh");
        map.put(1, 10);
        map.put('a', 'b');
        map.put('c', 'b');
        map.put(null, "NullValue");
        map.put(123, "id");
        map.put(5, "vikas");

        map.remove(1);
        map.replace(123, "Saurabh");
       // map.clear();
        System.out.println("Map Size:" + map.size());
        System.out.println(map.containsKey("Anshu"));
        System.out.println(map.containsValue("Singh"));
        System.out.print(map);
    }
}
