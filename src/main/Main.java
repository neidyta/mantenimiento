/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import views.ClienteView;
import views.VeterinarioView;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {    
            System.out.println("--------------------");
            System.out.println("==MENU PRINCIPAL==");
            System.out.println("1.Cliente");
            System.out.println("2.Veterinario");
            System.out.println("3.Salir");
            System.out.println("Seleccione una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    ClienteView clienteView = new ClienteView();
                    clienteView.mostrarMenu();
                    break;
                
                case 2:
                    VeterinarioView veterinarioView = new VeterinarioView();
                    veterinarioView.mostrarMenuVet();
                    break;    
                    
                case 3:
                    System.out.println("hasta la vista");
                    break;
                    
                default:
                    System.out.println("opcion invalida");
            }
            
        } while (opcion !=3);
        
        
        
    }
}
