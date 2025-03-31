package src.src.restaurantTest;

import src.src.restaurant.Ingrediente;
import src.src.restaurant.ItemReceta;
import src.src.restaurant.Receta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


//Una receta está compuesta por uno o más ingredientes

public class RecetaTest {

	static Receta receta;
	static Ingrediente huevo;
    static Ingrediente carnePicada;
    static ItemReceta itemHuevo;
    static ItemReceta itemCarne;
	
	public RecetaTest() {
		
	}
	
	@BeforeClass
	
	public static void setUp() {
        // Crear ingredientes
        huevo = new Ingrediente("Huevo");
        carnePicada = new Ingrediente("Carne picada");
        
        // Crear items de receta con esos ingredientes
        itemHuevo = new ItemReceta(huevo, 2);
        itemCarne = new ItemReceta(carnePicada, 500);

        // Crear una receta y agregar ingredientes
        receta = new Receta("Hamburguesa", 15, 500);
        receta.addIngrediente(itemHuevo);
        receta.addIngrediente(itemCarne);
    }

	
	
	/*
	@Test
	
	public void CargarUnIngrediente() {
		
		Receta pan= new Receta("pan",6,50);
		pan.addIngrediente(itemCarne);
		//Assert.assertEquals(1, pan.getIngredientes().size());
		// Intentar obtener los ingredientes (debería fallar, retornar null o dar un mensaje)
        Assert.assertNull("La receta debe fallar si tiene menos de 2 ingredientes", receta.getIngredientes());
    

		
		
		
	}
	*/
@Test
	
	public void CargarMasIngredientes() {
	receta.getIngredientes().clear();  // Limpia la lista de ingredientes

		receta.addIngrediente(itemCarne);
		receta.addIngrediente(itemHuevo);
	System.out.println(receta.getIngredientes());
	//Assert.assertEquals(1, pan.getIngredientes().size());
	// Obtener los ingredientes (debe ser válido)
   // Assert.assertNull("La receta no es nula porque tiene mas de dos ingredientes", receta.getIngredientes());
    Assert.assertNotNull("La receta  es nula porque tiene menos de  dos ingredientes", receta.getIngredientes());
   // Assert.assertEquals("Debe haber exactamente 2 ingredientes en la receta", 2, receta.getIngredientes().size());
}
	/*
@Test(expected = IllegalStateException.class)
public void testRecetaConMenosDeDosIngredientesConExcepcion() {
    // Crear y agregar solo un ingrediente
    Ingrediente huevo = new Ingrediente("Huevo", "unidades", 240);
    receta.addIngrediente(new ItemReceta(huevo, 1));

    // Intentar obtener los ingredientes (debería lanzar la excepción)
    receta.getIngredientes();
}

		*/
		
	}
	

