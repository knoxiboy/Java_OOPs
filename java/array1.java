//adding martices
package CodeWithHarry.java;

import java.util.*;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows = ");
        int row = sc.nextInt();
        System.out.print("no. of columbs = ");
        int col = sc.nextInt();

        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] matrix = new int[row][col];

        //for input
        System.out.println("For 1st matrix :-");
        for(int i = 0; i < row; i++){
            System.out.print("Enter no.'s for row "+ i +" : ");
            for(int j = 0; j < col; j++){
                matrix1[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("For 2nd matrix :-");
        for(int i = 0; i < row; i++){
            System.out.print("Enter no.'s for row "+ i +" : ");
            for(int j = 0; j < col; j++){
                matrix2[i][j] = sc.nextInt(); 
            }
        }

        //for adding and output
        System.out.println("Final matrix :- ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
