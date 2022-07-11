package conexion_bd;

//Este metodo esta hecho porque cuando hice la base de datos me olvide de algunos id auto incrementables 

import java.sql.ResultSet;

public class Generador {

	public int id_incrementable() {
		int id=1;
		String ps=null;
		//ResultSet rs=null;
		Conexion1 cone=new Conexion1();

		try{
		  ps =("select max(id_producto) as id from producto;");
		  ResultSet rs=cone.consulta(ps);
		  
		  
		  while(rs.next()) {
			  id=rs.getInt(1)+1;
		  }
			
		}catch(Exception ex){
			System.out.println("Estas hasta las manos pibe");
		}
		return id;
	}
	
}
