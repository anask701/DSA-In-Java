package DSA.Arrays;

import java.util.Scanner;

public class Lec10_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //Input
        for(int i=0; i<size; i++){

            numbers[i] = sc.nextInt();

        }

        // min max function

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // output

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }

            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
    }
}
