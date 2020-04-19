package codecool.com;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;


class ValidatorTest {
    Validator validator = new Validator();
    String id = "NHU892906";
    String idFalse = "F12A1Swe6";


    @Test
    void isCorrect() {

        assertEquals(true, validator.isCorrect(id));
        assertEquals(false, validator.isCorrect(idFalse));
    }

    @Test
    void  checkLength() {

        assertEquals(9, validator.checkLength(id));
    }

    @Test
    void checkFirstThreeChars() {

        assertEquals(true, validator.checkFirstThreeChars(id));
    }

    @Test
    void checkLastSixChars() {

        assertEquals(true, validator.checkLastSixChars(id));
    }

    @Test
    void checkControlNumber() {

        assertEquals(true, validator.checkControlNumber(id));
    }
}
