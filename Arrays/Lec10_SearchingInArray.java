package DSA.Arrays;

import java.util.Scanner;

public class Lec10_SearchingInArray {
    public static void main(String[] args) {

        // Linear Search

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the Array : ");
        int size = sc.nextInt();
        
        // Initilising Array
        int numbers[] = new int[size];

        // Taking Input
        System.out.println("Enter the values you want to put in the array : ");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        // Searching the Index
        System.out.println("Enter value what you wanna search : ");
        int x = sc.nextInt();

        // Output Print
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println(x + " Found at Index " + i);
            }
        }
    }
}
