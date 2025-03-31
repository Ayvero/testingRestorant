package src.src.restaurant;
import java.util.Date;
import java.util.Objects;

public class Usuario {
static int nextID;
int id;
String nombreYApellido;
int tipoUsuario;
float saldoCuenta;
Date ultimaRecarga;
String email;


public Usuario(String nombreYApellido, int tipoUsuario, float saldoCuenta,String email) {
	super();
	this.nombreYApellido = nombreYApellido;
	this.tipoUsuario = tipoUsuario;
	this.saldoCuenta = saldoCuenta;
	if ((email!=null) &&(email.contains("@"))){
		this.email=email;
	} else {
        throw new IllegalArgumentException("El correo electrónico debe contener '@'.");
    }
	
}


public void cargarCredito(float cuanto) {
	saldoCuenta+=cuanto;
	
}
float descontarSaldo(float cuanto) throws SinSaldoException {
	if((saldoCuenta-cuanto)<0) throw new SinSaldoException();
	else
		saldoCuenta-= cuanto;
	return saldoCuenta;
	
}
float getSaldo() {
	return saldoCuenta;
}

public static int getNextID() {
	return nextID;
}

public static void setNextID(int nextID) {
	Usuario.nextID = nextID;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombreYApellido() {
	return nombreYApellido;
}

public void setNombreYApellido(String nombreYApellido) {
	this.nombreYApellido = nombreYApellido;
}

public int getTipoUsuario() {
	return tipoUsuario;
}

public void setTipoUsuario(int tipoUsuario) {
	this.tipoUsuario = tipoUsuario;
}

public float getSaldoCuenta() {
	return saldoCuenta;
}

public void setSaldoCuenta(float saldoCuenta) {
	this.saldoCuenta = saldoCuenta;
}

public Date getUltimaRecarga() {
	return ultimaRecarga;
}

public void setUltimaRecarga(Date ultimaRecarga) {
	this.ultimaRecarga = ultimaRecarga;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

//Sobrescribir equals y hashCode
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Usuario usuario = (Usuario) o;
    return Objects.equals(nombreYApellido, usuario.nombreYApellido) &&
           Objects.equals(email, usuario.email);  // Comparación basada en nombre y email
}

@Override
public int hashCode() {
    return Objects.hash(nombreYApellido, email);
}


//Sobrescribir el método toString
@Override
public String toString() {
    return "Usuario { " +
           "Nombre = '" + nombreYApellido + '\'' +
           ", ID = " + id +
           " }";
}
}
