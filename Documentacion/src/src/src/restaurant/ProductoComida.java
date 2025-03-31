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
	// TODO Esbozo de método generado automáticamente
	
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
            "nombre='" + getNombre() + '\'' + // Suponiendo que getNombre() es un método de Producto
            ", cantidad=" + cantidad +
            
            '}';
}
 // Otros métodos específicos si es necesario
}
