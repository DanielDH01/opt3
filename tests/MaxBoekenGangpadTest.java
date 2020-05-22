import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxBoekenGangpadTest {
    Kassa kassa1 = new Kassa(1000);
    Bibliotheek testBieb = new Bibliotheek("testBieb", "1234PA", "test", 12, "testStad");
    Boek testBoek = new Boek(testBieb, "testTitle", 230, "testAuteur", "Actie");
    GangPad gangpadActie = new GangPad(testBieb,"Actie",120);
    GangPad gangpadHumour = new GangPad(testBieb,"Humour",120);
    GangPad gangpadDrama = new GangPad(testBieb,"Drama",120);


    @Test
    void testMaxGangPadCat1(){
        for(int i = 0; i <= 120; i++){
            gangpadActie.getBoekenInGangPad().add(new Boek(testBieb,"actieTitel",1230, "actieAuteur", "Actie"));
        }

        assertEquals("Boek: testTitel Kon niet toegevoegd worden. GangPad te klein\n of je categorie klopt niet",
                gangpadActie.voegBoekToe(new Boek(testBieb,"testTitel",12," ","Actie")));

    }

    @Test
    void testMaxGangPadCat2(){
        for(int i = 1; i <= 119; i++){
            gangpadDrama.voegBoekToe(new Boek(testBieb,"actieTitel",1230, "actieAuteur", "Drama"));
        }

        assertTrue(gangpadDrama.checkBoekToevoegen(new Boek(testBieb,"testTitel",12," ","Drama")));

    }

    @Test
    void testMaxGangPadCat3(){
        for(int i = 1; i <= 120; i++){
            gangpadDrama.voegBoekToe(new Boek(testBieb,"actieTitel",1230, "actieAuteur", "Drama"));
        }

        assertFalse(gangpadDrama.checkBoekToevoegen(new Boek(testBieb,"testTitel",12," ","Drama")));

    }

    @Test
    void testMaxGangPadCat4(){
        gangpadActie.voegBoekToe(new Boek(testBieb,"actieTitel",1230, "actieAuteur", "Actie"));

        assertFalse(gangpadActie.checkBoekToevoegen(new Boek(testBieb,"testTitel",12," ","Drama")));

    }

}
