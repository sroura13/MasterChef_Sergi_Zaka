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
        String[] puntuacion = new String[participantes];

        for (int i = 0; i < chefs.length; i++) {
            System.out.print("Chef introduce tu nombre: ");
            chefs[i] = lector.nextLine().replaceAll(" +", " ");
            System.out.print("Introduce el nombre de la receta: ");
            platos[i] = lector.nextLine().replaceAll(" +", " ");
        }

        int notas[] = new int[3];
        String[] jurado = new String[3];
        jurado[1] = "jurado1"; 
        jurado[2] = "jurado2"; 
        jurado[3] = "jurado3"; 
        
        for (int i = 0; i < notas.length; i++) {
            notas [i] = aleatorio.nextInt();
        }

        System.out.println(chefs[0]);
        System.out.println(platos[0]);
        System.out.println(chefs[1]);
        System.out.println(platos[1]);

    }

}
