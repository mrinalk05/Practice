package InterfaceAndAbstract;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept   {

	public static void main(String[] args) {
		
		HashMap <Integer, String> hm = new HashMap <Integer, String>();
		hm.put(1, "Mrinal");
		hm.put(2, "Mrinal2");
		hm.put(3, "Mrinal3");
//		System.out.println(hm);
//		Employee em = new Employee("Mrinal", 29	, "QA");
		
		
//		HasMap <Integer, Employee> em = new HasMap<Integer, Employee>();
		
		for (Entry <Integer, String> m :hm.entrySet()) {
			
			int key =m.getKey();
			String value =m.getValue();
			System.out.println(key+"  "+ value + "   "+m);
			
		}
		
	}
	
	

}
