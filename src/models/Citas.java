/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


public class Citas{
     
    String mascota, veterinario, fecha, motivo;

    public Citas(String mascota, String veteriario, String fecha, String motivo) {
        this.mascota = mascota;
        this.veterinario = veteriario;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeteriario(String veteriario) {
        this.veterinario = veteriario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("mascota{");
        sb.append("veterinario=").append(veterinario);
        sb.append("fecha=").append(fecha);
        sb.append("motivo=").append(motivo);
        sb.append('}');
        return sb.toString();
    }
}
