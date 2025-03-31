package src.src.restaurant;

public class ItemPedido {
	
	int cantidad;
	Producto item;
	String estado;
	
	
	public ItemPedido(int cantidad, Producto item) {
		super();
		this.cantidad = cantidad;
		this.item = item;
	}
	
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Producto getItem() {
		return item;
	}
	public void setItem(Producto item) {
		this.item = item;
	}
	
	
	public void encargar() throws SinSuficientesIngredientesException {



	}


	public void despachar() {
		this.getItem().despachar(this.getCantidad());
	}
	
	@Override
	public String toString() {

		return "cantidad" + cantidad ;
	}
}
