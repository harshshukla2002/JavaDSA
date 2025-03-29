package array;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<>();

        // adding item
        list.add(10);
        list.add(30);
        list.add(40);

        // set item
        list.set(0,20);

        // remove item
        list.remove(2);

        // printing item
        System.out.println("all list items " + list);


        // get single element
        System.out.println("particular list item " + list.get(0));
    }
}
