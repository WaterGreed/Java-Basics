package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        if(email != null) {
            if(Pattern.matches("[a-zA-Z]+\\_[a-zA-Z]+\\d*@epam.com", email)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }

    }
}





