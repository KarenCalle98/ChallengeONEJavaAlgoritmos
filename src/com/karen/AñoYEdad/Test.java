package com.myprojecttest;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el año de nacimiento:");
        int año = scanner.nextInt();

        System.out.println("Ingrese el mes de nacimiento (en número):");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el día de nacimiento:");
        int dia = scanner.nextInt();

        // Crear la fecha de nacimiento a partir de los datos ingresados
        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);

        // Fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Calcular la edad en años con un ciclo
        int edad = calcularEdad(fechaNacimiento, fechaActual);

        // Mostrar la edad
        System.out.println("La edad actual es: " + edad + " años.");

        scanner.close();
    }

    public static int calcularEdad(LocalDate fechaNacimiento, LocalDate fechaActual) {
        int edad = 0;
        LocalDate fechaTemporal = fechaNacimiento;

        while (fechaTemporal.isBefore(fechaActual) || fechaTemporal.equals(fechaActual)) {
            edad++;
            fechaTemporal = fechaTemporal.plusYears(1);
        }

        return edad - 1; // Restamos 1 para corregir el exceso de edad por el último año sumado
    }
}
