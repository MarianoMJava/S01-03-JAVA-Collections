package s0103n1Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class S0103N1Ejercicio2 {

	public static void main(String[] args) {
		
		Random nro = new Random();
	
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (int i=0 ; i<10 ; i++) {
			
			list.add(nro.nextInt(10));
			
		}
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		ListIterator<Integer> it = list.listIterator(list.size());
		
		while(it.hasPrevious()){
			list2.add(it.previous());
		}
		
		System.out.println(list2);
		
	}

}
