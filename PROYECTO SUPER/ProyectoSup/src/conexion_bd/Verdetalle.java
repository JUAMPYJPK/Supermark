package conexion_bd;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Verdetalle {
private Conexion1 conexion;

public Verdetalle() {
	conexion= new Conexion1();
}

public void verdetalle() throws SQLException {
	System.out.println("Mostrando detalle de productos seleccionados por el cliente: ");
	String sql="select * from venta\r\n"
			+ "inner join usuario\r\n"
			+ "on venta.id_usuario = usuario.id_usuario";
	ResultSet rs = conexion.consulta(sql);
	while(rs.next()) {
		
		int id= rs.getInt("id_usuario");
		String nombre=rs.getString("nombre_usuario");
		String apellido=rs.getString("apellido_usuario");
		String detalle=rs.getString("detalle");
		System.out.println("Id usuario:"+id );
		System.out.println("nombre :"+nombre );
		System.out.println("apellido:"+apellido);
		System.out.println("detalle de productos seleccionados:"+detalle);
		
		System.out.println();
		}
}
}
