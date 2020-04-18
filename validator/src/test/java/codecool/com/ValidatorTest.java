package codecool.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    public String id = "AKJ075917";

    @Test
    void correctLenght() {

        int b = id.length();
        assertEquals(9, id.length());
    }

    @Test
    void checkIs3FirstIsLetters() {


    }
}