package leetcode;

public class KthSmallest {

    public static int max(int[] arr){

        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }


    public static int kthSmallest(int[] arr,int k){
        int n = arr.length;
        int maxValue = max(arr);

        int[] newArray = new int[maxValue+1];

        for(int i = 0;i<n;i++){
            newArray[arr[i]] = arr[i];
        }

        int count = 0;
        int result = 0;

        for(int i = 0;i<maxValue+1;i++){
            
            if(count == k){
                break;
            }

            if(newArray[i] != 0){
                result = newArray[i];
                count++;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k = 6;

        int result = kthSmallest(arr,k);

        System.out.println("Kth Smallest values: "+ result);


    }
}