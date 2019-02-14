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

        // TODO call isSocialMediaUser

    }


    private static boolean isSocialMediaUser(boolean[] socialMediaPlatforms) {

        // todo return true if the user uses at least one of the social media platforms
        // return false if user doesn't use any of the
        // if any of the

        return false;

    }


}
