import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class KlantTest {
    @Test
    void klantTest1() {
        Klant klantTest = new Klant("test", "testAchternaam", 300.0);
        assertEquals("test", klantTest.getVoorNaam());
    }
}
