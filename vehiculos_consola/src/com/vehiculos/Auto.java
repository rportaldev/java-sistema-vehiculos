package com.vehiculos;

public class Auto extends Vehiculo implements Mantenimiento{

	private int numeroPuertas;
	private String tipoCombustible;
	
	
	public Auto(String id, String marca, String modelo, int anio, String placa, int numeroPuertas,
			String tipoCombustible) {
		super(id, marca, modelo, anio, placa);
		this.numeroPuertas = numeroPuertas;
		this.tipoCombustible = tipoCombustible;
	}


	public int getNumeroPuertas() {
		return numeroPuertas;
	}


	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}


	public String getTipoCombustible() {
		return tipoCombustible;
	}


	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Tipo: AUTO");
		System.out.println("Puertas: " + numeroPuertas);
	    System.out.println("Combustible: " + tipoCombustible);
	}
	
	
	//METODO
	@Override
	public double calcularCostoMantenimiento() {
		return 500.0;
	}
	
}
