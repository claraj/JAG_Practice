package numbers;

import static input.InputUtils.intInput;

public class Money {

    public static void main(String[] args) {

        int pennies = intInput("How many pennies do you have? ");
        int nickels = intInput("How many nickels do you have?");
        int dimes = intInput("How many dimes do you have?");
        int quarters = intInput("How many quarters do you have?");

        int total = countCoins(pennies, nickels, dimes, quarters);

        System.out.println("You have a total of " + total);

    }

    private static int countCoins(int pennies, int nickels, int dimes, int quarters) {

        /* TODO calculate and return the total number of pennies.  So, if the user has
        * 3 pennies   (3c)
        * 1 nickel    (5c)
        * 2 dimes     (20c)
        * 1 quarter   (25c)
        *
        * they would have 3 + 5 + 20 + 25 = 53c
        * Your method would return 53.
        * */

        return 0;

    }

}
