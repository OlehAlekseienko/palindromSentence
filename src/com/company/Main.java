package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	String str = "Я — арка края";
	str = str.toLowerCase();
	str = str.replaceAll(" ", "");
        str = str.replaceAll("\\,", "");
        str = str.replaceAll("\\!", "");
        str = str.replaceAll("\\—", "");
	boolean isPalindrom = true;
	String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse += str.charAt(str.length()-1 -i);
        }
        System.out.println(reverse);
        if (str.equals(reverse)){
            System.out.println("Palindrom ok");
        }
        else System.out.println("Palindrom no ok");
        }
}
