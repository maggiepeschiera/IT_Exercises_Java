package Exercise_words;

import java.util.ArrayList;
import java.util.List;

	public class fase4 {

		List<Character>name;
		List<Character>surname;
		
		public fase4(List<Character> mp, List<Character> mpp) {

		name=mp;
		surname=mpp;
	 
		}


		public List<Character> getfullname(){
	
	
		ArrayList<Character> fullname=new ArrayList<>();
		fullname.addAll(name);
		fullname.addAll(surname);
		
		return fullname;
		}
		
}
