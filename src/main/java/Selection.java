import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Selection {
    File file = new File("file.txt");

    String selection = "\\(\\d{3}\\)\\s\\d{3}-\\d{4}";
    String selection1 = "\\d{3}-\\d{3}-\\d{4}";

    public void print(){
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = br.readLine()) != null) {
            Pattern p = Pattern.compile(selection);
            Pattern p1 = Pattern.compile(selection1);
            Matcher m = p.matcher(line);
            Matcher m1 = p1.matcher(line);
            if (m.find() || m1.find()) {
                System.out.println(line);
            }
        }
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
