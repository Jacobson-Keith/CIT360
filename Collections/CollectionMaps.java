import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class CollectionsMap {

   public static void main(String[] args) {
      Map map = new HashMap(); 
      map.put("Theo", "1 years old");
      map.put("Oliver", "2 years old");
      map.put("Sophia", "3 years old");
      map.put("Morgane", "23 years old");
      map.put("Keith", "28 years old");
      System.out.println();
      System.out.println(" Map Elements:");
      System.out.print("\t" + map);
      
      
      
      // Tree Map
      // Create a hash map
      TreeMap treemap = new TreeMap();
	  
      // Put elements to the map
      treemap.put("Caren",   new Double(6789.00));
      treemap.put("Rebecca", new Double(1234.56));
      treemap.put("Brad",    new Double(3431.87));
      treemap.put("Matt",    new Double(-10000.99));
      treemap.put("Emily",   new Double(1412.34));
      
     // Get a set of the entries
      Set set = tm.entrySet();
	  
      // Get an iterator
      Iterator i = set.iterator();
	  
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
	  
      // Deposit $1000 into Rebecca's account
      double balance = ((Double)treemap.get("Rebecca")).doubleValue();
      treemap.put("Rebecca", new Double(balance + 1000));
      System.out.println("Rebecca's new balance: " +
      treemap.get("Rebecca"));
   }
}