package MVC;

public class MapView {
    
    public MapView() {                          
    }
    
    public void displayMap(){
        Game game = UnitedStates.getCurrentGame();
        Map map = game.getMap();
        States[] location = map.getLocation();
        
        for(int i=0; i < location.length; i++){
            System.out.println(
            "State: " + location[i].getName();
        }
    }
}
