package com.college.algoritmization;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.print("Hello World!");
        System.out.print("Hello World!\n");

        String format = "First world {0} | Second argument {2} | Third argument {1}";

        String message = MessageFormat.format(format, "'Hello world'", 12345, true);
        System.out.println(message);

        String format2 = "First world %-15d | Second argument %.8s %n";
        System.out.printf(format2, 1234531234, "My dear friend");
    }
}
