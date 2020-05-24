import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WerkTests {
    Persoon persoonTest = new Persoon("voornaamTest", "achternaamTest","testPostcode", 0.0);
    //EQUIVALENCE TESTING
    @Test
    void werkTest(){
        assertEquals("U heeft geen uurloon",persoonTest.werk(2.0));
    }

    @Test
    void werkTest1(){
        persoonTest.setUurLoon(null);
        assertEquals("U heeft geen uurloon",persoonTest.werk(2.0));
    }

    @Test
    void werkTest2(){
        persoonTest.setGeld(0.0);
        persoonTest.setUurLoon(1.0);
        assertEquals("Uw geldBedrag = 1.00",persoonTest.werk(1.0));
    }

    @Test
    void werkTest3(){
        persoonTest.setGeld(0.0);
        persoonTest.setUurLoon(1.0);
        assertEquals("U heeft niet meer dan 0 uur gewerkt dus geen loon ontvangen"
                ,persoonTest.werk(0.0));
    }


}
