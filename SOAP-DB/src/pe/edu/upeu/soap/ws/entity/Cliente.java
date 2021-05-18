package pe.edu.upeu.soap.ws.entity;

public class Cliente {
	private int Idventa;
	private String Nombres;
	private String Apellidos;
	private String Fecha;
	private String NomProducto;
	private double Precio;
	private int Cantidad;
	public Cliente() {
		super();
	}
	public Cliente(int idventa, String nombres, String apellidos, String fecha, String nomProducto, double precio,
			int cantidad) {
		super();
		Idventa = idventa;
		Nombres = nombres;
		Apellidos = apellidos;
		Fecha = fecha;
		NomProducto = nomProducto;
		Precio = precio;
		Cantidad = cantidad;
	}
	public int getIdventa() {
		return Idventa;
	}
	public void setIdventa(int idventa) {
		Idventa = idventa;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public String getNomProducto() {
		return NomProducto;
	}
	public void setNomProducto(String nomProducto) {
		NomProducto = nomProducto;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	
	
	
}
