package codingchallanges.leetcode.arrays;

public class MaxConsecutivieOnes {
    
    public static void main(String...args){
        int arr[] = {1,1,0,1,1,1};

        MaxConsecutivieOnes arrayPractice = new MaxConsecutivieOnes();
        int maxConsecutiveOnes = arrayPractice.findMaxConsecutiveOnes(arr);
        System.out.println("maxConsecutiveOnes = " + maxConsecutiveOnes);
    }

    public int findMaxConsecutiveOnes(int[] nums) {

        int maxContinuous = 0;
        int max = 0;
        
        for(int num : nums){
                if(num == 1){ max += 1; }
                else {
                    maxContinuous = Math.max(maxContinuous, max);
                    if(max > nums.length/2)
                        return max;
                    max = 0;
                }
        }

        return Math.max(max, maxContinuous);
    }
}
