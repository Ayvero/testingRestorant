package src.src.restaurant;

//Clase concreta que extiende Producto
public class ProductoComida extends Producto {
	String nombre;
	int cantidad;
	float precio;
	
 public ProductoComida(String nombre, int cantidad, float precio) {
     super(nombre, cantidad, precio); // Llamar al constructor de la clase abstracta
 }

 
@Override
public void despachar(int cantidad) {
	// TODO Esbozo de m�todo generado autom�ticamente
	
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getCantidad() {
	return cantidad;
}


public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}


public float getPrecio() {
	return precio;
}


public void setPrecio(float precio) {
	this.precio = precio;
}

@Override
public String toString() {
    return "ProductoComida{" +
            "nombre='" + getNombre() + '\'' + // Suponiendo que getNombre() es un m�todo de Producto
            ", cantidad=" + cantidad +
            
            '}';
}
 // Otros m�todos espec�ficos si es necesario
}
