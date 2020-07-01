package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program To Find All Roots Of A Quadratic Equation
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();

        String[] values = equation.split(" ");
        // a + b - c = 0
        double a = Double.parseDouble(values[0]);
        double b = Double.parseDouble(values[2]);
        double c = Double.parseDouble(values[4]);

        double sumX = (b / -1) / a;
        double multilicationX = c / a;

        System.out.print("X1 + X2 = " + sumX);
        System.out.print("X1 * X2 = " + multilicationX);
    }
}
