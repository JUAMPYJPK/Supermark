package conexion_bd;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
	private String email;
	private String pass;
	public Login(String email, String pass) {
		
		this.email = email;
		this.pass = pass;
	}
	
	public Usuario ingresar() throws SQLException {
	Usuario user=null;	
	Conexion1 conexion=new Conexion1();
	String sql="select * from usuario where email_usuario="+"'"+this.email+"'"+"and pass_usuario="+"'"+this.pass+"'";
	ResultSet rs=conexion.consulta(sql);
	while (rs.next()) {
		System.out.println("Ingreso correcto");
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
		System.out.println("Bienvenido/a tus datos son los siguientes..");
		System.out.print("id_usuario: "+id_usuario+"\n");
		System.out.print("nombre: "+nombre+"\n");
		System.out.print("apellido: "+apellido+"\n");
		System.out.println("email: "+email);
		System.out.println("pass: "+pass);
		System.out.println("dni: "+dni);
		System.out.println("tarjeta: "+tarjeta);
	    System.out.println("celular: "+cel);
		System.out.println("tipo usuario: "+tipo_usuario);
		user=new Usuario(id_usuario,nombre,apellido,email,pass,dni,tarjeta,cel,tipo_usuario);
		
		}	
	    return user;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	

}
