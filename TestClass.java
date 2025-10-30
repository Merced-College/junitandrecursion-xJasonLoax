// Jason Loa
// 10/30/25
// Recursion Problems with JUnit tests


public class TestClass {
    public static void main (String[] args) {

        System.out.println(countHi("xxhixxxxhixxxx"));

    } // end main

    // recursion problem 2
    public static int countHi(String str) {
        System.out.println(str);
        //base case
        if(str.length() <= 1)
            return 0;

        char firstLetter = str.charAt(0);
        char secondLetter = str.charAt(1);
        
        if (firstLetter == 'h' && secondLetter == 'i') 
            return 1 + countHi(str.substring(2));
         
        return countHi(str.substring(1));

    }// END METHOD countHi
} // end TestClass