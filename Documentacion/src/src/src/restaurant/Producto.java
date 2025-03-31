package src.src.restaurant;

public abstract class Producto {
	static int nextID;
	int id;
	float precioUnitarioCompra;
	float precioUnitarioVenta;
	String nombre;
	
	
	public Producto(String nombre, float precioUnitarioCompra, float precioUnitarioVenta) {
		this.nombre=nombre;
		this.precioUnitarioCompra = precioUnitarioCompra;
		this.precioUnitarioVenta  = precioUnitarioVenta;
		
	}
	

	public float getPrecioUnitarioCompra() {
		return precioUnitarioCompra;
	}

	public void setPrecioUnitarioCompra(float precioUnitarioCompra) {
		this.precioUnitarioCompra = precioUnitarioCompra;
	}

	public float getPrecioUnitarioVenta() {
		return precioUnitarioVenta;
	}

	public void setPrecioUnitarioVenta(float precioUnitarioVenta) {
		this.precioUnitarioVenta = precioUnitarioVenta;
	}

	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract void despachar(int cantidad);

}