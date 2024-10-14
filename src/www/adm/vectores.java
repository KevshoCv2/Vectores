package www.adm;

import java.util.Vector;

public class vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> numeros = new Vector<>();
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		
		System.out.println("Elemento en el indice 1: " + numeros.get(1));
		
		System.out.println(numeros);

	}

}
