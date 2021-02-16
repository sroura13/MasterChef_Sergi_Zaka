/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterchef_sergi_zaka;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class MasterChef_sergi_zaka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();

        int participantes;
        do {
            System.out.print("Cuantos chefs participan? Máximo 10: ");
            participantes = lector.nextInt();
            lector.nextLine();
            if (participantes > 10) {
                System.out.println("Por favor introduce máximo 10 participantes");
            }
        } while (participantes > 10);

        System.out.println("");
        String[] chefs = new String[participantes];
        String[] platos = new String[participantes];
        float[] puntuacion = new float[participantes];

        for (int i = 0; i < chefs.length; i++) {
            System.out.print("Chef introduce tu nombre: ");
            chefs[i] = lector.nextLine().replaceAll(" +", " ");
            System.out.print("Introduce el nombre de la receta: ");
            platos[i] = lector.nextLine().replaceAll(" +", " ");
            System.out.println("");
        }

        String[] jurado = {"jurado1", "jurado2", "jurado3"};

        int notas[] = new int[3];
        for (int i = 0; i < chefs.length; i++) {
            notas[0] = aleatorio.nextInt(11);
            notas[1] = aleatorio.nextInt(11);
            notas[2] = aleatorio.nextInt(11);
            puntuacion[i] = (notas[0] + notas[1] + notas[2]) / 3;
        }

        for (int i = 0; i < chefs.length; i++) {
            System.out.println("Chef " + chefs[i]);
            System.out.println("PLATO: " + platos[i]);
            System.out.println("PUNTUACIÓN: " + puntuacion[i]);
            System.out.println("");
        }

        float mayor = puntuacion[0];
        String ganador = chefs[0];

        for (int i = 1; i < puntuacion.length; i++) {
            if (puntuacion[i] > mayor) {
                ganador = chefs[i];
                mayor = puntuacion[i];
            }
        }
        System.out.println("El ganador es " + ganador + " con una nota de " + mayor);
    }

}
