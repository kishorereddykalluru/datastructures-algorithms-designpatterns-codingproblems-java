package interviewquestions;

import java.util.HashSet;
import java.util.Set;

public class Code88 {

    public static void main(String[] args) {
        int arr[] = {10, 5, 5, 5, 10, 5, 3, 4, 1, 6, 7, 8, 9};

        int target = 15;

        Set<Integer> sumToTarget = new HashSet<>();
        for(int i : arr){
            int result = target - i;

            if(sumToTarget.contains(result)){
                System.out.println("result = " + result + ", "+i);
                sumToTarget.remove(result);
            } else {
                sumToTarget.add(i);
            }
        }

        Set<Pair> sumPairs = new HashSet<>();
        for(int num: arr){
            int result = target - num;

            sumPairs.add(new Pair(num, result));
        }

        sumPairs.forEach(System.out::println);
    }
}
