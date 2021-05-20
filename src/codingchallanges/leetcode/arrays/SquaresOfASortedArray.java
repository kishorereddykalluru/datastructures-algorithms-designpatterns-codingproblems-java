package codingchallanges.leetcode.arrays;

public class SquaresOfASortedArray {

    public static void main(String[] args) {

        int arr[] = {-4, -1, 0, 3, 10};

        int[] ints = sortedSquares(arr);

        for(int x : ints){
            System.out.println("x = " + x);
        }

    }

    private static int[] sortedSquares(int[] arr) {
        int square[] = new int[arr.length];
         for(int i = 0; i < arr.length; i++){
            square[i] = arr[i] * arr[i];
        }
         sort(square, 0, square.length-1);
         return square;
    }
    private static void sort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
