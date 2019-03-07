package chare;

public class Swap {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		y=x;
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		
		
		
		int temp=x;
		x=y;
		y=temp;
		System.out.println("****************************");
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}

}
