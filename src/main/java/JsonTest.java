import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonTest{
    File file3 = new File("file1.txt");
    List<User> usersObjects = new ArrayList<>();

    public void printJson() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file3))) {
            String line = reader.readLine();
            line = reader.readLine();
            while (line != null) {
                if (!line.isEmpty()) {
                    User user = new User();
                    String[] argument = line.split(" ");
                    user.setName(argument[0]);
                    user.setAge(Integer.parseInt(argument[1]));
                    usersObjects.add(user);
                    line = reader.readLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

        try (PrintWriter printWriter = new PrintWriter(new FileWriter("user.json"))) {
            Gson gson = new Gson();
            for (User user : usersObjects) {
                printWriter.write(gson.toJson(user));
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
