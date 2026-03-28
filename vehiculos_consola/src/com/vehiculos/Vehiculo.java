package com.vehiculos;

public class Vehiculo {

	private String id;
	private String marca;
	private String modelo;
	private int anio;
	private String placa;
	
	
	public Vehiculo(String id, String marca, String modelo, int anio, String placa) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.placa = placa;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	
	public void mostrarInformacion() {
		System.out.println("ID: " + id);
	    System.out.println("Marca: " + marca);
	    System.out.println("Modelo: " + modelo);
	    System.out.println("Año: " + anio);
	    System.out.println("Placa: " + placa);
	}
	
}
