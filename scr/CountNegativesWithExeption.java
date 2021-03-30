public class CountNegativesWithExeption {
    public static void main(String[] args){

        int negativeCount = 0;

        try{

            for (String arg : args) {

                if (Integer.parseInt(arg) < 0) {
                    negativeCount++;
                }

            }

            System.out.println("Inserted number(s) include " + negativeCount + " negative value(s).");

        } catch(Exception e) {

            System.out.println("Looks like there are not only numbers you've entered. Try another set of arguments.");

        }
    }
}
