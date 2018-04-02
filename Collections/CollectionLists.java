import java.util.*;

public class CollectionList {
   public static void main(String args[]) {
   
	  ArrayList<String> animals = new ArrayList<String>();

	  /*Elements added to Array List*/
	  animals.add("Elephant");
	  animals.add("Giraffe");
	  animals.add("Lion");
	  animals.add("Rhino");
	  animals.add("Tiger");

	  /* Displaying array list*/
	  System.out.println("Array:"+animals);

	  /*Add element at the given index*/
	  animals.add(0, "Dog");
	  animals.add(1, "Cat");

	  /*Remove elements from array list like this*/
	  animals.remove("Lion");
	  animals.remove("Rhino");

	  System.out.println("Current array list is:"+animals);

	  /*Remove element from the given index*/
	  animals.remove(1);

	  System.out.println("Current array list is:"+animals);
   }
}