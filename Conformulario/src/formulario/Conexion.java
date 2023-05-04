package formulario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
String bd = "encuesta";
String url = "jdbc:mysql://localhost:3306/";
String user = "root";
String password = "";
String driver = "com.mysql.cj.jdbc.Driver";
Connection con;

public Conexion() {
try {
Class.forName(driver);
con = DriverManager.getConnection(url+bd,user,password);
} catch (ClassNotFoundException | SQLException e) {
System.err.println("error: "+e);
}

}
//public static void main(String[] args){
//Conexion cn= new Conexion();
//Statement st;
//ResultSet rs;
//try{
//st =cn.con.createStatement();
//rs = st.executeQuery("SELECT * from respuestas");
//while (rs.next()){
//System.out.println(rs.getString("Nombre"));
////}
//cn.con.close();
//} catch (SQLException e) {
//System.err.println("error: "+e);
//}
//}//Verificar datos

}