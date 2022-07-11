package conexion_bd;

import java.sql.SQLException;
import java.util.Scanner;

public class Registro {
	private String nombre;
	private String apellido;
	private String email;
	private String pass;
	private int dni;
	private boolean tarjeta;
	private String cel;
	private int tipo;
	
	public Registro() {// aqui voy a pedir los datos
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Ingrese el nombre: ");
		this.nombre=entrada.next();
		
		System.out.println("Ingrese el apellido: ");
		this.apellido=entrada.next();
		
		System.out.println("Ingrese el email: ");
		this.email=entrada.next();
		
		System.out.println("Ingrese la contraseña: ");
		this.pass=entrada.next();
		
		System.out.println("Ingrese el DNI: ");
		this.dni=entrada.nextInt();
		
		this.tarjeta=true;
		
		System.out.println("Ingrese el numero de celular: ");
		this.cel=entrada.next();
		
		this.tipo=1;
		
		}
	
	public void validarRegistro() throws SQLException {
		
		//valida que los datos hayan sido ingresados
		if(this.nombre!=""&&this.apellido!=""&&this.email!=""&&this.pass!=""&&this.dni!=0&&this.cel!="") {
			System.out.println("hasta aqui todo bien");
			
		
		String sql="insert into usuario values(null,"+"'"+this.nombre+"',"+"'"+this.apellido+"',"+"'"+this.email+"',"+"'"+this.pass+"',"+"'"+this.dni+"',true,"+"'"+this.cel+"',"+"'"+this.tipo+"');";
		
		Conexion1 conexion=new Conexion1();
		conexion.actualizar(sql);
		System.out.println("Usuario cargado con exito");
		}
		
	
		
		
		
	}
	

}
