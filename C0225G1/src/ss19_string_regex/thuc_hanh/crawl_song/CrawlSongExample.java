package ss19_string_regex.thuc_hanh.crawl_song;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            //URL url = new URL("F:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\ss18_string_regex\\thuc_hanh\\crawl_song\\sample.html");
            File file = new File("F:\\Code_Gym\\Git\\module_2\\module_2\\C0225G1\\src\\ss18_string_regex\\thuc_hanh\\crawl_song\\sample.html");
            // open the stream and put it into BufferedReader
            //Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n+", "");
            // regex
            Pattern p = Pattern.compile("name_song\\\" href=\\\".*?\\\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
