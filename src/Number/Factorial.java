package Number;

public class Factorial {
	
	
	public static void main(String args[]) {
		
		double num=20;
		double fact=1;
		for (int i =1;i<=num;i++) {
			fact =fact*i;
			
			if (i==num) {
				System.out.println("Factorial of "+num+" is: "+(long)fact);
			}
		}
		
	}

}
