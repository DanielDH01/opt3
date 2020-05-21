import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class BetaalBoeteTest {
    Kassa kassa1 = new Kassa(1000);
    Bibliotheek testBieb = new Bibliotheek("testBieb", "1234PA","test",12,"testStad");

    @Test
    void test1(){
        Normaal testKlant = new Normaal(testBieb.getBibliotheekID(),"testNaam", "testAchternaam", "1234PA", 100.0);
        testKlant.setBoeteAantal(1.0);
        assertEquals("Je boete is betaald",testKlant.betaalBoete(kassa1));
        assertEquals(0.0,testKlant.getBoeteAantal());
    }

    @Test
    void test2(){
        Normaal testKlant = new Normaal(testBieb.getBibliotheekID(),"testNaam", "testAchternaam", "1234PA", 1.0);
        testKlant.setBoeteAantal(1.0);
        assertEquals("Je boete is betaald",testKlant.betaalBoete(kassa1));
    }

    @Test
    void test3(){
        Normaal testKlant = new Normaal(testBieb.getBibliotheekID(),"testNaam", "testAchternaam", "1234PA", 1.0);
        testKlant.setBoeteAantal(10.0);
        assertEquals("Je hebt niet genoeg geld op je rekening",testKlant.betaalBoete(kassa1));
    }

    @Test
    void test4(){
        Normaal testKlant = new Normaal(testBieb.getBibliotheekID(),"testNaam", "testAchternaam", "1234PA", 1.0);
        testKlant.setBoeteAantal(0.0);
        assertEquals("Boete aantal is al 0",testKlant.betaalBoete(kassa1));
    }


}
