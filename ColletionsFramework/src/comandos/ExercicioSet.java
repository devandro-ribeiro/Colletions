package comandos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet implements Comparable<ExercicioSet>{

	public static void main(String[] args) {
		//Crie um conjunto com todas as cores do arco-íris
		Set<String> arcoIris = new HashSet<>(Arrays.asList("Vermelho","Laranja","Amarelo","Verde","Azul","Anil","Violeta"));
		
		System.out.println("Exiba todas as cores umas embaixo da outra: ");
		for (String cor : arcoIris) {
			System.out.println(cor);
		}
		
		System.out.println("\nExiba a quantidade de cores que o arco-íris tem:\n"+arcoIris.size()+" cores.");
		System.out.println("\nExiba as cores em ordem alfabética:");
		Set<String> alfabetica = new TreeSet<String>(arcoIris);
		for (String string : alfabetica) {
			System.out.println(string);
		}
		
		System.out.println("\nExiba as cores na ordem inversa em que foram informadas:\n");
		List<String> reverte = new ArrayList<>(alfabetica);
		Collections.reverse(reverte);
		for (String string : reverte) {
			System.out.println(string);
		}
		
		System.out.println("\nExiba todas as cores que começam com a letra 'V':");
		for (String string : alfabetica) {
			if(string.startsWith("V"))
				System.out.println(string);
		}
		
		System.out.println("\nRemova todas as cores que começam com a letra 'V': ");
		Iterator<String> iterator = arcoIris.iterator();
		String next;
		while(iterator.hasNext()) {	
			next = iterator.next();
			if(next.startsWith("V")) iterator.remove();
		}
		for (String string : arcoIris) {
			System.out.println(string);
		}
		
		System.out.println("\nLimpe o conjunto: ");
		arcoIris.clear();
		System.out.println(arcoIris);
		
		System.out.println("\nConfira se o conjunto está vazio:\n"+arcoIris.isEmpty());
		
	}

	@Override
	public int compareTo(ExercicioSet o) {
		
		return 0;
	}

}
