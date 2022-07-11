package conexion_bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ModificacionProd {
	private Producto product;
	private Conexion1 conexion;
	
	public ModificacionProd(Producto product) {
		this.product=product;
		conexion= new Conexion1();
		
	}
	
	public void menu(Usuario user) throws SQLException {
		System.out.println("Bienvenido/a "+user.getNombre());
		Scanner teclado=new Scanner(System.in);
		//ultimod
		int opcion=1;
		do {
		
		
		
		switch(opcion) {
		case 1:
			
			String sql = "select id_categoria, nombre_categoria from categoria";
			ResultSet rs = conexion.consulta(sql);
			
			while(rs.next()) {
	
				int id= rs.getInt("id_categoria");
				String nombre=rs.getString("nombre_categoria");
				System.out.println("Opcion:"+id );
				System.out.println("categoria :"+nombre );
				System.out.println();
				}
			
			//modificaciones para buscar dentro de categoria los productos
			   System.out.println("Elige la categoria del producto");
			   int opcion2=teclado.nextInt();
			   String sql1="select id_producto, nombre_producto, precio_unidad " + "from producto where id_categoria="+"'"+opcion2+"';";
			   ResultSet rs1= conexion.consulta(sql1);
			   
			   while(rs1.next()) {
				   int id= rs1.getInt("id_producto");
				   String nombrep=rs1.getString("nombre_producto");
				   String preciop=rs1.getString("precio_unidad");
				   System.out.println("Id producto:"+id);
				   System.out.println("Producto: "+nombrep);
				   System.out.println("Precio unitario: $"+preciop);
			   }
			   
			   System.out.println("Seleccione id del producto : ");
				int idp = teclado.nextInt();
				
				do {
					System.out.println("Ingrese una opcion: ");
					System.out.println("1- Modificar stock de un producto.\r\n"
							+"2- Modificar precio de un producto.\r\n"
					+"0-Volver al menu principal.\r\n");
					opcion=teclado.nextInt();
					
					switch(opcion) {
					case 1:
						//Conexion1 con=new Conexion1();	
						Scanner o=new Scanner(System.in);
						System.out.println("Ingrese la cantidad de stock para el producto");
						int nstock=o.nextInt();
						String sql2="update producto set stock_producto='"+nstock+"'where id_producto='"+idp+"';";
					    //con.actualizar(sql2);
						conexion.actualizar(sql2);
						
						System.out.println("stock actualizado correctamente");
					break;	
					
					case 2:
						//Conexion1 con=new Conexion1();	
						Scanner o2=new Scanner(System.in);
						System.out.println("Ingrese el nuevo precio del producto");
						double npre=o2.nextInt();
						String sql3="update producto set precio_unidad='"+npre+"'where id_producto='"+idp+"';";
					    //con.actualizar(sql2);
						conexion.actualizar(sql3);
						
						System.out.println("precio actualizado correctamente");
					break;	
						
					}
					
					
					
				}while(opcion!=0);
				
			
					
			  }
		
		
		
		
		
		}while(opcion!=0);
		
		
		
	}
	
	
}
	
	


