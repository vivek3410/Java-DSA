package Day_5;

public class Recursion {
    
    public static void printNum(int n){
        if(n == 1) {
            System.out.print(n + " ");
            return;
        };
        printNum(n-1);
        System.out.print(n + " ");
    }

    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        return n * fact(n-1);
    }

    public static int fib(int n){
        if(n<=1){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

    public static String reverse(String str){
        
        if(str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static boolean isPalindrme(String str,int left,int right){

        if(left >= right) return false;
        else if(str.charAt(left)  == str.charAt(right)) return true;
        
        return isPalindrme(str, left + 1, right-1);
    }


    public static int bs(int[] arr,int left, int right,int key){
        if(left > right) return -1;
        int mid = (left + right) / 2;
        if(arr[mid] == key) return mid;
        else if(arr[mid] > key) {
            return bs(arr, left, mid-1, key);
        }else{
            return bs(arr, mid+1, right, key);
        }

    }
    public static void main(String[] args) {
        // printNum(10);

        int res = fib(4);
        System.out.println(res);

//         int n = 5;
// 
//         for(int i = 0;i<=n;i++){
//             System.out.print(fib(i)+ " ");
//         }

        // String s = reverse("java");

        // System.out.println(s);

        // String str = "MOMs";

        // System.out.println(isPalindrme(str, 0, str.length()-1));

//         int[] arr = {4,6,9,10,12,18};
// 
//         int result = bs(arr, 0, arr.length-1, 12);
// 
//         if(result == -1){
//             System.out.println("Element not found");
//         }else{
// 
//             System.out. println("Element found at index: " + result );
//         }

    }
}
