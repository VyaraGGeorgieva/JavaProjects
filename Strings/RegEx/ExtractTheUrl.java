//input: http://www.devbg.org/forum/index.php
//output: [protocol] = http
        //[server] = www.devbg.org
        //[resource] = /forum/index.php

package RegEx;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTheUrl {

    private static final String protocol = "[protocol] = ";
    private static final String server = "[server] = ";
    private static final String resource = "[resource] = ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        
        Pattern protocolMatcher = Pattern.compile("([a-z]+)(:\\/\\/+)([a-z.]+)(\\/.+)");
        Matcher matcher = protocolMatcher.matcher(url);

        if (matcher.find()){
            String foundProtocol = protocol.concat(matcher.group(1));
            String foundServer = server.concat(matcher.group(3));
            String foundResource = resource.concat(matcher.group(4));

            System.out.println(foundProtocol);
            System.out.println(foundServer);
            System.out.println(foundResource);
        }
    }
}
