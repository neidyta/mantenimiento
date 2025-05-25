/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controllers.CitasController;
import java.util.List;
import java.util.Scanner;
import models.Citas;

public class CitasView {
 
    private CitasController citasController;
    private Scanner entrada;

    public CitasView() {
        this.citasController = new CitasController();
        this.entrada = new Scanner(System.in);
    }
    
    public void mostrarMenuCit(){
        int opcion;
        do {      
            
            System.out.println("\n == MENU CITAS ==");
            System.out.println("1. Agregar cita");
            System.out.println("2. Mostrar citas");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion ");
            opcion = entrada.nextInt();
            
            entrada.nextLine();
            
            switch (opcion) {
                case 1:
                    agregarCitas();
                    break;
                    
                case 2:
                    mostrarCitas();
                    break;
                    
                case 3:
                    System.out.println("hasta la vista");
                    break;
                    
                default:
                    System.out.println("opcion invalida");
            }
            
        } while (opcion !=3);
    }
    
    public void agregarCitas(){
        System.out.println("\n Agregar cita ==");
        System.out.println("Mascota: ");
        String mascota = entrada.nextLine();
        System.out.println("veterinario: ");
        String veterinario = entrada.nextLine();
        System.out.println("fecha: ");
        String fecha = entrada.nextLine();
        System.out.println("motivo: ");
        String motivo = entrada.nextLine();
        
        citasController.agregarCitas(mascota, veterinario, fecha, motivo);
        System.out.println("Cita agregado con exito");
    }
    
    private void mostrarCitas(){
        System.out.println("\\ n ==LISTA DE CITAS ==");
        List<Citas> cita = citasController.obtenerCitas();
        if(cita.isEmpty()){
            System.out.println("No hay clientes registrados");
        } else{
            for(Citas citas:cita){
                System.out.println(citas);
            }
        }
    }
}
