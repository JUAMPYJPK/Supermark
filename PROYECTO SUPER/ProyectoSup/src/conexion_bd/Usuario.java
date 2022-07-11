package conexion_bd;

public class Usuario {
	private int id_usuario;
	private String nombre;
	private String apellido;
	private String mail;
	private String pass;
	private int dni;
	private boolean tieneTarjeta;
	private String cel;
	private int id_t_usuario;
	//
	private Carrito carrito;
	
	public Usuario(int id_usuario, String nombre, String apellido, String mail, String pass, int dni,
			boolean tieneTarjeta, String cel, int id_t_usuario) {
		
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.pass = pass;
		this.dni = dni;
		this.tieneTarjeta = tieneTarjeta;
		this.cel = cel;
		this.id_t_usuario = id_t_usuario;
		//
		this.carrito = new Carrito();
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public boolean isTieneTarjeta() {
		return tieneTarjeta;
	}

	public void setTieneTarjeta(boolean tieneTarjeta) {
		this.tieneTarjeta = tieneTarjeta;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public int getId_t_usuario() {
		return id_t_usuario;
	}

	public void setId_t_usuario(int id_t_usuario) {
		this.id_t_usuario = id_t_usuario;
	}
	//
	public Carrito getCarrito() {
		return carrito;
	}
	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
	
	public void agregaCarritoU(Producto p) {
		this.carrito.agragaProducto(p);
	}
	
	
	

}
