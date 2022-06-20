import com.google.gson.Gson;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        System.out.println("-----Selection numbers-----");
        Selection selection = new Selection();
        selection.print();
        System.out.println("");

        System.out.println("-----JSON-----");
        JsonTest json = new JsonTest();
        json.printJson();
        System.out.println("");
        System.out.println("-----WORDS-----");
        Words word = new Words();
        word.printWords();
        word.counterWords();
        System.out.println(" ");
    }
}





