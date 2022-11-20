package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validEmail {
    public static void main(String[] args) {

        String email = "abc100@yahoon.com";
        email = "abc@yahoo.com";
        email = "abc111@abc.com";
        email = "abc-100@yahoon.com";
        email = "abc.100@abc.net";
        email = "abc@1.com";
        email = "abc+100@gmail.com";
        email = "abc+100@gmail.com.com";


        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcher = pattern.matcher(email);
        System.out.println(matcher.find());
    }

}
