/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Misc.Conversor;
import java.util.Scanner;

/**
 *
 * @author JADPA-01
 */
public class Menu implements IMenu {
    
     Scanner sc = new Scanner(System.in);
    
    /**
     *
     */
     @Override
    public  void Opciones(){
        
        System.out.println("Bienvenido al Conversor");
        System.out.println("1.Convertir bytes a Kilobytes");
        System.out.println("2.Convertir Kilobytes a Megabytes");
        System.out.println("3.Salir");
    
    }
    
     @Override
    public  void MostrarMenu(){
        
        int op=0;
        double op1;
        
        do{
            
            System.out.println();
            Opciones();
            System.out.println();
            op= sc.nextInt();
            
             switch(op)
             {
                 case 1 -> {
                     System.out.println("Ingrese el valor a convertir a Kilobytes");
                     op1 = sc.nextDouble();
                     System.out.println(Conversor.byteToKilobytes(op1));
                }
                 case 2 -> {
                     System.out.println("Ingrese el valor a convertir a Megabytes");
                     op1= sc.nextDouble();
                     System.out.println(Conversor.KilobToMegabytes(op1));
                }
                 case 3 -> {
                     System.exit(0);
                     System.out.println("Usted esta saliendo del programa");
                }
                 default -> System.out.println("Ingrese una opcion valida");
             }
            
            
            
        } while (op!=0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
