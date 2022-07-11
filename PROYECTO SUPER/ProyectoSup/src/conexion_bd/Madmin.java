package conexion_bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*Para la administracion 
 * Cargar productos a la aplicacion
 * Modificar datos de productos cargados
 * Ver los usuarios que generaron una compra
 * Ver listados de productos seleccionados por el usuario.
 */

	public class Madmin {
		
		    private Usuario user;
			private Conexion1 conexion;
			
			
			public Madmin(Usuario user) {
				this.user=user;
				conexion=new Conexion1();
			}
			public void menu(Usuario user) throws SQLException {
				System.out.println("Bienvenido/a "+user.getNombre());
				Scanner teclado=new Scanner(System.in);
				int opcion=0;
				do {
				
				System.out.println("Ingrese una opcion: ");
				System.out.println("1- Cargar productos.\r\n"
						+"2- Modificar datos de productos.\r\n"
						+ "3- Ver los usuarios que generaron una compra.\r\n"
						+"4- Ver listados de productos seleccionados por el usuario.\r\n"+"");
				opcion=teclado.nextInt();
				
				switch(opcion) {
				case 1:
					
					  IngresoProd ip= new IngresoProd();
					 ip.validarIngresoP();
					  
							
					  
				
				break;
				case 2:
					System.out.println("que paso aqui");
					
					 ModificacionProd mp=new ModificacionProd(null);
					 mp.menu(user);
				
					
				
				break;
				case 3:
					System.out.println("Probando acceso a la opcion");
					Verusuario vu=new Verusuario();
					vu.ver();
				break;	
				case 4:
					System.out.println("Probando acceso a la opcion");
					Verdetalle vd=new Verdetalle();
					vd.verdetalle();
					}
				
				
				}while(opcion!=0);
				
				
				
			}
			
			
}
