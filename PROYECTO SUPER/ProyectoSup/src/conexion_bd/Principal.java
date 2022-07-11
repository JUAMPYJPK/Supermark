package conexion_bd;

import java.sql.SQLException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws SQLException {
		
		//agregar menu de opciones para ingreso o registro
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("<<SUPERMARK>>");
		System.out.println("Ingrese una opcion: ");
		System.out.println("1 - Ingresar\n2 - Registrarse");
		int opcion=teclado.nextInt();
		
		if(opcion==1) {
		//termina lo editado 
		     System.out.println("Ingrese su email: ");
		     Scanner ingreso= new Scanner(System.in);
		     String email=ingreso.nextLine();
		
		     System.out.println("Ingrese la contraseña: ");
		     Scanner ingreso2= new Scanner(System.in);
		     String pass=ingreso2.nextLine();
		 
		     Login login = new Login(email,pass);
		     Usuario user=login.ingresar();
		   //editado ultimo
		     
		    if(user!=null) {
		    	
		    	//aqui es donde debo preguntar si es admin o user
		    	if (user.getId_t_usuario()==1){
		    	
			        Musuario men=new Musuario(user);
			        //aqui es donde debo preguntar si es admin o user
			        men.opusuario();
	        
		          }
		    	    else 
		    		System.out.println("aqui debe hacerse el menu de admin");
		    	   Madmin men1=new Madmin(user);
		    	   men1.menu(user);
		    }	
		    else
		       {
		    	System.out.println("Error en el ingreso verifique los datos del ingreso");
		    }
		}
		else
		{
			System.out.println("Registrarse");
			Registro reg1=new Registro();
			reg1.validarRegistro();
		}

		}
	}
