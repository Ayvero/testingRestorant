package src.src.restaurant;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clientes {

	    private ArrayList<Usuario> clientela = new ArrayList<>();
		
	    public Clientes() {
	    	   	
	    }
	    public Usuario getCliente(int id) {
	    	return clientela.get(id);
	    }
		
	    
	    
	 // Añade un cliente si no existe ya en el set.
	    public boolean addCliente(Usuario u) {
	        if (clientela.contains(u)) {
	            System.out.println("El cliente ya está en la lista.");
	            return false; // Indica que no se agregó porque ya estaba
	        } else {
	            clientela.add(u);
	            return true; // Cliente agregado con éxito
	        }
	    }
	    
		
		public ArrayList<Usuario> getClientela(){
			return clientela;
		}
		
		

	}

