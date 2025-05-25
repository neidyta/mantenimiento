/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.DatabaseConnection;
import models.Mascota;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MascotaDAO {
    
    public void agregarMascota(Mascota mascota){
        String sql = "INSERT INTO mascotas (edad, especie, alergia, raza) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            
            stmt.setString(1, mascota.getEdad());
            stmt.setString(2, mascota.getEspecie());
            stmt.setString(3, mascota.getAlergia());
            stmt.setString(4, mascota.getRaza());
            
            int filasAfectadas = stmt.executeUpdate();
            if(filasAfectadas >0){
                try(ResultSet generatedKeys = stmt.getGeneratedKeys()){
                    if(generatedKeys.next()){
                        mascota.setId(generatedKeys.getInt(1));
                    }
                }
            }
        }catch(SQLException e){
            System.err.println("Error al agregar mascota: "+e.getMessage());
        }
    }

 
    public List<Mascota>obtenerMascota(){
        List<Mascota> mascotas = new ArrayList<>();
        String sql = "SELECT * FROM mascotas";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs =stmt.executeQuery()){
            
            while(rs.next()){
                Mascota mascota = new Mascota(
                        rs.getString("edad"),
                        rs.getString("especie"),
                        rs.getString("alergia"),
                        rs.getString("raza")
                );
                mascotas.add(mascota);
}
              
        }catch(SQLException e){
            System.err.println("Error al obtener mascota: "+e.getMessage());
        }
        return mascotas;
    }
}
