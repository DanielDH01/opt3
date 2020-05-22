import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class KlantTest {
    Kassa kassa1 = new Kassa(1000);
    @Test
    void klantTest1() {
        Bibliotheek testBieb = new Bibliotheek("testBieb", "1234PA","test",12,"testStad");
        testBieb.getBoekLijst().add(new Boek(testBieb,"testTitel", 530,"testAuteur", "Actie"));
        Normaal testKlant = new Normaal(testBieb.getBibliotheekID(),"testNaam", "testAchternaam", "2345pa", 100.0);
        testBieb.leenBoek(testKlant.getUniqueIDpersoon(),0);
        assertEquals("Boete aantal is al 0",testKlant.betaalBoete(kassa1));
    }

    @Test
    void klantTest2(){
        Bibliotheek testBieb = new Bibliotheek("testBieb", "1234PA","test",12,"testStad");
        testBieb.getBoekLijst().add(new Boek(testBieb,"testTitel", 530,"testAuteur", "Actie"));
        Student testKlant = new Student(1230,testBieb.getBibliotheekID(),"testNaam", "testAchternaam", "1234PA", 100.0);
        testKlant.setBoeteAantal(2000.0);
        testBieb.leenBoek(testKlant.getUniqueID()-1,0);
        assertEquals("Je hebt niet genoeg geld op je rekening",testKlant.betaalBoete(kassa1));
    }

    @Test
    void klantTest3(){
        Bibliotheek testBieb = new Bibliotheek("testBieb", "1234PA","test",12,"testStad");
        Boek test = new Boek(testBieb,"testTitel", 530,"testAuteur", "Actie");
        testBieb.getBoekLijst().add(test);
        Senior testKlant = new Senior(12309,testBieb.getBibliotheekID(),"testNaam", "testAchternaam", "1234PA", 100.0);
        testKlant.setBoeteAantal(2000.0);
        testBieb.leenBoek(testKlant.getUniqueID(),testBieb.getBoekLijst().get(test.getUniqueID()).getUniqueID());
        assertEquals("Je hebt niet genoeg geld op je rekening",testKlant.betaalBoete(kassa1));
    }
}
