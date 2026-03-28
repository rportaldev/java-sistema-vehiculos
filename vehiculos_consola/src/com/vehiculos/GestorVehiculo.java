package com.vehiculos;

import java.util.ArrayList;

public class GestorVehiculo {

	private ArrayList<Vehiculo> flota = new ArrayList<Vehiculo>();
	
	//REGISTRAR UN VEHICULO
	public boolean registraVehiculo(Vehiculo vehiculo) {
		
		for(Vehiculo v: flota) {
			
			if(v.getId().equals(vehiculo.getId())) {
				return false;
			}
			
			if(v.getPlaca().equals(vehiculo.getPlaca())){
				return false;
			}
		}
		
		if(vehiculo.getAnio() < 1900) {
			return false;
		}
		
		flota.add(vehiculo);
		return true;
	}
	
	//LISTAR TODOS LOS VEHICULOS
	public void mostrarVehiculos() {
		
		for(Vehiculo v: flota) {
			v.mostrarInformacion();
		}
	}
	
	//BUSCAR VEHICULOS 
	public Vehiculo buscarVehiculo(String placa) {
		
		for(Vehiculo v: flota) {
			
			if(v.getPlaca().equals(placa)) {
				return v;
			}
		}
		return null;
	}
	
	
	//ELIMINAR VEHICULOS
	public boolean eliminarVehiculo(String placa) {
		
		for(Vehiculo v: flota) {
			
			if(v.getPlaca().equals(placa)) {
				return flota.remove(v);
			}
		}
		return false;
	}
	
	
	//COSTOS DE MANTENIMIENTOS
	public void mostrarCostoMantenimiento() {
		
		for(Vehiculo v: flota){
			// CASTEAR VEHICULO A MANTENIMIENTO
	        Mantenimiento m = (Mantenimiento) v;
	        System.out.println("Placa: " + v.getPlaca() + 
	            " → Costo mantenimiento: S/." + 
	            m.calcularCostoMantenimiento());
		}
	}
}
