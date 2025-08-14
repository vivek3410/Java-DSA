public class Binary_Search {

    public static int binarySearch(int[] arr,int target){
        int left = 0, right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return -1;

    }

    public static int binarySearchRec(int[] arr,int target,int left,int right){


        if(left > right){
            return -1;
        }

        int mid = left + (right - left)/2;

        if(arr[mid] == target){
            return mid;
        }
        else if(target < mid){
            return binarySearchRec(arr, target, left, mid -1);
        }
        else{
            return binarySearchRec(arr, target, mid + 1, right);
        }

    }
    public static void main(String[] args) {
        int[] data = {1,3,5,7,9};

        int target = 9;
        int result = binarySearchRec(data,target,0,data.length - 1);

        System.out.println(result != -1 ? "Found at index " + result : "Not Found");
    }
}
