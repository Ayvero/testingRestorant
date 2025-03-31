package src.src.restaurantTest;

import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import src.src.restaurant.Usuario;
import src.src.restaurant.Clientes;



//a. No existen usuarios repetidos
public class UsuarioTest {
	
	static Usuario ejemplos[];
	static Clientes cliente;
	
	public UsuarioTest() {
		
	}

	@BeforeClass
	public static void cargarEjemplos() throws Exception {
		
		System.out.println("usuarioTest");
		ejemplos= new Usuario[4];
		

		ejemplos[0]=new Usuario("Homero Simpson", 0, 350, "homerojsimpson@springfield.com");
		ejemplos[1]=new Usuario("Barney Gomez", 0, 0, "el14gomez@springfield.com");
		ejemplos[2]=new Usuario("Edna Krabappel", 1, 0, "ednak@springfield.com");
		ejemplos[3]=new Usuario("Homero", 0, 0, "homerojsimpson@springfield.com");
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Bye byte ");
	}


	@Before
	
	public void setUp() throws Exception {
        // Inicializamos la lista de clientes antes de cada prueba
        cliente = new Clientes();
		
		
		
		
	}
	
	 @Test
	    public void testNoUsuariosRepetidos() {
	        // Añadimos todos los usuarios del array de ejemplos
	        for (Usuario u : ejemplos) {
	            cliente.addCliente(u);
	        }

	        // Verificamos que no se añadan duplicados
	        Assert.assertEquals(4, cliente.getClientela().size());
	    }
	
	 @After
		public void imprimirListClientes() {
			
			System.out.println("Lista de clientes:");
	        for (Usuario u : cliente.getClientela()) {
	            System.out.println(u);  // Esto invocará el método toString() de Usuario
	        }
	        System.out.println("Total de clientes: " + cliente.getClientela().size());
	        
	          cliente.getClientela().clear();  // Limpia la lista después de cada test
	        
	    }
		
	 
	 
	 @Test 
	 public void TestearRepetido() {
		 
		 Usuario x= new Usuario("Homero", 0, 0, "homerojsimpson@springfield.com");
		 cliente.addCliente(x);
		 Usuario z= new Usuario("Homera", 0, 0, "homerojsimpson@springfield.com");
		 cliente.addCliente(z);
		 Assert.assertEquals("No es la misma persona" ,x,z );
		}
	 
	

	 
		}



