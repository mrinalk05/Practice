package driver;

public class Overrrii {

	public static void main(String[] args) {
		
		
		b y= new b();
		y.show();
		a l = new a();
		l.show();
		
	}
	
}
	
	class a {
		void show() {
			System.out.println("a");
		}
	}
	
	class b extends a{
		 void show () {
			System.out.println("b");
		}
		 class c{
				void show() {
					System.out.println("a");
				}
			}
		 
		 
	}


