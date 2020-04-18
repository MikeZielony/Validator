package codecool.com;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        String id = reader.readFromFile("validator/src/main/java/codecool/com/id.txt");

        System.out.println(id);

        Validator validator = new Validator();
        // for loop
        System.out.println(validator.isCorrect(id));

    }
}
