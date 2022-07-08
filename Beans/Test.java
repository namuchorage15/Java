package Mine;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		BeansExample1 B1=new BeansExample1();
		B1.setId(20);
		System.out.println("Id value :-"+B1.getId());
		B1.setName("soma");
		System.out.println("name value:-"+B1.getName());
		String Array[]= {"computer","IT","CIVIL","MECH"};
		
		
		//
		B1.setArray(Array);
		String[] deptArray = B1.getArray();
		
		System.out.println("using Array");
		for (int i=0; i<deptArray.length; i++)
		{
			System.out.println("department "+(i+1)+ ":" + deptArray[i]);
			
		}
		
		
		//using collection
		List<String> A = new ArrayList<String>();
		A.add("English");
		A.add("Science");
		A.add("Computer");
		
		B1.setA(A);
		
		List<String> deptArray1=B1.getA();
		
		System.out.println("using collection");
		for (int i = 0; i<deptArray1.size(); i++)
		{
			System.out.println("department " + (i + 1)+ ":" +deptArray1.get(i));
			
		}
	}
	
}
   
	


