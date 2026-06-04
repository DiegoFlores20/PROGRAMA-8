package com.example.programa8tarea;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Algoritmo para calcular el promedio de 3 estudiantes con ciclo for");
        System.out.println("Validar las notas en un rango de 0 a 10 con ciclo while");

        for (int i = 1; i <= 3; i++) {

            System.out.println("\nEstudiante " + i);

            System.out.print("Ingrese la primera nota: ");
            double nota1 = leer.nextDouble();

            while (nota1 < 0 || nota1 > 10) {
                System.out.print("Error. Ingrese una nota entre 0 y 10: ");
                nota1 = leer.nextDouble();
            }

            System.out.print("Ingrese la segunda nota: ");
            double nota2 = leer.nextDouble();

            while (nota2 < 0 || nota2 > 10) {
                System.out.print("Error. Ingrese una nota entre 0 y 10: ");
                nota2 = leer.nextDouble();
            }

            System.out.print("Ingrese la tercera nota: ");
            double nota3 = leer.nextDouble();

            while (nota3 < 0 || nota3 > 10) {
                System.out.print("Error. Ingrese una nota entre 0 y 10: ");
                nota3 = leer.nextDouble();
            }

            double promedio = (nota1 + nota2 + nota3) / 3;

            System.out.println("Promedio: " + promedio);

            if (promedio >= 7) {
                System.out.println("El estudiante: Aprobado");
            } else {
                System.out.println("El estudiante: Reprobado");
            }
        }

        leer.close();
    }
}