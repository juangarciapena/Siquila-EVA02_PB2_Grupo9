package ar.edu.unlam.pb2.AlquilerDeVehiculos;

public class Cliente extends Persona{
	
	private Tarjetas tipoDeTarjeta;

	public Cliente(String nombre, String apellido, Integer dni, Byte edad, Tarjetas tipoDeTarjeta) {
		super(nombre, apellido, dni, edad);
		// TODO Auto-generated constructor stub
		this.setTipoDeTarjeta(tipoDeTarjeta);
	}

	public Tarjetas getTipoDeTarjeta() {
		return tipoDeTarjeta;
	}

	public void setTipoDeTarjeta(Tarjetas tipoDeTarjeta) {
		this.tipoDeTarjeta = tipoDeTarjeta;
	} 

	

}
