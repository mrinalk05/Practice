package arrysProgram;

public class StandardDeiviation {

	public static void main(String[] args) {
		
		double a[]= {1,2,3,4,5,6,7,8,9,10};
		double sd = calculateSD(a);
		System.out.format("Standard devietion is= %.6f :",sd);
		

	}
		
		public static double calculateSD(double numar[]) {
			double sum=0.0; double deviation=0.0;
			int lenght=numar.length;
			
			for(double num :numar) {
				sum=sum+num;
			}
			double mean=sum/lenght;
			
			for (double num: numar) {
				deviation+= Math.pow(num-mean, 2);
			}
		
			
			return Math.sqrt(deviation/lenght);
			
		}

	

}
