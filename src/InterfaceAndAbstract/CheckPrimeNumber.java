package InterfaceAndAbstract;

public class CheckPrimeNumber {
	public static void main(String args[]) {
		
	
	int num = 29;
	int temp=0;
	for(int i=2; i<=num/2;i++) {
		
		if (num%i==0) {
			temp=temp+1;
			System.out.println("Not prime number");
			break;
		}
		
		
	}
	if (temp==0){
		System.out.println("prime number");
	}


}
}