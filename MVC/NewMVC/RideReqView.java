package NewMVC;

public class RideReqView {
   public void printRequirementDetails(String riderHeight, String riderAge){
      if (riderHeight > 42 && riderAge > 7) {
	  System.out.println("Remeber to keep you arms and legs in at all times, and have fun!");
	  } else {
      System.out.println("Too short or young to ride this coaster, try agian when you grow up.");
	  }
   }
}
