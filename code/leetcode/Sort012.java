package leetcode;

import java.util.Arrays;

public class Sort012 {

    public static void sort012(int[] arr){

        int countOfOne = 0;
        int countOfTwo = 0;
        int countOfZero = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                countOfZero++;
            }else if(arr[i] == 1){
                countOfOne++;
            }else if(arr[i] == 2){
                countOfTwo++;
            }
        }

        for(int i = 0;i<arr.length;i++){
            if(countOfZero > 0){
                arr[i] = 0;
                countOfZero--;
            }else if(countOfOne > 0){
                arr[i] = 1;
                countOfOne--;
            }else if(countOfTwo > 0){
                arr[i] = 2;
                countOfTwo--;
            }
        }
    }
    
    // only take 0,1 and 2 values;
    public static void main(String[] args) {
        int[] arr = {1,0,0,2,2,2,1,2};

        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));


        sort012(arr);

        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr));
    }
}
