public class RocketLaunch {
    public static void main(String[] args) {
        Spaceport canaveral = new Spaceport();
        IStart[] rockets = {new Shuttle(), new SpaceXBFR()};
        for (IStart rocket : rockets) {
            canaveral.launch(rocket);
            System.out.println();
        }
    }
}
