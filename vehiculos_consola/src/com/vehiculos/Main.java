package com.vehiculos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		GestorVehiculo gestor = new GestorVehiculo();
		
		do {
			System.out.println("\n===== SISTEMA DE VEHICULOS =====");
			System.out.println();
			System.out.println("1. REGISTRAR VEHICULO");
			System.out.println("2. MOSTRAR TODOS LOS VEHICULOS");
			System.out.println("3. BUSCAR VEHICULO POR PLACA");
			System.out.println("4. ELIMINAR VEHICULO");
			System.out.println("5. MOSTRAR COSTO DE MANTENIMIENTO");
			System.out.println("6. ===== SALIR =====");
			System.out.println("Ingrese una opción: ");
			
			if(sc.hasNextInt()) {
				opcion = sc.nextInt();
				sc.nextLine();
			}else {
				System.out.println("Entrada inválida. Por favor, ingrese un número.");
				sc.nextLine();
				opcion = 0;
			}
			
			switch (opcion) {
			case 1: {
				
				System.out.println("\n¿Qué tipo de vehículo deseas registrar?");
			    System.out.println("1. Auto");
			    System.out.println("2. Camion");
			    System.out.println("3. Motocicleta");
			    System.out.print("Seleccione: ");
               
			    int tipo = sc.nextInt();
			    sc.nextLine();
			    
			 // DATOS GENERALES
			    System.out.print("ID: ");
			    String id = sc.nextLine();

			    System.out.print("Marca: ");
			    String marca = sc.nextLine();

			    System.out.print("Modelo: ");
			    String modelo = sc.nextLine();

			    System.out.print("Año: ");
			    int anio = sc.nextInt();
			    sc.nextLine();

			    System.out.print("Placa: ");
			    String placa = sc.nextLine();
				
			    switch(tipo) {
			    
		        case 1: {
		            System.out.print("Número de puertas: ");
		            int puertas = sc.nextInt();
		            sc.nextLine();

		            System.out.print("Tipo de combustible: ");
		            String combustible = sc.nextLine();

		            Auto auto = new Auto(id, marca, modelo, anio, placa, puertas, combustible);

		            	if(gestor.registraVehiculo(auto)) {
		            		System.out.println("✅ Auto registrado exitosamente.");
		            	} else {
		            		System.out.println("❌ Error: placa o ID duplicado o año inválido.");
		            	}
		            	break;
		        	}
		        
		        case 2: {
		            System.out.print("Capacidad de carga: ");
		            int carga = sc.nextInt();
		            sc.nextLine();

		            System.out.print("Número de ejes: ");
		            int ejes = sc.nextInt();
		            sc.nextLine();

		            Camion camion = new Camion(id, marca, modelo, anio, placa, carga, ejes);

		            if(gestor.registraVehiculo(camion)) {
		                System.out.println("✅ Camion registrado exitosamente.");
		            } else {
		                System.out.println("❌ Error: placa o ID duplicado o año inválido.");
		            }
		            break;
		        }
		        
		        case 3: {
		        	
		            System.out.print("Cilindrada: ");
		            int cilindrada = sc.nextInt();
		            sc.nextLine();

		            System.out.print("Tipo de motocicleta: ");
		            String tipoMoto = sc.nextLine();

		            Motocicleta moto = new Motocicleta(id, marca, modelo, anio, placa, cilindrada, tipoMoto);

		            if(gestor.registraVehiculo(moto)) {
		                System.out.println("✅ Motocicleta registrada exitosamente.");
		            } else {
		                System.out.println("❌ Error: placa o ID duplicado o año inválido.");
		            }
		            break;
		        	}
		        default:
		            System.out.println("❌ Tipo inválido.");
			    	}
			    break;
			    }
		        
		        case 2:{
		        	
		        	gestor.mostrarVehiculos(); 
		            break;
		        
                }
                
		
		        case 3:{
		        	// PIDE EL CODIGO A BUSCAR
		        	System.out.print("Ingrese la placa del vehiculo: ");
		        	
		        	String placaBuscar = sc.nextLine();
		        	
		        	Vehiculo encontrado = gestor.buscarVehiculo(placaBuscar);
		        	
		        	if(encontrado != null) {
		        		System.out.println("\n===== VEHICULO ENCONTRADO =====");
		        		encontrado.mostrarInformacion();
		        	}else {
		        		System.out.println("❌ Vehiculo no encontrado.");
		        	}
		        	break;
		        }
		        
		  
		        case 4:{
		        	// PIDE EL CODIGO A ELIMINAR
		        	System.out.print("Ingrese la placa del vehiculo a eliminar: ");
		        	String placaEliminar = sc.nextLine();
		        	
		        	Vehiculo aEliminar = gestor.buscarVehiculo(placaEliminar);
		        	
		        	if(aEliminar != null) {
		        		gestor.eliminarVehiculo(placaEliminar);
		        		System.out.println("✅ Vehiculo eliminado exitosamente.");
		        	}else {
                        System.out.println("❌ Vehiculo no encontrado.");
		        	}
		        	break;
		        }
		        
		        case 5:{
		        	
		        	System.out.print("vehiculo: ");
		        	gestor.mostrarCostoMantenimiento();
		        	
		        	break;
		        }
		        case 6:{
		        	
		        	System.out.println("👋 Saliendo del sistema...");
					break;	
		        	
		        }
		        	
			default:
				System.out.println("❌ Opción inválida. Intente de nuevo.");
			}
		} while (opcion != 6);

	}

}
