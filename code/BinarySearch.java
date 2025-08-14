public class BinarySearch {

    public static int binarySearch(int[] arr,int target){

        int left = 0, right=arr.length-1;

        while(left<=right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){     
                return mid;
            }else if(target > arr[mid]){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,50};
        int target = 60;

        int result = binarySearch(arr, target);

        if(result == -1){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element is found in index:"+result);
        }


    }
}
