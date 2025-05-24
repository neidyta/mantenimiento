/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.VeterinarioDAO;
import java.util.List;
import models.Veterinario;

public class VeterinarioController {
    
    private VeterinarioDAO veterinarioDAO;

    public VeterinarioController() {
        this.veterinarioDAO = new VeterinarioDAO();
    }
    
    public void agregarVeterinario(String nombre, String email, String telefono, String especialidad){
        Veterinario veterinario = new Veterinario(nombre, email, telefono, especialidad);
        veterinarioDAO.agregarVeterinario(veterinario);
        System.out.println("veterinario agregado correctamente" +veterinario);
    }
    
    public List<Veterinario> obtenerVeterinario(){
        return veterinarioDAO.obtenerVeterinario();
    }
}
