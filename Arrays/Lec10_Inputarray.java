package DSA.Arrays;

import java.util.Scanner;

public class Lec10_Inputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        // initilising array
        int numbers[] = new int[size];

        // taking input in the array.
        System.out.println("Enter the data in the array : ");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        // Printing the output
        System.out.println("The values in the array are : ");
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }
}
