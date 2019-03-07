package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraytest {

	public static void main(String[] args) {
		
		
//		
//		ArrayEmp em = new ArrayEmp(12, "Mrinal", "QA");
//		ArrayEmp em1 = new ArrayEmp(12, "Minku", "QA");
		ArrayList<ArrayEmp > al =new ArrayList<ArrayEmp>(); 
		al.add(new ArrayEmp(12, "Mrinal", "QA"));
		al.add(new ArrayEmp(13, "Minku", "QA"));
//		ArrayList<String > al =new ArrayList<String>(); 
//		al.add("Mrinal");
//		al.add("Ankur");
		
		Collections.sort(al);
		
//		Iterator<ArrayEmp> obj = al.iterator();
		
		
		al.forEach(ae->System.out.println(ae));
			
	}
	    

	}





