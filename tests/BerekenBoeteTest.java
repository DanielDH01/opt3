import org.junit.jupiter.api.Test;

public class BerekenBoeteTest {
    Kassa kassa1 = new Kassa(1000);
    Bibliotheek testBieb = new Bibliotheek("testBieb", "1234PA","test",12,"testStad");
    Boek testBoek = new Boek(testBieb.getBibliotheekID(),"testTitle",230,"testAuteur","Actie");

    @Test
    void test1(){
//        Klant klantTest = new Persoon("testVoorNaam","TestAchterNaam","testPostcode",300.0);
    }
}
