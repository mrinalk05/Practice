package InterfaceAndAbstract;

public class PrimeNumber 
{
	
	public static void main(String args []) 
	{
		int num=3;
		for(int i=2; i<=10; ) {
			int temp=0;
			for (int j=2;j<=Math.sqrt(num); j++) {
				
				if (i%j==0) {
					temp=temp+1;
					break;
				}
				
			}
			if (temp==0) {
				System.out.println(num);
				i++;
			}
			num++;
		}
		
		
	}

}
