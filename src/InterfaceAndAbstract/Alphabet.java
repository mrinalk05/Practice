package InterfaceAndAbstract;

public class Alphabet {

	public static void main(String[] args) {

		char c='A';
		
		if ((c>='a' && c<='z') || (c>='A' && c<='Z')) {
			System.out.println("Charector is alphabet");
		}
		else {
			System.out.println(" char is not alphabet");
		}
	}

}
