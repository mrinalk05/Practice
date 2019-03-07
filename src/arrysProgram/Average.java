package arrysProgram;

public class Average {

	public static void main(String[] args) {
		double a[]= {12,34,65,80};
		double sum=0;
		for(double x:a) {
			sum+=x;
		}
		double ave=sum/a.length;
		
		System.out.println(ave);

	}

}
