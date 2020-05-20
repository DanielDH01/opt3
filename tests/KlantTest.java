import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class KlantTest {
    @Test
    void klantTest1() {
        Bibliotheek testBieb = new Bibliotheek("testBieb", "1234PA","test",12,"testStad");
        testBieb.getBoekLijst().add(new Boek(testBieb.getBibliotheekID(),"testTitel", 530,"testAuteur", "Actie"));
        Klant testKlant = new Klant(testBieb.getBibliotheekID(),"testNaam", "testAchternaam", "1234PA", 100.0);
        testBieb.leenBoek(testKlant.getUniqueID(),0);
        assertEquals("Boete aantal is al 0",testKlant.betaalBoete());
    }

    @Test
    void klantTest2(){
        Bibliotheek testBieb = new Bibliotheek("testBieb", "1234PA","test",12,"testStad");
        testBieb.getBoekLijst().add(new Boek(testBieb.getBibliotheekID(),"testTitel", 530,"testAuteur", "Actie"));
        Klant testKlant = new Klant(testBieb.getBibliotheekID(),"testNaam", "testAchternaam", "1234PA", 100.0);
        testKlant.setBoeteAantal(2000.0);
        testBieb.leenBoek(testKlant.getUniqueID(),0);
        assertEquals("Je hebt niet genoeg geld op je rekening",testKlant.betaalBoete());
    }
}
