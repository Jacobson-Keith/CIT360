package MVC;

public class MapControl {

    public static Map createMap() {
    
    Map map = new Map();
    States[] locations = new State[25];
      
    locations[0] =  new State("Washington");
    locations[1] =  new State("Oregon");
    locations[2] =  new State("Florida");
    locations[3] =  new State("Puerto Rico?");
    locations[4] =  new State("Utah");
    locations[5] =  new State("California");
    locations[6] =  new State("Georgia");
    locations[7] =  new State("Idaho");
    locations[8] =  new State("Montana");
    locations[9] =  new State("Arizona");
    locations[10] = new State("New York");
    
    map.setLocation(locations);
   
    assignScenesToLocations(locations);
    return map;
      
    }

    
}