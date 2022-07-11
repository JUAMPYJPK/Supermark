package conexion_bd;


public class Producto {
	private int id_producto;
	private String nombre_p;
	private int stock;
	private double precio;
	private String vencimiento;
	private int id_categoria;
	public Producto(int id_producto, String nombre_p, int stock, double precio, String vencimiento, int id_categoria) {
		
		this.id_producto = id_producto;
		this.nombre_p = nombre_p;
		this.stock = stock;
		this.precio = precio;
		this.vencimiento = vencimiento;
		this.id_categoria = id_categoria;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getNombre_p() {
		return nombre_p;
	}
	public void setNombre_p(String nombre_p) {
		this.nombre_p = nombre_p;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", nombre_p=" + nombre_p + ", stock=" + stock + ", precio="
				+ precio + ", vencimiento=" + vencimiento + ", id_categoria=" + id_categoria + "]";
	}
	
	
	
	
	

}
