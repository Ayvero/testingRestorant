package src.src.restaurantTest;

//Un pedido reduce en saldo de un usuario

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import src.src.restaurant.ItemPedido;
import src.src.restaurant.Pedido;
import src.src.restaurant.Producto;
import src.src.restaurant.ProductoComida;
import src.src.restaurant.SinSaldoException;
import src.src.restaurant.Usuario;

public class SaldoTest {
	
	static Usuario usuario;
	static Pedido pedido;
	static ItemPedido itemPedido;
	static ProductoComida producto;
	static ProductoComida producto2;
	
	
	public SaldoTest() {
		
	}
	
    @BeforeClass
	
	public static void setUp() {
    	//crear Usuario
    	
    	usuario=new Usuario("Jose Perez", 2, (float)2000.0, "perez@gmail.com");
    	
        // Crear productos
       producto=new ProductoComida("cebolla", 3, (float) 20.0);
       producto2=new ProductoComida("papa", 2, (float) 20.0);
       
       
       //crearItemPedido
       
       itemPedido= new ItemPedido(2,producto);
       
       
    // Crear un pedido
       pedido = new Pedido(); // Inicializa la lista de items automáticamente

       // Agregar items al pedido
       pedido.agregarItem(itemPedido);
       
    }
    
    @Test
    
    public void DescontarSaldo() throws SinSaldoException {
    	
    	pedido.DescontarSaldo(usuario);
    	
    }

	
	
}






