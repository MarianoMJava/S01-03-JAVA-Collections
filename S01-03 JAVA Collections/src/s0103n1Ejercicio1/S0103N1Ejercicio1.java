package s0103n1Ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class S0103N1Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<Month> months = new ArrayList<Month>();

		months = cargaMonths(months);

		System.out.println(months);

		Month ag = new Month("AGOSTO");
		months.add(7, ag);

		System.out.println(months); // Se añade agosto y se verifica que se mantiene el orden

		Month dc = new Month("DICIEMBRE");
		months.add(dc); // Se verifica cargando en el array un repetido que si se añade

		System.out.println(months);

		HashSet<Month> monthsHash = new HashSet<Month>(months); // Conversion a HashSet

		System.out.println(monthsHash); // Se evidencia que existe repetidos si viene desde la transformacion del array

		monthsHash.add(dc); // Se añade un objeto repetido y se muesta en la siguiente linea verificando que
							// no se duplican
		monthsHash.add(ag); // Se añade un objeto repetido y se muesta en la siguiente linea verificando que
							// no se duplican

		System.out.println(monthsHash);

		
		recorrerIterador(monthsHash);
		recorrerFor(monthsHash);

	}

	public static ArrayList<Month> cargaMonths(ArrayList<Month> months) {

		Month en = new Month("ENERO");
		Month fb = new Month("FEBRERO");
		Month mr = new Month("MARZO");
		Month ab = new Month("ABRIL");
		Month my = new Month("MAYO");
		Month jn = new Month("JUNIO");
		Month jl = new Month("JULIO");
		Month sp = new Month("SEPTIEMBRE");
		Month oc = new Month("OCTUBRE");
		Month nv = new Month("NOVIEMBRE");
		Month dc = new Month("DICIEMBRE");

		months.add(en);
		months.add(fb);
		months.add(mr);
		months.add(ab);
		months.add(my);
		months.add(jn);
		months.add(jl);
		months.add(sp);
		months.add(oc);
		months.add(nv);
		months.add(dc);

		return months;
	}

	public static void recorrerIterador(HashSet<Month> monthsHash) {

		System.out.println("Recorriendo mediante iterador");
		
		Iterator<Month> it = monthsHash.iterator();

		while (it.hasNext()) {
			System.out.print(" " + it.next()); // Recorremos mediante interador
			
		}
		
		System.out.println("\n");
	}

	public static void recorrerFor(HashSet<Month> monthsHash) {

		System.out.println("Recorriendo mediante bucle for");
		for (Month i : monthsHash) {

			System.out.print(" " + i); // Se recorre mediante for

		}
	}

}
