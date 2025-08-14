package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public static int[] twoSum(int[] arr,int target){
        Map<Integer,Integer> result = new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            int num = arr[i];
            int complement = target - num;
            if(result.containsKey(complement)){
                return new int[]{i,result.get(complement)};

            }
            result.put(num,i);
        }

        return new int[]{};

    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] result = twoSum(arr, 9);

        System.out.print("[ ");
        for(int num:result){
            System.out.print( num  + ", ");
        }
        System.out.print(" ]");
    }
}
