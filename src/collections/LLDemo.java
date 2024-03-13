package collections;

import java.util.LinkedList;
class LLDemo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("b");
        list.addLast("c");
        list.add("e");

        System.out.println(list);
        System.out.println(list.size());
    }

}
