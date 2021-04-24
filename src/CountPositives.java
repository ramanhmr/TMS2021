public class CountPositives {
    public static void main(String[] args){

        int positiveCount = 0;

        for (String arg : args) {
            if (Integer.parseInt(arg) > 0) {
                positiveCount++;
            }
        }

        System.out.println("Inserted number(s) include " + positiveCount + " positive value(s).");
    }
}
