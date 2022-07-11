package conexion_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion1 {
public Connection conn=null;	
	
	
	public Conexion1() {//hacemos el constructor
		 final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
		 final String DB_URL="jdbc:mysql://localhost:3306/supermark";
		 final String USER="root";
		 final String PASS="juampy";
		 //Connection conn = null;
		 Statement stmt = null;
		 
		 try {
				//paso2
				Class.forName(JDBC_DRIVER);	
				//PASO 3
				System.out.println("Conectando a la base de datos...");
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				//PASO4
				
				
				
		 }catch(Exception e) {
			 System.out.println("Error no se pudo acceder algo estas haciendo mal jajja");
		 }
	}
	public ResultSet consulta(String sql) throws SQLException {
		System.out.println("Creando consulta.....");
		Statement stmt= conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		
		return rs;
	}
	public void actualizar(String sql) throws SQLException {
		System.out.println("Actualizando...");
		Statement stmt= conn.createStatement();
		stmt.executeUpdate(sql);
		
	}
	
	

}
