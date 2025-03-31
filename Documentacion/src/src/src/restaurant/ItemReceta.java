package src.src.restaurant;

public class ItemReceta {
	Ingrediente ingrediente;
	int cantidad;
	
	public ItemReceta(Ingrediente ingrediente, int cantidad) {
		super();
		this.ingrediente = ingrediente;
		this.cantidad = cantidad;
	}
	public Ingrediente getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
	    return "Ingrediente: " + ingrediente.getNombre() + ", Cantidad: " + cantidad;
	}

}
