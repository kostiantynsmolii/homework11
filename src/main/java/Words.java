import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Words {
    File file3 = new File("words.txt");
    ArrayList<String> arrayList = new ArrayList<>();

    public ArrayList<String> printWords() throws IOException {
        try (Scanner s = new Scanner(new File(String.valueOf(file3))).useDelimiter("\\s")) {
            while (s.hasNext()) arrayList.add(s.next());
        } catch (FileNotFoundException e) {
        }
        System.out.println(arrayList);
        return arrayList;
    }
        public void counterWords(){
        Map<String, Integer> words = new HashMap<>();
        for (String str : arrayList) {
            if (words.containsKey(str)) {
                words.put(str, 1 + words.get(str));
            } else {
                words.put(str, 1);
            }
        }
        System.out.println(words);
    }
}