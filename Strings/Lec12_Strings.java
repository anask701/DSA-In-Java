package DSA.Strings;

public class Lec12_Strings {
    public static void main(String[] args) {
        //concatenation
        String firstname = "Tony";
        String lastName = "Stark";
        String fullName = firstname + " " + lastName;

        System.out.println(fullName);

        // length function
        System.out.println(fullName.length());

        //charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        // compare
        if(firstname.compareTo(lastName) == 0){
            System.out.println("Strings are equal");

        }
        else{
            System.out.println("Strings are not equal");
        }

        // subStrings
        String sentence = "TonyStark";
        String name = sentence.substring(4);
        System.out.println(name);

        //Strings are immutable -> They can not be changed once defined.
        
    }
}
