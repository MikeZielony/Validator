package codecool.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public String readFromFile(String filename) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String id = reader.readLine();
            return id;
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }
    }
}
