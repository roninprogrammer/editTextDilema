package com.app.specialcharacter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUtil {
    private static final String REGEX_ALPHABET_SMALL_CASE = "[a-z]";
    private static final String REGEX_ALPHABET_UPPER_CASE = "[A-Z]";
    private static final String REGEX_ALPHABET_UPPER_AND_LOWER_CASE = "[a-zA-Z]";
    private static final String REGEX_NUMBERS = "[0-9]";
    private static final String NOT_ALPHANUMERIC = "[^a-zA-Z0-9]";

    public static boolean isMatchRegex(String targetString, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(targetString);
        return matcher.find();
    }
}
