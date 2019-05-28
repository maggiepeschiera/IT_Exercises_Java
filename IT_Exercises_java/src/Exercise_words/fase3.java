package Exercise_words;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class fase3 {

	public static HashMap<Integer,Character> nom;
	
	public static HashMap<Integer,Character> mapLettersHashMap (HashMap<Integer,Character> newMap){
		
		nom=newMap;
		
		for(Map.Entry<Integer, Character> mpHs: newMap.entrySet()) {
			
			Integer key=mpHs.getKey();
			Character value= mpHs.getValue();
			
			System.out.println("key: " + key + " ; value: " + value);
		}
		
		return newMap;
	}
	
	
	

	
}
