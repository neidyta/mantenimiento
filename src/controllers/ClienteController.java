/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.ClienteDAO;
import java.util.List;
import models.Cliente;

public class ClienteController {
    
    private ClienteDAO clienteDAO;

    public ClienteController() {
        this.clienteDAO = new ClienteDAO();
    }
    
    public void agregarCliente(String nombre, String email, String telefono, String direccion){
        Cliente cliente = new Cliente(nombre, email, telefono, direccion);
        clienteDAO.agregarCliente(cliente);
        System.out.println("cliente agregado correctamente" +cliente);
    }
    
    public List<Cliente> obtenerCliente(){
        return clienteDAO.obtenerCliente();
    }
    
}
