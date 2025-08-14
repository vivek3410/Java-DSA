package Day_2;
public class Array {

//     public static void leftRotateByK(int[] arr,int k){
//         int n = arr.length;
//         k = k % n;
// 
//         System.out.println(k);
//     }

    public static void swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;
    }

    public static int[] reversal(int[] arr){

        int left = 0;
        int right = arr.length - 1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;

    }


    public static int[] altReversal(int[] arr){

        for(int i = 0;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        return arr;
    }

    public static void reversalNum(){
        int number = 45678;

        int reversed = 0;

        while(number!=0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        System.out.println(reversed);
    }

    public static void compress(){
        String str = "aaaabbccc";
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }else{
                sb.append(str.charAt(i-1));
                sb.append(count);
                count = 1;
            }
        }

        sb.append(str.charAt(str.length()-1)).append(count);

        System.out.println(sb.toString());
        
    }


    public static void main(String[] args) {
       compress();

    }
}
