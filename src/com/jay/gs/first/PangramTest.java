package com.jay.gs.first;

import java.util.LinkedHashSet;
import java.util.Set;

public class PangramTest {
	private static Set<String> set = new LinkedHashSet<>();;

	public static void main(String[] args) {

		System.out
				.println(missingInPangram("Hhkhjksjdkjkldsdj utyu skldjskljjsjdshklfhfhklsj dgdg sdioeuuyrvnvm,lpouuteewaszxcvxvffsdgdgfhhjjhkklpiioioyuturtyetadascxzvvcbbvnvm"
						+ "Hhkhjksjdkjkldsdjskldjskljjsjdshklfhfhklsjioeuuyrvnvm,lpogg duuteewaszxcvxvffsdgdgfhhjjhkklpiioioyuturtyetadascxzvvcbdfdggfggbvnvm"
						+ "Hhkhjksjd hgkj trhfkldsdjerty t utskldjsg dg kljjsjdshklfd gsdg hfhklsjioeuuyrvnvm,g lpouuteewaszxcvxvffsddfgdggdgfhhjjhkklpiioioyuturtyetadascxzvvcbbvnvm"
						+ "Hhkhjksjgdkjkldsdgd jskldjgskljjsjdshklfhfhklsjd gsdioeuuyrvnvm,lpouuteewaszxcvxvffsdgdgfhhjjhkklpiioioyuturtyetadascxzvgdgdfg dgvcbbvnvm"
						+ "Hhg fdg khjksjdkjkldsdg dgsgdgsdjskldjskljjsjdshklfhfhklsjioeuug ggyrvnvm,lpouuteewaszxcvxvffsdgdgfhddgghjjhkklpiioioyuturtyetadascxzvvcbbvnvm"
						+ "Hhkhjksjdkjkldsdjskldjskljjsjdshklfhfhklsjioeuuyrvnvm,lpouuteewaszxcvxvffsdgdgfhhjjhkklpiioioyuturtyetadascxzvvcbbvnvm"
						+ "Hhdkdvdvxkvef jslfjsdlghfkgjdgurio tu4t8490684yoi vdjvdlfkfksopf4405940tidpkvl g jljljd gdj ldgjdlj gldsjg gjdhjksjdkjkldsdjskldjskljjsjdshklfhfhklsjioeuuyrvnvm,lpouuteewaszxcvxvffsdgdgfhhjjhkklpiioioyuturtyetadascxzvvcbbvnvm"
						+ "Hhkhjksjdkjkldsdjskldjskljjsjdshklfhfhklsjioeuuyrvnvm,lpouuteewaszxcvxvffsdgdgfhhjjhkklpiioioyuturtyetadascxzvvcbbvnvm"
						+ ""));
		
		System.out
		.println(missingInPangram("H"
				+ ""));
		
		System.out
		.println(missingInPangram("Hhkhjksjdkjkldsdj"
				));
	}

	public static Set<String> missingInPangram(String str) {
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");

		set.add("G");
		set.add("H");
		set.add("I");

		set.add("J");
		set.add("K");
		set.add("L");
		set.add("M");
		
		set.add("N");
		set.add("O");
		set.add("P");
		set.add("Q");
		set.add("R");
		set.add("S");
		
		set.add("T");
		set.add("U");
		set.add("V");

		set.add("W");
		set.add("X");
		set.add("Y");
		set.add("Z");
		
		if (str != null && !"".equals(str)) {
			str = str.toUpperCase();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				set.remove(String.valueOf(c));
//				str = str.replaceAll(String.valueOf(c), "");
			}
		}
		return set;
	}
}