/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controllers.VeterinarioController;
import java.util.List;
import java.util.Scanner;
import models.Veterinario;

public class VeterinarioView {
    
    private VeterinarioController veterinarioController;
    private Scanner entrada;

    public VeterinarioView() {
        this.veterinarioController = new VeterinarioController();
        this.entrada = new Scanner(System.in);
    }
    
    public void mostrarMenuVet(){
        int opcion;
        do {      
            System.out.println("Neidy Triana Alonso");
            System.out.println("1072645190");
            System.out.println("\n == MENU VETERINARIO ==");
            System.out.println("1. Agregar veterinario");
            System.out.println("2. Mostrar veterinario");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion ");
            opcion = entrada.nextInt();
            
            entrada.nextLine();
            
            switch (opcion) {
                case 1:
                    agregarVeterinario();
                    break;
                    
                case 2:
                    mostrarVeterinarios();
                    break;
                    
                case 3:
                    System.out.println("hasta la vista");
                    break;
                    
                default:
                    System.out.println("opcion invalida");
            }
            
        } while (opcion !=3);
    }
    
    public void agregarVeterinario(){
        System.out.println("\n Agregar veterinario ==");
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Email: ");
        String email = entrada.nextLine();
        System.out.println("Telefono: ");
        String telefono = entrada.nextLine();
        System.out.println("Especialidad: ");
        String especialidad = entrada.nextLine();
        
        veterinarioController.agregarVeterinario(nombre, email, telefono, especialidad);
        System.out.println("Veterinario agragado con exito");
    }
    
    private void mostrarVeterinarios(){
        System.out.println("\\ n ==LISTA DE VETERINARIOS ==");
        List<Veterinario> veterinarios = veterinarioController.obtenerVeterinario();
        if(veterinarios.isEmpty()){
            System.out.println("No hay veterinarios registrados");
        } else{
            for(Veterinario veterinario:veterinarios){
                System.out.println(veterinario);
            }
        }
    }
}
