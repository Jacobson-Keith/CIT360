package MVC;

public class Main {

    public static void Main(String[] args) {
        runMain();
    }
    public static void runMain(){
        MapModel model = new MapModel();
        MapView view = new MapView(model);
        MapControl controller = new MapControl(model, view);
    }
}