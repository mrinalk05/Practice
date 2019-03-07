package ArrayList;

public class ArrayEmp implements Comparable  {
	
	
	int empno;
	String Name;
	String Dept;
	
	
	ArrayEmp (int empno, String Name, String Dept) {
		
		this.empno =empno;
		this.Name = Name;
		this.Dept = Dept;
		
	}


	public int compareTo (ArrayEmp Am) {
		if (empno==Am.empno) 
			return 0;
		else if (empno>Am.empno)
			return 1;
		else
			return -1;
		
			
		
		
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}



}
