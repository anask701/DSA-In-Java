package DSA.Arrays;

import java.util.Scanner;

public class Lec10_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        String names[] = new String[size];

        // input
        for(int i=0; i<size; i++){

            names[i] = sc.next();
        }

        //Output
        for(int i=0; i<names.length; i++){

            System.out.println("name " + (i + 1) + " is : " + names[i]);
        }

        
    }
}