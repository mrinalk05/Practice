package string;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {
		String str1= "eat";
		String str2="tea";
		boolean m =true;
		
		char[] main= str1.toLowerCase().toCharArray();
		char[] ana = str2.toLowerCase().toCharArray();
		
		Arrays.sort(main);
		Arrays.sort(ana);		
		for (int i=0; i<main.length;i++) {
			
			if (main.length==ana.length && main[i]==ana[i]) {
				m=false;
			}	
		}
		if (m==false) {
			System.out.println("anagram");
		}
		else {
			System.out.println("Not anagram");
			m=true;
		}

	}

}
