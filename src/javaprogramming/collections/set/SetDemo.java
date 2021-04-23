package javaprogramming.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        int arr[] = {10, 5, 5, 5, 10, 5, 3, 4, 1, 6, 7, 8, 9};
        int target = 15;

        Set<Pairs> pairs = new HashSet<>();

        for(int i: arr){
            int result = target - i;
            pairs.add(new Pairs(i, result));
        }
        System.out.println(pairs.size());
        System.out.println("pairs = " + pairs);
    }
}
