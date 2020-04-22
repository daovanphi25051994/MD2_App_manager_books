/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author samsung
 */
public class Validate {
    Pattern pattern;
    Matcher matcher;
    public static final String REGEX_EMAIL = "^[A-Za-z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)(\\.[a-zA-Z0-9]+)?$";
    public static final String REGEX_PASSWORD = "^[A-Za-z0-9_]{6,20}$";
    public static final String REGEX_PHONE_NUMBER = "^0\\d{9}$";
    public boolean validateEmail(String string){
        pattern = Pattern.compile(REGEX_EMAIL);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
     public boolean validatePassword(String string){
        pattern = Pattern.compile(REGEX_PASSWORD);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
      public boolean validatePhoneNumber(String string){
        pattern = Pattern.compile(REGEX_PHONE_NUMBER);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    
}
