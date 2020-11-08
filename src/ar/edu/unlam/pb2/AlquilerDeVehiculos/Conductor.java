package ar.edu.unlam.pb2.AlquilerDeVehiculos;

public class Conductor extends Persona{
	
	private Licencias tipoDeLicencia;
	private Boolean disponible;
	
	public Conductor(String nombre, String apellido, Integer dni, Byte edad,Licencias tipoDeLicencia,  Boolean disponible) {
		super(nombre, apellido, dni, edad);
		// TODO Auto-generated constructor stub
		this.setDisponible(disponible);
		this.tipoDeLicencia = tipoDeLicencia;
	}

	public Licencias getTipoDeLicencia() {
		return tipoDeLicencia;
	}

	public void setTipoDeLicencia(Licencias tipoDeLicencia) {
		this.tipoDeLicencia = tipoDeLicencia;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}


}
