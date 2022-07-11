package conexion_bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

		static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
		static final String DB_URL="jdbc:mysql://localhost:3306/supermark";
		static final String USER="root";
		static final String PASS="juampy";

		public static void main(String args[]) {
			
			Connection conn = null;
			Statement stmt = null;
			
			try {
			//paso2
				Class.forName(JDBC_DRIVER);	
			//PASO 3
			System.out.println("Conectando a la base de datos...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			//PASO4 EJECUTAR CONSULTA
			System.out.println("Conectando sentencias...");
			stmt = conn.createStatement();
			String sql;
			sql = "select id_usuario,nombre_usuario,apellido_usuario,email_usuario,pass_usuario,dni_usuario,tarjeta_desc,cel_usuario,id_t_usuario from usuario";
			ResultSet rs=stmt.executeQuery(sql);
			
			//paso5
			while (rs.next()) {
				//recibimos por tipo columna
				int id_usuario = rs.getInt("id_usuario");
				String nombre=rs.getString("nombre_usuario");
				String apellido = rs.getString("apellido_usuario");
				String email= rs.getString("email_usuario");
				String pass= rs.getString("pass_usuario");
				int dni= rs.getInt("dni_usuario");
				boolean tarjeta= rs.getBoolean("tarjeta_desc");
				String cel= rs.getString("cel_usuario");
				int tipo_usuario=rs.getInt("id_t_usuario");
				//mostrar valores
				System.out.print("id_usuario: "+id_usuario);
				System.out.print("nombre: "+nombre);
				System.out.print("apellido: "+apellido);
				System.out.println("email: "+email);
				System.out.println("pass: "+pass);
				System.out.println("dni: "+dni);
				System.out.println("tarjeta: "+tarjeta);
			    System.out.println("celular: "+cel);
				System.out.println("tipo usuario: "+tipo_usuario);
				
				}
			
		
			//PASO6: LIMPIEZA
			rs.close();
			stmt.close();
			conn.close();
				
			}catch(SQLException se) {
				se.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(stmt!=null)
						stmt.close();
				}catch(SQLException se2) {
					
				}
				try {
					if(conn!=null)
						conn.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}
		
			System.out.println("FUNCIONO!!");		
			}
	}}



