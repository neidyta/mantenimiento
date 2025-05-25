/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controllers.MascotaController;
import java.util.List;
import java.util.Scanner;
import models.Mascota;

public class MascotaView {
    
    private MascotaController mascotaController;
    private Scanner entrada;

    public MascotaView() {
        this.mascotaController = new MascotaController();
        this.entrada = new Scanner(System.in);
    }
    
    public void mostrarMenuMas(){
        int opcion;
        do {      
            System.out.println("\n == MENU MASCOTAS ==");
            System.out.println("1. Agregar mascota");
            System.out.println("2. Mostrar mascotas");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion ");
            opcion = entrada.nextInt();
            
            entrada.nextLine();
            
            switch (opcion) {
                case 1:
                    agregarMascota();
                    break;
                    
                case 2:
                    mostrarMascotas();
                    break;
                    
                case 3:
                    System.out.println("hasta la vista");
                    break;
                    
                default:
                    System.out.println("opcio invalida");
            }
            
        } while (opcion !=3);
    }
    
    public void agregarMascota(){
        System.out.println("\n Agregar mascota ==");
        System.out.println("Edad: ");
        String edad = entrada.nextLine();
        System.out.println("especie: ");
        String especie = entrada.nextLine();
        System.out.println("alergia: ");
        String alergia = entrada.nextLine();
        System.out.println("raza: ");
        String raza = entrada.nextLine();
        
        mascotaController.agregarMascota(edad, especie, alergia, raza);
        System.out.println("mascota agregada con exito");
    }
    
    private void mostrarMascotas(){
        System.out.println("\\ n ==LISTA DE MASCOTAS ==");
        List<Mascota> mascotas = mascotaController.obtenerMascota();
        if(mascotas.isEmpty()){
            System.out.println("No hay mascotas registrados");
        } else{
            for(Mascota mascota:mascotas){
                System.out.println(mascota);
            }
        }
    }
}
