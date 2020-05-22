import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BerekenBoeteTest {
    Kassa kassa1 = new Kassa(1000);
    Bibliotheek testBieb = new Bibliotheek("testBieb", "1234PA", "test", 12, "testStad");
    Boek testBoek = new Boek(testBieb, "testTitle", 230, "testAuteur", "Actie");

    @Test
    void test1() {
        Normaal klantNormaal = new Normaal(testBieb.getBibliotheekID(), "voornaamTest", "achternaamTest", "2390TE", 100.0);
        assertEquals(14.0, klantNormaal.berekenBoeteBedrag(22), 0.01);
    }

    @Test
    void test2() {
        Senior klantSenior = new Senior(12390, testBieb.getBibliotheekID(), "voornaamTest", "achternaamTest", "2390TE", 100.0);
        assertEquals(12.32, klantSenior.berekenBoeteBedrag(22), 0.01);
    }

    @Test
    void test3() {
        Student klantStudent = new Student(12390, testBieb.getBibliotheekID(), "voornaamTest", "achternaamTest", "2390TE", 100.0);
        assertEquals(12.60, klantStudent.berekenBoeteBedrag(22), 0.01);
    }

    @Test
    void test4() {
        Normaal klantNormaal1 = new Normaal(testBieb.getBibliotheekID(), "voornaamTest", "achternaamTest", "2390TE", 100.0);
        assertEquals(0.0, klantNormaal1.berekenBoeteBedrag(12), 0.01);
    }

    @Test
    void test5() {
        Senior klantSenior1 = new Senior(12390, testBieb.getBibliotheekID(), "voornaamTest", "achternaamTest", "2390TE", 100.0);
        assertEquals(0.0, klantSenior1.berekenBoeteBedrag(12), 0.01);
    }

    @Test
    void test6() {
        Student klantStudent1 = new Student(12390, testBieb.getBibliotheekID(), "voornaamTest", "achternaamTest", "2390TE", 100.0);
        assertEquals(0.0, klantStudent1.berekenBoeteBedrag(12), 0.01);
    }

}
