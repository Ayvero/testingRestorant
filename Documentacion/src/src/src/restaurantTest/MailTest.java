package src.src.restaurantTest;
//Todos los usuarios poseen un correo electrónico válido (contiene @)

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import src.src.restaurant.Usuario;
import src.src.restaurant.Clientes;



public class MailTest {
	
	    
		static Clientes cliente;
		static Usuario ejemplos[];
		
		public MailTest() {
			
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
		    public void testMailDefectuoso() {
			 
			 Usuario u= new Usuario("Homero", 0, 0, "homerojsimpsonspringfield.com");
		        for (Usuario x : ejemplos) {
		            cliente.addCliente(x);
		        }

		        
		        // Verificamos si se ha añadido el cliente:
		        Assert.assertEquals(1, cliente.getClientela().size());
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
			
		 
		}
