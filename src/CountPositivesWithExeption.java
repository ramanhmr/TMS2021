public class CountPositivesWithExeption {
    public static void main(String[] args){

        int positiveCount = 0;

        try{

            for (String arg : args) {
                if (Integer.parseInt(arg) > 0) {
                    positiveCount++;
                }
            }

            System.out.println("Inserted number(s) include " + positiveCount + " positive value(s).");

        } catch(NumberFormatException e) {

            System.out.println("Looks like there are not only numbers you've entered. Try another set of arguments.");

        }
    }
}
