package DSA.Arrays;

import java.util.Scanner;

public class Lec10_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        
        int numbers[] = new int[size];

        // input
        for(int i=0; i<size; i++){

            numbers[i] = sc.nextInt();

        }

        // using function

        boolean isAsending = true;

        for(int i=0; i<numbers.length-1; i++){ // Notice numbers.length - 1 as termination condition
            if(numbers[i] > numbers[i+1]){ // This is the condition for desending order
                isAsending = false;
            }

        }
        
        if(isAsending){
            System.out.println("The array is sorted in ascending order ");
        }
        else{
            System.out.println("The array is not sorted in ascending order ");
        }
    }
}
