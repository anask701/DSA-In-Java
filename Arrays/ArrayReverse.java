package DSA.Arrays;

import java.util.Scanner;

public class ArrayReverse {

    public static void reverseArray(int n) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int A[] = new int[N];

        //Input
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        // Output
        for(int i=N-1; i>=0; i--){
            System.out.print(A[i] + " ");
        }
        return;
    }
    

    public static void main(String[] args) {
        reverseArray(0);
                
    }
   
}
