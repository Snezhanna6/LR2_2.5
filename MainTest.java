package Main;

import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Метод для проверки метода searchTask класса Main
    @Test
    void searchTaskMethodMainTest() {

        String expected = Main.searchTask("dsiaaaskdl");
        String actual = "YES";
        assertEquals(expected,actual);

        expected = Main.searchTask("dsi00skdl");
        actual = "YES";

        assertEquals(expected,actual);

        expected = Main.searchTask("dsiaa00askdl");
        actual = "YES";

        assertEquals(expected,actual);

        expected = Main.searchTask("0");
        actual = "NO";

        assertEquals(expected,actual);
    }
}