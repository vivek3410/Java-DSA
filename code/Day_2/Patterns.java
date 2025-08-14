package Day_2;
import java.util.Scanner;

public class Patterns {

    public static void leftAligned(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // leftAligned();

        String a = "hello";
        String b = new String("hello");

        System.out.println(a==b);
    }
}
