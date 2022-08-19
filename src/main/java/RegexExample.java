import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexExample {

    public static void main(String[] args) {


        Pattern p = Pattern.compile("alpha", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("Alpha Ngwenya is the boss");
        boolean b = m.matches();

        Pattern px = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = px.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();

        // Another way to do the above  3 lines
        boolean z = Pattern.matches("a*b*", "aaaaaaabbbbb");



//        System.out.println(b);
        System.out.println(matchFound);

    }
}
