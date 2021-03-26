public class CountNegatives {
    public static void main(String[] args){

        int negativeCount = 0;

        for (String arg : args) {
            if (Integer.parseInt(arg) < 0) {
                negativeCount++;
            }
        }

        System.out.println("Inserted numbers include " + negativeCount + " negative values.");
    }
}
