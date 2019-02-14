package ifstatements;

public class IsITECClassCode {

    public static void main(String[] args) {

        String class1 = "ITEC 1150";
        String class2 = "ITEC 2545";
        String class3 = "BTEC 1100";
        String class4 = "SPAN 1000";
        String class5 = "ITEC 1";        // too short
        String class6 = "ITEC 12345678";   // too long


        System.out.println(isCompleteItecClass(class1));   //should print true
        System.out.println(isCompleteItecClass(class2));   //should print true
        System.out.println(isCompleteItecClass(class3));   //should print false
        System.out.println(isCompleteItecClass(class4));   //should print false
        System.out.println(isCompleteItecClass(class5));   //should print false
        System.out.println(isCompleteItecClass(class6));   //should print false

    }

    private static boolean isCompleteItecClass(String className) {

        /*  TODO if the classname is an ITEC class, return true
        Otherwise, return false.

        An ITEC class starts with the string "ITEC"
         AND the entire string is 9 characters long.

        There's a startsWith method that might be useful.
        *
        * */

        return false;  // replace with your code.
    }

}
