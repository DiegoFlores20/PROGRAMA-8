package com.example.programa8tarea;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        System.out.print("Ingrese la primera nota: ");
        nota1 = leer.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        nota2 = leer.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        nota3 = leer.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Promedio:" + promedio);
        if (promedio >=7) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: Reprobado");
        }
        System.out.println("Presione ENTER para salir...");
        try{
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}