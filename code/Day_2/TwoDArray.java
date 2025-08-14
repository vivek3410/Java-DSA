package Day_2;
import java.util.Scanner;

public class TwoDArray {
    
    public static void main(String[] args) {
        int row = 3,col = 3;
        int[][] example = new int[row][col];


        example[0][0] = 1;
        example[0][1] = 2;
        example[0][2] = 3;
        example[1][0] = 4;
        example[1][1] = 5;
        example[1][2] = 6;
        example[2][0] = 7;
        example[2][1] = 8;
        example[2][2] = 9;
        
        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(example[i][j]);
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();

        boolean found = false;
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                if(example[i][j] == value){
                    found = true;
                    break;
                }
            }
            if(found) break;
        }

        if(found){
            System.out.println("Element was found");
        }else{
            System.out.println("Element not found");
        }
        
    }
}
