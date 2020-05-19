import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

class BoekTest {
    @Test
    void testBoekTitel(){
        Boek boek1 = new Boek("hansie", 256,"Frank", "spanning");
        assertEquals("hansie", boek1.getTitel());
    }
}