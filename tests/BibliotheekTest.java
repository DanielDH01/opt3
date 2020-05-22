import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotheekTest {
    Kassa kassa1 = new Kassa(1000);
    Bibliotheek testBieb = new Bibliotheek("testBieb", "1234PA", "test", 12, "testStad");
    Boek testBoek = new Boek(testBieb, "testTitle", 230, "testAuteur", "Actie");
    GangPad gangpadActie = new GangPad(testBieb,"Actie",120);
    GangPad gangpadHumour = new GangPad(testBieb,"Humour",120);
    GangPad gangpadDrama = new GangPad(testBieb,"Drama",120);

    @Test
    void testGangPadCat(){
        Boek boekHumour = new Boek(testBieb,"humourTitel",129, "humourAuteur","humour");

        assertTrue(testBieb.checkCat(gangpadHumour, boekHumour));
    }
}