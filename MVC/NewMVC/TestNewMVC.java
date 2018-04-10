package NewMVC;

public class TestNewMVC {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      RideReq model  = retriveRidersInfo();

      //Create a view : to write student details on console
      RideReqView view = new RideReqView();

      RideReqControl control = new RideReqControl(model, view);

      control.updateView();

      //update model data
      control.setAge("10");

      controller.updateView();
   }

   private static RideReq retriveRidersInfo(){
      RideReq rider = new RideReq();
      rider.Height("46");
      rider.Age("10");
      return rider;
   }
}