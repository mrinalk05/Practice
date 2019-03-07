package InterfaceAndAbstract;

public class ExtractDigitFromString {
	
	
	public static void main (String args[]) {
		String name="Mrinal123";
		char [] N =name.toCharArray();
		
		for (int i=0; i<N.length; i++) {
			if (N[i]>='0' && N[i]<='9') {
				System.out.print(N[i]);
			}
			
		}
		
		
	}

}
