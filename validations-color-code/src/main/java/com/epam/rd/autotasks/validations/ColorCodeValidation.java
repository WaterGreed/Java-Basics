package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if (color != null) {
            if(color.length() == 7 && Pattern.matches("\\#([0-9A-Fa-f]{6})", color)) {
                return true;
            }
            else if(color.length() == 4 && Pattern.matches("\\#([0-9A-Fa-f]{3})", color)) {
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





