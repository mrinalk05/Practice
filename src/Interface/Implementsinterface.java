package Interface;

public class Implementsinterface implements Interface3 {

	@Override
	public int Add(int a, int b) {
		int c = a+b;
		return c;
		
	}

	@Override
	public void multi(int a, int b) {
		// TODO Auto-generated method stub
		int c = a*b;
		System.out.println("Multi   "+ c);
	}

	@Override
	public void Sub(int a, int b) {
		// TODO Auto-generated method stub
		int c = a-b;
		System.out.println("Sub   "+ c);
	}

	@Override
	public void Add1(int a, int b) {
		// TODO Auto-generated method stub
		int c= a+b;
		System.out.println("Add1  "+c);
		
	}

}
