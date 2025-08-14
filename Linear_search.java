public class Linear_search {


    public static int linearSearch(int[] arr,int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] data = {5,2,9,1,3};

        int target = 1;

        int result = linearSearch(data,target);
        System.out.println(result != -1 ? "Found at index " + result : "Not Found");
    }
}