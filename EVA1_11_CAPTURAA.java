/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_capturaa;

import java.util.Scanner;

/**
 *
 * @author WinUser
 */
public class EVA1_11_CAPTURAA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CALCULO LA VELOCIDAD
        //SOLICITAR DISTANCIA (M) Y TIEMPO (S)
        // DECLAR LA VELOCIDAD (M/S)
        //DECLAR VARIABLES Y SCANNER
        
        //SOLICITAR DATOS
        
        //REALIZAR CALCULOS 
        
        //MOSTRAR ESULTADOS
        Scanner input = new Scanner(System.in);
        double velocidad,D,T,velocidad2;
        System.out.println("Captura la distancia en (M):");
        D = input.nextDouble();
        System.out.println("captura el tiempo en (S):");
        T = input.nextDouble();
        velocidad = D/T;
        System.out.println("La velocidad (M/S) es:");
        System.out.println(velocidad);
        velocidad2 = velocidad * 3.6;
        System.out.println("La velocidad en km/hr es:");
        System.out.println(velocidad2);
        
        
    } 
    
}
