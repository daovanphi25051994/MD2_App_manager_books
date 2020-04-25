/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
    public static final String REGEX_NAME_BOOK = "^[A-Za-z0-9\\s]+$";
    public static final String REGEX_AUTHOR = "^[A-Za-z\\s]+$";
    public static final String REGEX_AMOUNT = "^[1-9][0-9]*$";
    public static final String REGEX_STUDENT_ID = "^[a-zA-Z0-9_]+$";
     public static final String REGEX_STUDENT_NAME = "^[a-zA-Z\\s]+$";
    public boolean validateEmail(String string) {
        pattern = Pattern.compile(REGEX_EMAIL);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    
    public boolean validatePassword(String string) {
        pattern = Pattern.compile(REGEX_PASSWORD);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    
    public boolean validatePhoneNumber(String string) {
        pattern = Pattern.compile(REGEX_PHONE_NUMBER);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    
    public boolean validateBookName(String string) {
        pattern = Pattern.compile(REGEX_NAME_BOOK);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    
    public boolean validateAuthorName(String string) {
        pattern = Pattern.compile(REGEX_AUTHOR);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    
    public boolean validateBookAmount(String string) {
        pattern = Pattern.compile(REGEX_AMOUNT);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    
    public boolean validateStudentID(String string) {
        pattern = Pattern.compile(REGEX_STUDENT_ID);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    
    public boolean validateStudentName(String string) {
        pattern = Pattern.compile(REGEX_STUDENT_NAME);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    
    public boolean isBook(String name, String author, String amount) {
        boolean isValidateName = validateBookName(name);
        boolean isValidateAuthor = validateAuthorName(author);
        boolean isValidateAmount = validateBookAmount(amount);
        if (isValidateAmount && isValidateAuthor && isValidateAmount) {
            return true;
        }
        return false;
    }
    
    public boolean isUser(String email, String password1, String password2, String phoneNumber) {
        boolean isValidateEmail = validateEmail(email);
        boolean isValidatePassword1 = validatePassword(password1);
        boolean isValidatePhoneNumber = validatePhoneNumber(phoneNumber);
        if (isValidateEmail && isValidatePassword1 && isValidatePhoneNumber && password1.equals(password2)) {
            return true;
        }
        return false;
    }
    
     public boolean isStudent(String id, String name) {
        boolean isValidateID = validateStudentID(id);
        boolean isValidateName = validateStudentName(name);
        if (isValidateID && isValidateName) {
            return true;
        }
        return false;
    }
}
