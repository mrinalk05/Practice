package arrysProgram;

import java.util.Arrays;

public class StringArrya {

	public static void main(String[] args) {
		
		String a[]= {"Minku", "Ankur","amay"};
		
		Arrays.sort(a,String.CASE_INSENSITIVE_ORDER);
		//System.out.println(Arrays.toString(a));
		for (String x:a) {
			System.out.println(x);
		}
	}

}
