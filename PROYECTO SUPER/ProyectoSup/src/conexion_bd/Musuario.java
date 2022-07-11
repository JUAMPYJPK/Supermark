package conexion_bd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Musuario {
	
		private Usuario user;
		private int opcion;
		private Conexion1 conexion;
		
		public Musuario(Usuario user) {
			this.user=user;
			this.opcion=0;
			this.conexion=new Conexion1();
		}
		
		public void opusuario() throws SQLException {
			
			System.out.println("Bienvenido/a "+this.user.getNombre()
			+" "+this.user.getApellido());
			
			//editado
			do {
		    System.out.println("Ingrese una opcion: ");
			
			//hasta aqui
			System.out.println("1 -Seleccionar productos.\r\n"
					+ "2 - Ver listado de productos seleccionados.\r\n"
					+ "3 - Autorizar la compra.\r\n");
			
			System.out.println("Elige una opcion");
			Scanner teclado = new Scanner(System.in);
			this.opcion=teclado.nextInt();
			
			switch (this.opcion) {
			case 1 : 
				
				//System.out.println("Elige la categoria del producto");
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
				   int opcion=teclado.nextInt();
				   String sql1="select id_producto, nombre_producto, precio_unidad " + "from producto where id_categoria="+"'"+opcion+"';";
				   ResultSet rs1= conexion.consulta(sql1);
				   
				   while(rs1.next()) {
					   int id= rs1.getInt("id_producto");
					   String nombrep=rs1.getString("nombre_producto");
					   String preciop=rs1.getString("precio_unidad");
					   System.out.println("Id producto:"+id);
					   System.out.println("Producto: "+nombrep);
					   System.out.println("Precio unitario: $"+preciop);
				   }
				   //nuevo consultar stock y agregar al carrito
				   System.out.println("Seleccione id del producto : ");
					int idSel = teclado.nextInt();
					System.out.println("Ingrese la cantidad de productos: ");
					int cantP = teclado.nextInt();
					
					String consultaStock = "Select * from producto "
							+ "where id_producto ="+"'"+idSel+"'";
					
					//System.out.println(consultaStock);
					ResultSet rs3 = conexion.consulta(consultaStock);
					
					if(rs3.next()) {
						String nomP = rs3.getString("nombre_producto"); 
						int stockbd = rs3.getInt("stock_producto");
						double precioP = rs3.getDouble("precio_unidad");
						
						String fvto =rs3.getString("vencimiento");
						
						
						
						if(stockbd>cantP) {
						    //instancio un producto con toda esa data ya que si hay stock de ese prod
							Producto product = new Producto(idSel,nomP,cantP,precioP,fvto,opcion);
							user.agregaCarritoU(product); //agrego el producto al carrito asociado al usuario
							System.out.println("Producto agregado correctamente!");
							
						}
						else {
							System.out.println("No hay stock del producto");
						}
					}
				
				
				//implementacion
				break;
			case 2 : 
				System.out.println("Mostrando productos del carrito");
				Carrito carritoAux=user.getCarrito();
				carritoAux.recorrerCarrito();
				break;
			case 3 : 
				//implementacion
				Carrito carritoAux2=user.getCarrito();
				carritoAux2.autorizarCompra(user);
				break;
			default:
				System.out.println("algo salio mal");
				//editado
			break;	
			//
			}
			}while(opcion!=0);
		}
	}


