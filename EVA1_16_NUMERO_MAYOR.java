/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author WinUser
 */
public class EVA1_16_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        Scanner captu = new Scanner (System.in);
        System.out.println("Ingresa el segundo numero:");
        num1 = captu.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = captu.nextInt();
        if (num1>num2){
        System.out.println("El primer numero es mayor que el segundo");
        }else {
        System.out.println("El segundo numero es mayor el que primero");}
        
        }
                
        
    }
    
}
