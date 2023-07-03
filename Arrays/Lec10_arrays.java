package DSA.Arrays;

public class Lec10_arrays {
    public static void main(String[] args) {
        // initialising array
        int marks[] = new int[3];

        // making entries
        marks[0] = 97; // phy
        marks[1] = 98; // chem
        marks[2] = 95; // eng

        // printing 
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // or you can print using loop
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }

        // Can also initialise an array by this method.

        int numbers[] = {40, 60, 80};
        System.out.println(numbers[1]);


    }
}
