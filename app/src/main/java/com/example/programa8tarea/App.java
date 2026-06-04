package com.example.programa8tarea;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Algoritmo para calcular el promedio de 3 estudiantes con ciclo for");

        for (int i = 1; i <= 3; i++) {

            System.out.println("\nEstudiante " + i);

            System.out.print("Ingrese la primera nota: ");
            double nota1 = leer.nextDouble();

            System.out.print("Ingrese la segunda nota: ");
            double nota2 = leer.nextDouble();

            System.out.print("Ingrese la tercera nota: ");
            double nota3 = leer.nextDouble();

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