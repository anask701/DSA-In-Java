package DSA.Arrays2D;

import java.util.Scanner;

public class Lec11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Row and columns : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int [rows][cols];

        // input
        // rows
        for(int i=0; i<rows; i++){
            //columns
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();

            }
        }

        // Output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
}
