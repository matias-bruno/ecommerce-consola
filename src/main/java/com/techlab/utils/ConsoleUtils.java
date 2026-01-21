package com.techlab.utils;

import java.util.Scanner;

/**
 *
 * @author matias-bruno
 */
public class ConsoleUtils {
    private static final Scanner sc = new Scanner(System.in);
    
    public static int inputInteger(String message) {
        int number;
        System.out.println(message);
        while(true) {
            try {
                number = Integer.parseInt(sc.nextLine());
                return number;
            } catch(NumberFormatException ex) {
                System.out.println("Error: ingresa un número entero válido");
            }
        }
    }
    
    public static double inputDouble(String message) {
        double number;
        System.out.println(message);
        while(true) {
            try {
                number = Double.parseDouble(sc.nextLine());
                return number;
            } catch(NumberFormatException ex) {
                System.out.println("Error: ingresa un número decimal válido (usa punto para decimales");
            }
        }
    }
}
