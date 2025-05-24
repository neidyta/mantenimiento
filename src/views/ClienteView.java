/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controllers.ClienteController;
import java.util.List;
import java.util.Scanner;
import models.Cliente;

public class ClienteView {
    
    private ClienteController clienteController;
    private Scanner entrada;

    public ClienteView() {
        this.clienteController = new ClienteController();
        this.entrada = new Scanner(System.in);
    }
    
    public void mostrarMenu(){
        int opcion;
        do {      
            System.out.println("Neidy Triana Alonso");
            System.out.println("1072645190");
            System.out.println("\n == MENU CLIENTE ==");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion ");
            opcion = entrada.nextInt();
            
            entrada.nextLine();
            
            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                    
                case 2:
                    mostrarClientes();
                    break;
                    
                case 3:
                    System.out.println("hasta la vista");
                    break;
                    
                default:
                    System.out.println("opcio invalida");
            }
            
        } while (opcion !=3);
    }
    
    public void agregarCliente(){
        System.out.println("\n Agregar cliente ==");
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Email: ");
        String email = entrada.nextLine();
        System.out.println("Telefono: ");
        String telefono = entrada.nextLine();
        System.out.println("Direccion: ");
        String direccion = entrada.nextLine();
        
        clienteController.agregarCliente(nombre, email, telefono, direccion);
        System.out.println("Cliente agregado con exito");
    }
    
    private void mostrarClientes(){
        System.out.println("\\ n ==LISTA DE CLIENTES ==");
        List<Cliente> clientes = clienteController.obtenerCliente();
        if(clientes.isEmpty()){
            System.out.println("No hay clientes registrados");
        } else{
            for(Cliente cliente:clientes){
                System.out.println(cliente);
            }
        }
    }
    
    
}


