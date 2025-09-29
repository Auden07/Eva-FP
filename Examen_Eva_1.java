/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_eva_.pkg1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Examen_Eva_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in); 
        double natacion,ciclismo,carrera;
        System.out.println("ninguna prueba excede <60: imprimir: Excelente");
        System.out.println("Captura el tiempo en :");
        natacion = input.nextDouble();
        System.out.println("ninguna prueba excede <70: imprimir: Buena");
        System.out.println("captura el tiempo en ");
        ciclismo = input.nextDouble();
         System.out.println("en otro caso <150: imprimir: Regular");
        System.out.println("Captura el tiempo en :");
        
    }
    
}
