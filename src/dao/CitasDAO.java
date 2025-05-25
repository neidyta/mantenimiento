/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Citas;


public class CitasDAO {
    
    
    public void agregarCita(Citas citas){
        String sql = "INSERT INTO citas (mascota, veterinario, fecha, motivo) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            
            stmt.setString(1, citas.getMascota());
            stmt.setString(2, citas.getVeterinario());
            stmt.setString(3, citas.getFecha());
            stmt.setString(4, citas.getMotivo());
            
            int filasAfectadas = stmt.executeUpdate();
            if(filasAfectadas >0){
                try(ResultSet generatedKeys = stmt.getGeneratedKeys()){
                    if(generatedKeys.next()){
                        citas.setId(generatedKeys.getInt(1));
                    }
                }
            }
        }catch(SQLException e){
            System.err.println("Error al agregar cita: "+e.getMessage());
        }
    }

 
    public List<Citas>obtenerCitas(){
        List<Citas> citas = new ArrayList<>();
        String sql = "SELECT * FROM cita";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs =stmt.executeQuery()){
            
            while(rs.next()){
                Citas citas = new Citas(
                        rs.getInt("id"),
                        rs.getString("mascota"),
                        rs.getString("veterinario"),
                        rs.getString("fecha"),
                        rs.getString("motivo")
                );
                cita.add(citas);
}
              
        }catch(SQLException e){
            System.err.println("Error al obtener la cita: "+e.getMessage());
        }
        return cita;
    }
}
