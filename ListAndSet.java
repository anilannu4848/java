package automation;

import java.util.ArrayList;
import java.util.List;

public class ListAndSet {

	public static void main(String[] args) {
		
		  List<String>list = new ArrayList<String>();
		
		//List<String>list2 = new LinkedList<String>();
		
		//List<String>list3 = new Vector<String>();
		
    	//Set<String>list4 = new HashSet<String>();
		
		//Set<String>list5 = new TreeSet<String>();
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.size());
		
		    list.add("UFT");
		    
		    list.add("OTP");
		    
		    list.add("SELENIUM");
		    
		    list.add("APPIUM");
		    
		    list.add("QTP");
		    
		    System.out.println(list.isEmpty());
		    
		    System.out.println(list.size());
		    
		    System.out.println(list);
		    
		    list.remove("UFT");
		    
		    System.out.println(list.contains("UFT"));
		    
		    list.clear();
		    
		    System.out.println(list);

	}

}
