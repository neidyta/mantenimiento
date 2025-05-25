/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;


import dao.CitasDAO;
import java.util.List;
import models.Citas;

public class CitasController {
 
    private CitasDAO citasDAO;

    public CitasController() {
        this.citasDAO = new CitasDAO();
    }
    
    public void agregarCitas(String mascota, String veterinario, String fecha, String motivo){
        Citas citas = new Citas(mascota, veterinario, fecha, motivo);
        citasDAO.agregarCitas(citas);
        System.out.println("cita agregado correctamente" +citas);
    }
    
    public List<Citas> obtenerCitas(){
        return citasDAO.obtenerCitas();
    }
    

}
