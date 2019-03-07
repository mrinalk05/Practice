package string;


import java.util.Arrays;

public class Anagr {
	public static void main (String [] args) {
		String MainWord ="army";
		String nagram ="Mary";
		System.out.println("Strings are anagram  "+  sortAna(nagram).equalsIgnoreCase(Input(MainWord)));
	}
		
		public static String Input (String MainWord) {
			char[]main =MainWord.toCharArray();
			Arrays.sort(main);
			return new  String(main);
		}
		public static String sortAna(String nagram) {
			char[]ana= nagram.toLowerCase().toCharArray();
			Arrays.sort(ana);
			return new String(ana);
		}
		
	}
	

