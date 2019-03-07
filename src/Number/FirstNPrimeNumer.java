package Number;

public class FirstNPrimeNumer {
	
	public static void main(String args[]) {
		
		int num=2;
		 for ( int i = 1 ; i <=10 ;  )
	      {
			 int temp =0;
	         for ( int j = 2 ; j <= num/2 ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               temp=temp+1;
	               break;
	            }
	         }
	         if ( temp== 0 )
	         {
	            System.out.println(num);
	            i++;
	         }
	         
	         num++;
	      }         
	   }

}
