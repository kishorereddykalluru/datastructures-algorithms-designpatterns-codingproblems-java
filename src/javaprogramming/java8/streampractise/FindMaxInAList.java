package javaprogramming.java8.streampractise;

import java.util.Comparator;
import java.util.List;

public class FindMaxInAList {

    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,5,3,4,6,9,7);
        
        int max1 = list.stream().reduce(Integer::max).get();
        System.out.println("max1 = " + max1);

        int max2 = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max2 = " + max2);

        int max3 = list.stream().mapToInt(i -> i).max().getAsInt();
        System.out.println("max3 = " + max3);
    }
}
