package DSA.Arrays2D;

import java.util.Scanner;

public class Lec11_Search_In_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column : ");

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] number = new int[rows][cols];

        //input
        //rows
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number to search ; ");
        int x = sc.nextInt();

        // Searching
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                // compare with x
                if(number[i][j] == x){
                    System.out.println("X found at locations (" + i + ", " + j + ")");
                }
            }
        }
    }
}
