package com.myprojecttest;

import java.util.Scanner;

	public class AñoBisiestoCiclico {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int año;

	        do {
	            System.out.println("Ingrese un año para verificar si es bisiesto:");
	            año = scanner.nextInt();

	            if (año <= 0) {
	                System.out.println("Por favor, ingrese un año válido mayor a cero.");
	            }
	        } while (año <= 0);

	        if (esBisiesto(año)) {
	            System.out.println(año + " es un año bisiesto.");
	        } else {
	            System.out.println(año + " no es un año bisiesto.");
	        }

	        scanner.close();
	    }

	    public static boolean esBisiesto(int año) {
	        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
	    }
	}
