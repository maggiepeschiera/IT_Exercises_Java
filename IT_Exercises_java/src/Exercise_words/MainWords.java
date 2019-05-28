package Exercise_words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainWords {

	public static void main(String[] args) {
		
		char[] name= {'M','A','G','A','L','Y',' '};
		
		
	
		fase1.charNombre(name);
		System.out.println("\n===========================");
		
		List<Character> nombreLista = new ArrayList<>();

		nombreLista.add('M');
		nombreLista.add('A');
		nombreLista.add('G');
		nombreLista.add('A');
		nombreLista.add('L');
		nombreLista.add('Y');
		
		
		fase2.nomList(nombreLista);
		System.out.println("\n===========================");
		
		
		
		
		HashMap <Integer,Character> myMap =new HashMap<Integer, Character>();
		
		myMap.put(1,'M');
		myMap.put(2,'A');
		myMap.put(3,'G');
		myMap.put(4,'A');
		myMap.put(5,'L');
		myMap.put(6,'Y');
		
		
		fase3.mapLettersHashMap(myMap);
		System.out.println("\n===========================");
		
		List<Character> surname = new ArrayList<>();

		surname.add(' ');
		surname.add('C');
		surname.add('A');
		surname.add('S');
		surname.add('T');
		surname.add('I');
		surname.add('L');
		surname.add('L');
		surname.add('O');
		
		fase4 myFullnameCharacters = new fase4(nombreLista,surname);
	
		System.out.println("FULLNAME: " + myFullnameCharacters.getfullname());
		
	}


}