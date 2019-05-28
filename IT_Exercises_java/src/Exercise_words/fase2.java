package Exercise_words;
import java.util.ArrayList;
import java.util.List;


public class fase2 {
	

public static List<Character> nomList;

	
public static List<Character> nomList (List<Character> name){
			nomList=name;
			
			
	List<Character> ch = new ArrayList<>();	
	
	for (int i = 0; i < name.size(); i++) {

		Character nameBucle = name.get(i);
		 
		if (nameBucle== 'A' || nameBucle == 'E' || nameBucle == 'I' || nameBucle == 'O' || nameBucle == 'U') {
			System.out.println(nameBucle + " -->" + " Vocal");
			
		} else if (Character.isDigit(nameBucle)) {
			System.out.println("Los nombres no contienen numeros");
			
		} else if (Character.isLetter(nameBucle)) {		
			System.out.println(nameBucle + " -->" + " consonante");
			
		} else {		
			System.out.println("Los nombres no contienen caracteres especiales");
		}
		
	}
			
			
	return  name;
	
}
	
	
}
