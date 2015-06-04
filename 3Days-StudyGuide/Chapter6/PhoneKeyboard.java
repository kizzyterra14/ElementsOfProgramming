//exercise 6.22

/* Constraints
*/

/* Ideas
*/

/*Code*/

import java.util.ArrayList;

public class PhoneKeyboard{

	public static ArrayList<String> phoneNumberMnemonic(int[] sequence){

		String[] dict = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO","PQRS","TUV","WXYZ"};
		ArrayList<String> sequences = new ArrayList<String>();

		int i = 0;
		while(i < sequence.length){
			for(String s: sequences){

				String characters = dict[sequence[i]];
				int size = characters.length();
				String current = s;
				sequences.remove(s);
				for(int j=0; j<size; j++){
					
					sequences.add(s.append((characters.charAt(j)).toString()));
				}

			}
		}
		return sequences;
	}

	
}