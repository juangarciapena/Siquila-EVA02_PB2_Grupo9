package ar.edu.unlam.pb2.AlquilerDeVehiculos;

public class Persona implements Comparable <Persona>{
	//que se ordenen por nombre
	protected String nombre;
	protected String apellido;
	protected Integer dni;
	protected Byte edad; 

	public Persona(String nombre, String apellido, Integer dni, Byte edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Byte getEdad() {
		return edad;
	}

	public void setEdad(Byte edad) {
		this.edad = edad;
	}


	@Override
	public int compareTo(Persona persona) {
		
	return this.nombre.compareToIgnoreCase(persona.nombre);
	}

	
}
