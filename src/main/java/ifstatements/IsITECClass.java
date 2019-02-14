package ifstatements;

public class IsITECClass {

    public static void main(String[] args) {

        String class1 = "ITEC 1150";
        String class2 = "ITEC 2545";
        String class3 = "BTEC 1100";
        String class4 = "SPAN 1000";

        System.out.println(isItecClass(class1));   //should print true
        System.out.println(isItecClass(class2));   //should print true
        System.out.println(isItecClass(class3));   //should print false
        System.out.println(isItecClass(class4));   //should print false

    }

    private static boolean isItecClass(String className) {

        /*  TODO if the classname is an ITEC class, return true
        Otherwise, return false.

        An ITEC class starts with the string "ITEC". There's a startsWith method that might be useful.
        *
        * */

        return false;  // replace with your code.
    }

}
