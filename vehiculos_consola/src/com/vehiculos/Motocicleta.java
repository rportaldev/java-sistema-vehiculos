package com.vehiculos;

public class Motocicleta extends Vehiculo implements Mantenimiento{

	private int cilindrada;
	private String tipoMotocicleta;
	
	
	public Motocicleta(String id, String marca, String modelo, int anio, String placa, int cilindrada,
			String tipoMotocicleta) {
		super(id, marca, modelo, anio, placa);
		this.cilindrada = cilindrada;
		this.tipoMotocicleta = tipoMotocicleta;
	}


	public int getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}


	public String getTipoMotocicleta() {
		return tipoMotocicleta;
	}


	public void setTipoMotocicleta(String tipoMotocicleta) {
		this.tipoMotocicleta = tipoMotocicleta;
	}
	
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Tipo: MOTOCICLETA");
		System.out.println("Cilindrada: " + cilindrada);
	    System.out.println("Tipo motocicleta: " + tipoMotocicleta);
	}
	
	@Override
	public double calcularCostoMantenimiento() {
		return 300.0;
	}
}
