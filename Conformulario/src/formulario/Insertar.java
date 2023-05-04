/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulario;

import static formulario.Principal.resultados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertar {
    public static void insertarDatos(){
//    public static void main(String[] args){
        Conexion cc = new Conexion();
        Connection cn = cc.con;
        String sql = "INSERT INTO respuestas( Nombre, Edad, Sexo, Codigo, Deportes_conoce, Opinion_deportes, Deporte_favorito, Deporte_maspracti, Futbol_practica, Basquetbol_practica, Voleibol_practica, Tenis_practica, Dias_practica) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
       try{
       PreparedStatement rsp = cn.prepareStatement(sql);
       rsp.setString(1,resultados[0]);
       rsp.setString(2,resultados[1]);
       rsp.setString(3,resultados[2]);
       rsp.setString(4,resultados[3]);
       rsp.setString(5,resultados[4]);
       rsp.setString(6,resultados[5]);
       rsp.setString(7,resultados[6]);
       rsp.setString(8,resultados[7]);
       rsp.setString(9,resultados[8]);
       rsp.setString(10,resultados[9]);
       rsp.setString(11,resultados[10]);
       rsp.setString(12,resultados[11]);
       rsp.setString(13,resultados[12]);
       int n = rsp.executeUpdate();
       if (n>0){
       System.out.println("Se ha guardado exitosamente");
       }
       } catch (SQLException e) {
        System.err.println("error: "+e);
       }
}
}