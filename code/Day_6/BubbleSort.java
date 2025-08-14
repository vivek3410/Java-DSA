package Day_6;
public class BubbleSort {

    public static int[] bubbleSort(int[] arr){

        int n = arr.length;

        for(int i =0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,10,4,8,12};

        int[] result = bubbleSort(arr);

        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
