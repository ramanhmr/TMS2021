public class RocketLaunch {
    public static void main(String[] args) {
        Spaceport canaveral = new Spaceport();
        IStart[] rockets = {new Shuttle(), new SpaceXBFR()};
        canaveral.launch(rockets[0]);
        canaveral.launch(rockets[1]);
    }
}
