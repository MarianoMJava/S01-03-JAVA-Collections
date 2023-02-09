package s0103n1Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class S0103N1Ejercicio3 {

	public static void main(String[] args) {

		HashMap<String, String> countries = new HashMap<String, String>();

		HashMap<String, Integer> jugadores = new HashMap<String, Integer>();

		Scanner sc = new Scanner(System.in);

		String nombre;

		int puntos, menuOp;

		countries = cargaHashMap();

		do {

			menuOp = menu();

			switch (menuOp) {
			case 1:
				
		
				System.out.println("Ingrese el nombre del jugador");
				nombre = sc.nextLine();
		
				
				puntos = juego(countries);

				jugadores.put(nombre, puntos);

				System.out.println(
						"El jugador: " + nombre + " hizo " + jugadores.get(nombre) + " puntos.");

				break;

			case 2:

				for (String i : jugadores.keySet()) {

					System.out.println("El jugador: " + i + " hizo " + jugadores.get(i) + " puntos.");

				}

				break;

			case 3:

				System.out.println("SALIENDO...");

				break;

			default:
				if(menuOp!=0) {
				System.out.println("Opcion erronea intentelo nuevamente");
				}
			}
		} while (menuOp != 3);

	}

	public static HashMap<String, String> cargaHashMap() {

		HashMap<String, String> countries = new HashMap<String, String>();

		FileReader archivo;
		BufferedReader lector;

		try {

			archivo = new FileReader("C:\\Users\\of_tecnica1\\Desktop\\Countries.txt");
			lector = new BufferedReader(archivo);
			String linea;

			while ((linea = lector.readLine()) != null) {

				String[] partes = linea.split(" "); //Dividimos en dos partes la lineas para saber paises y capitales

				String pais = partes[0];
				String capital = partes[1];

				countries.put(pais, capital);
				// System.out.println(countries);

			}

		} catch (IOException e) {

			System.out.println("El proceso de lectura del archivo ha fallado!");
		}

		return countries;
	}

	public static int menu() {

		int opcion=0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n");
		System.out.println("ELEJA UNA OPCION DE JUEGO");
		System.out.println("1 - CREAR JUGADOR Y JUGAR");
		System.out.println("2 - MOSTRAR RESULTADOS");
		System.out.println("3 - SALIR");
	
		System.out.print("Opcion: ");
		
		try {
			
		opcion = sc.nextInt();
		
		}catch(Exception e) {
		
			System.out.println("Opcion no valida, intentelo nuevamente...");
			
		}
		
		return opcion;
	}

	public static int juego(HashMap<String, String> countries) {

		Scanner sc = new Scanner(System.in);

		int puntos = 0, nroRandom;

		ArrayList<String> arrayCountries = new ArrayList<String>();

		Random nro = new Random();

		for (String it : countries.keySet()) {

			arrayCountries.add(it);

		}

		for (int i = 0; i < 10; i++) {

			nroRandom = nro.nextInt(arrayCountries.size());

			System.out.print("Ingrese la capital del siguiente pais " + arrayCountries.get(nroRandom) + ": ");

			String capital = sc.nextLine();

			String capitalObjetivo = countries.get(arrayCountries.get(nroRandom));

			// System.out.println(capitalObjetivo);

			if (capital.equalsIgnoreCase(capitalObjetivo)) {

				puntos += 1;

			}

		}

		return puntos;
	}
}
