package src.src.restaurant;

public interface Vendible {
	public float getPrecioVenta();
	public void preparar() throws SinSuficientesIngredientesException;
}
