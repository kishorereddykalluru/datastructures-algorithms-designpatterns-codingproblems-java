package javalearning.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            Integer value = it.next();
            System.out.println("value = " + value);

            if(value.equals(3))
                list.remove(value);
        }
    }
}