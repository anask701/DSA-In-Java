package DSA;



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

    public static void checkPrime(int n) {

        Queue<Integer> prime = new LinkedList<Integer>();

        int count = 0;

        for(int i=1; i<=n; i++){
                if(n%i == 0){
                    count++;
                }
            }
            if(count == 2){
                prime.add(n);
                System.out.println(prime);
                
            }
            else{
                System.out.print("");
            }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            int n = sc.nextInt();
            
            checkPrime(n);
            
        }

        
        

        

        
    }


        
        
               
}
