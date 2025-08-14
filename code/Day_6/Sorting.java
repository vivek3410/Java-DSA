package Day_6;

import java.util.Arrays;

public class Sorting {

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void selectionSort(int[] arr){

        int n = arr.length;
        int minIndex = 0;

        for(int i = 0;i<n-1;i++){
            minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void mergeSort(int[] arr,int left,int right){

        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr,left,right,mid);
        }
    }

    public static void merge(int[] arr,int left,int right,int mid){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for(int x = 0;x<n1;x++){
            lArr[x] = arr[left + x];
        }

        for(int x=0;x<n2;x++){
            rArr[x] = arr[mid+1+x];
        }


        int i=0;
        int j = 0;
        int k = left;

        while(i<n1 && j<n2){

            if(lArr[i] < rArr[j]){
                arr[k] = lArr[i];
                i++;
            }else{
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }



    public static void main(String[] args) {
        int[] arr = {5,10,2,8,1};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(arr));

        // selectionSort(arr);
        // insertionSort(arr);
        mergeSort(arr, 0, arr.length-1);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(arr));
    }
}
