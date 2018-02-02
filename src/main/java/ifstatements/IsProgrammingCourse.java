package ifstatements;

/**
 * Created by clara on 2/2/18.
 */
public class IsProgrammingCourse {
    
    public static void main(String[] args) {
        
        
        String test = "Web Client & Server Programming";
        boolean isProgrammingClass = isProgrammingClass(test);  // true or false? Is this a programming class?
        
        // Should print "Web Client & Server Programming is a programming class"
        System.out.println(test + " " + boolToIsOrIsNot(isProgrammingClass) + " a programming class");
    
    
        String test2 = "Introduction to Criminal Justice";
        boolean isProgrammingClass2 = isProgrammingClass(test2);  // true or false? Is this a programming class?
        
        // Should print "Introduction to Criminal Justice is not a programming class"
        System.out.println(test2 + "  " + boolToIsOrIsNot(isProgrammingClass2) + " a programming class");
    
        
    }
    
    public static String boolToIsOrIsNot(boolean bool) {
        // todo if bool is true, return "is"
        // todo if bool is false, return "is not"
        
        // todo replace with your code
        return "";
        
    }
    
    
    public static boolean isProgrammingClass(String className) {
    
        // TODO check if className is the same as any of the programming class names.
        // TODO the check should be case-insensitive. So "Java Programming" and "java programming" and "JaVa PrOgRaMiNg" are all programming classes.
        // Return true if it is, false otherwise.
        
        String java = "Java Programming";
        String csharp = "C# Programming";
        String web = "Web Client & Server Programming";
        
        // TODO replace this return statement with your code.
        return false;
        
        
    }
    
    
}
