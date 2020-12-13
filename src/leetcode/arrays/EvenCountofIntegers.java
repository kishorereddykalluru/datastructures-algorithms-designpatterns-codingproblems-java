package leetcode.arrays;

public class EvenCountofIntegers {

    public static void main(String[] args) {
        int i[] = {12, 345, 2, 6, 7896, 44, 567, 898767};
        int evenCount = evenCountofIntegers(i);
        int evenCount1 = evenCountByConvertingToString(i);
        System.out.println("even count "+evenCount);
        System.out.println("evenCount1 = " + evenCount1);
    }

    private static int evenCountofIntegers(int[] nums){
        int count = 0;
        if(nums.length == 0)
            return 0;
        for(int num : nums){
            int interim = 0;
           while(num > 0){
               interim++;
              num =  num / 10;
           }
           if( interim % 2 == 0)
               count++;
        }
        return count;
    }

    private static int evenCountByConvertingToString(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(Integer.toString(num).length() % 2 == 0)
                count++;
        }
        return count;
    }
}
