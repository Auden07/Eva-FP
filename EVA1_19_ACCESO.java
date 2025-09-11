/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_acceso;

import java.util.Scanner;

/**
 *
 * @author WinUser
 */
public class EVA1_19_ACCESO {
    //CONSTANTES
    final static String ACCESO_USU = "AUDEN";
    final static String ACCESO_CONTRA = "1234";
    //final static souble PI = 3.1416;
    
    public static void main(String[] args) {
        String usuario, contraseña;
        Scanner captu = new Scanner(System.in);

        System.out.println("*******CONTROL DE ACCESO******");
        System.out.println("Restaurante la cucaracha crocante");
        System.out.println("Usuario");
        usuario = captu.nextLine();
        System.out.println("Contraseña");
        contraseña = captu.nextLine();
        if(usuario.equals(ACCESO_USU)){
            if(contraseña.equals(ACCESO_CONTRA)){
                System.out.println("ACCESO CONCEDIDO!!");
            }else{
                System.out.println("ACCESO DENEGADO!!");
            }

        } else{
            System.out.println("INCORRECTO");
        }
    }
    
}
