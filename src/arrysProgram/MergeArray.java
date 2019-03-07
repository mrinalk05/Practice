package arrysProgram;

public class MergeArray {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {40,50,60,70};
		int a_lenght=a.length;
		int b_lenght=b.length;
		int c[]= new int[a_lenght+b_lenght];
		for(int i=0;i<a_lenght;i++) {
			c[i]=a[i];
		}
		for (int i=0; i<b.length;i++) {
			
			c[a_lenght+i]=b[i];
		}
		
		for (int d :c) {
			System.out.println(d);
		}
		

	}

}
