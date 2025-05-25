/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.MascotaDAO;
import java.util.List;
import models.Mascota;

public class MascotaController {
    
    private MascotaDAO mascotaDAO;

    public MascotaController() {
        this.mascotaDAO = new MascotaDAO();
    }
    
    public void agregarMascota(String edad, String especie, String alergia, String raza){
        Mascota mascota = new Mascota(edad, especie, alergia, raza);
        mascotaDAO.agregarMascota(mascota);
        System.out.println("mascota agregada correctamente" +mascota);
    }
    
    public List<Mascota> obtenerMascota(){
        return mascotaDAO.obtenerMascota();
    }
}
