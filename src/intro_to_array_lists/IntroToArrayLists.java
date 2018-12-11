package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> oof = new ArrayList<String>();
		//2. Add five Strings to your list
		oof.add("u");
		oof.add("ate");
		oof.add("all");
		oof.add("my");
		oof.add("beans");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < oof.size(); i++) {
			String office = oof.get(i);
			System.out.println(office);
		}
		//4. Print all the Strings using a for-each loop
		for (String lol: oof) {
			System.out.println(lol);
		}
		//5. Print only the even numbered elements in the list.
		for (int j = 0; j < oof.size(); j += 2) {
			String lmao = oof.get(j);
			System.out.println(lmao);
		}
		//6. Print all the Strings in reverse order.
		for (int k = oof.size()-1; k > -1; k--) {
			String lmfao = oof.get(k);
			System.out.println(lmfao);
		}
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
