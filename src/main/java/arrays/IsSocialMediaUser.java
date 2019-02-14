package arrays;

import static input.InputUtils.yesNoInput;

public class IsSocialMediaUser {

    public static void main(String[] args) {

        String[] socialMedia = {"Facebook", "Twitter", "Instagram", "Snapchat"};
        boolean[] usesSocialMedia = new boolean[socialMedia.length];  // parallel array to social media array, same length

        for (int s = 0 ; s < socialMedia.length ; s++) {
            boolean uses = yesNoInput("Do you use " + socialMedia[s] + " ?");
            usesSocialMedia[s] = uses;
        }

        // TODO call isSocialMediaUser and print a string with the result - does the user use any social media platforms?

    }


    private static boolean isSocialMediaUser(boolean[] socialMediaPlatforms) {

        // todo return true if the user uses at least one of the social media platforms
        // return false if user doesn't use any of the social media platforms
        // In other words, if any of the booleans in socialMediaPlatforms are true, return true
        // if they are all false, return false

        return false;

    }


}
