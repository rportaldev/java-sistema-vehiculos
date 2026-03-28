package com.vehiculos;

public class Camion extends Vehiculo implements Mantenimiento {

	private int capacidadCarga;
	private int nroDeEjes;
	
	public Camion(String id, String marca, String modelo, int anio, String placa, int capacidadCarga, int nroDeEjes) {
		super(id, marca, modelo, anio, placa);
		this.capacidadCarga = capacidadCarga;
		this.nroDeEjes = nroDeEjes;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public int getNroDeEjes() {
		return nroDeEjes;
	}

	public void setNroDeEjes(int nroDeEjes) {
		this.nroDeEjes = nroDeEjes;
	}
	
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Tipo: CAMION");
	    System.out.println("Capacidad de carga: " + capacidadCarga);
	    System.out.println("Números de ejes: " + nroDeEjes);
	}
	
	@Override
	public double calcularCostoMantenimiento() {
		return 1500.0;
	}
	
}
