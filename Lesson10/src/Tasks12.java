public class Tasks12 {
    public static void main(String[] args) {
//      Задание 1
        System.out.println(cut(";lakbjw;bijRight answerr;lkj[wiobhj[wiohbasldkhba", 'R', 'r'));
        System.out.println(remove("Also ri;iaklsfdbho[ihe[oihqwebihq[ahib[hwibsdghhrehehwgwhoght", ';', 'g'));

//      Задание 2
        System.out.println(replaceChars("Абсэлютнэ вернэ"));
    }

    //    Задание 1
    private static String cut(String string, char startChar, char endChar) {
        String result;
        if (string.lastIndexOf(endChar) > string.indexOf(startChar)) {
            result = string.substring(string.indexOf(startChar), string.lastIndexOf(endChar));
            return result;
        }
        return string;
    }

    private static String remove(String string, char startChar, char endChar) {
        String result;
        if (string.lastIndexOf(endChar) > string.indexOf(startChar)) {
            result = string.substring(0, string.indexOf(startChar)) + string.substring(string.lastIndexOf(endChar));
            return result;
        }
        return string;
    }

    //    Задание 2
    private static String replaceChars(String string) {
        int posToBeReplaced = 3;
        int posToReplace = 0;
        return string.replace(string.charAt(posToBeReplaced), string.charAt(posToReplace));
    }
}
