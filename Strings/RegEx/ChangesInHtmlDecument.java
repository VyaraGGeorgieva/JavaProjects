//input: <p>Please visit <a href="http://academy.telerik.com">our site</a> to choose a training course. Also visit <a href="www.devbg.org">our forum</a> to discuss the courses.</p>
//output: <p>Please visit [URL=http://academy.telerik.com]our site[/URL] to choose a training course. Also visit [URL=www.devbg.org]our forum[/URL] to discuss the courses.</p>
package RegEx;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangesInHtmlDecument {
    private static final String aHrefpattern = "(?i)<a([^>]+)>(.+?)<\\/a>";
    private static final String urlPattern = "[URL=$1]$2[/URL]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String htmlInput = scanner.nextLine();
        Pattern pattern = Pattern.compile(aHrefpattern);
        Matcher matcher = pattern.matcher(htmlInput);
        while(matcher.find()){
            String result = matcher.replaceAll(urlPattern);
            System.out.println(result);
        }


    }


}
