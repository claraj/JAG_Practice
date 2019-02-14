package ifstatements;

import static input.InputUtils.yesNoInput;

public class IsSocialMediaUser {

    public static void main(String[] args) {

        boolean fbUser = yesNoInput("Do you use facebook?");
        boolean igUser = yesNoInput("Do you use instagram?");

        boolean socialMedia = isSocialMediaUser(fbUser, igUser);

        System.out.println("This person uses social media: " + socialMedia);  // prints true or false

    }

    private static boolean isSocialMediaUser(boolean facebook, boolean instagram) {

        // todo return true if the user uses at least one of facebook or instagram or both.
        // return false if user doesn't use either.

        return false;
    }


}
