import org.junit.Test;
import static org.junit.Assert.*;

public class TestAssertions {

   @Test
   public void testAssertions() {
      //test data
      String str1 = new String ("Keith");
      String str2 = new String ("Keith");
      String str3 = null;
      String str4 = "Keith";
      String str5 = "Keith";
		
      int val1 = 12;
      int val2 = 17;

      String[] expectedArray = {"uno", "dos", "tres"};
      String[] resultArray =  {"uno", "dos", "tres"};

	  //Here are examples of assertEquals, assertTrue, AssertFalse
	  //AssertNotNull, assertNull, assertSame, assertNotSame, assertArrayEquals
	  //I feel like their names are pretty self explainatory.
	  
      //Check that two objects are equal
      assertEquals(str1, str2);

      //Check that a condition is true
      assertTrue (val1 < val2);

      //Check that a condition is false
      assertFalse(val1 > val2);

      //Check that an object isn't null
      assertNotNull(str1);

      //Check that an object is null
      assertNull(str3);

      //Check if two object references point to the same object
      assertSame(str4,str5);

      //Check if two object references not point to the same object
      assertNotSame(str1,str3);

      //Check whether two arrays are equal to each other.
      assertArrayEquals(expectedArray, resultArray);
   }
}