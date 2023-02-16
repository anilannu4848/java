package automation;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		
 java.util.Map<String, String>map = new HashMap<String,String>();
 
//java.util.Map<String, String>map = new TreeMap<String,String>();
 
//java.util.Map<String, String>map2 = new Hashtable<String,String>();
 
   map.put("TestScript", "Tc001");
		
   map.put("username", "Admin");	
		
   map.put("password","Admin123");
		
	System.out.println(map.get("username"));	
		
	System.out.println(map);	
		
	map.remove("password");
	
	System.out.println(map);
	
	
	
	}

}