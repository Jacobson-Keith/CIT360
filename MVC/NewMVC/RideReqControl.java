public class RideReqControl {
   private RideReq model;
   private RideReqView view;

   public RideReqControl(RideReq model, RideReqView view){
      this.model = model;
      this.view = view;
   }

   public void setHeight(String height){
      model.setName(name);		
   }

   public String getHeight(){
      return model.getHeight();		
   }

   public void setAge(String age){
      model.setAge(age);		
   }

   public String getAge(){
      return model.getAge();		
   }

   public void updateView(){				
      view.printRequirementDetails(model.getHeight(), model.getAge());
   }	
}