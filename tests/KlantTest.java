import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class KlantTest {
    @Test
    void klantTest1() {

        Klant klantTest = new Klant("test","testAchternaam","2324PA", 0.0,0.0);
        assertEquals("test", klantTest.getVoorNaam());
    }

    @Test
    void klantTest2(){
        Klant klantTest = new Klant("test2","testAchternaam","2324PA", 0.0,0.0);
        assertEquals("test2", klantTest.getVoorNaam());
    }
}
