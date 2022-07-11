package conexion_bd;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.InputMismatchException;

	public class IngresoProd  {
		private int id_producto=9;
		private String nombre_producto;
		private int stock_producto;
		private double precio_unidad;
		private String vencimiento;
		private int id_categoria;
	
		
		public IngresoProd() {// aqui voy a pedir los datos
			
			try {
		    Scanner ing= new Scanner(System.in);
		    
		    Generador g=new Generador();
			this.id_producto=g.id_incrementable();
			
			
			System.out.println("Ingrese el nombre del producto: ");
			this.nombre_producto=ing.nextLine();
			
			System.out.println("Ingrese la cantidad del producto: ");
			this.stock_producto=ing.nextInt();
			
			System.out.println("Ingrese el precio unitario: ");
			this.precio_unidad=ing.nextDouble();
			
			System.out.println("Ingrese el vencimiento con aaaa-mm-dd: ");
			this.vencimiento=ing.next();
			
			System.out.println("Ingrese la categoria: 1-comestibles 2-lacteos 3-limpieza ");
			this.id_categoria=ing.nextInt();
			
			}catch (InputMismatchException ex) {
	            System.out.println("Se ingreso algun valor erroneo por favor verificar el ingreso");
			
			}
			}
		
		
		
		public void validarIngresoP() throws SQLException {
			
			//valida que los datos hayan sido ingresados
			//if(this.nombre!=""&&this.apellido!=""&&this.email!=""&&this.pass!=""&&this.dni!=0&&this.cel!="") {
			
			if(this.nombre_producto!=""&&this.stock_producto!=0&&this.precio_unidad!=0&&this.vencimiento!=""&&this.id_categoria!=0)	{
				
			System.out.println("hasta aqui todo bien");
				
			String sql="insert into producto values("+"'"+this.id_producto+"',"+"'"+this.nombre_producto+"',"+"'"+this.stock_producto+"',"+"'"+this.precio_unidad+"',"+"'"+this.vencimiento+"',"+"'"+this.id_categoria+"');";
			
			
			Conexion1 conexion=new Conexion1();
			conexion.actualizar(sql);
			System.out.println("producto cargado con exito");
			}
			
		
			
			
			
		}
		

	}

	
	//

