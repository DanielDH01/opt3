import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Modified condition/decision coverage
public class MaxBoekenGangpadTest {
    Bibliotheek testBieb = new AdresGegevens("testBieb", "1234PA", "test", 12, "testStad");
    GangPad gangpadActie = new GangPad(testBieb,"Actie",120);
    GangPad gangpadDrama = new GangPad(testBieb,"Drama",120);


    @Test
    void testMaxGangPadCat1(){
        for(int i = 0; i <= 121; i++){
            gangpadActie.getBoekenInGangPad().add(new Boek(testBieb,"actieTitel",1230, "actieAuteur", "Actie"));
        }
        //maxboeken en categorie false
        assertFalse(gangpadActie.checkBoekToevoegen(new Boek(testBieb,"testTitel",12," ","Drama")));

    }

    @Test
    void testMaxGangPadCat2(){
        for(int i = 1; i <= 120; i++){
            gangpadDrama.voegBoekToe(new Boek(testBieb,"actieTitel",1230, "actieAuteur", "Drama"));
        }
        //maxboeken false
        assertFalse(gangpadDrama.checkBoekToevoegen(new Boek(testBieb,"testTitel",12," ","Drama")));

    }

    @Test
    void testMaxGangPadCat3(){
        gangpadActie.voegBoekToe(new Boek(testBieb,"actieTitel",1230, "actieAuteur", "Actie"));
        //categorie.equals false
        assertFalse(gangpadActie.checkBoekToevoegen(new Boek(testBieb,"testTitel",12," ","Drama")));

    }

    @Test
    void testMaxGangPadCat4(){
        for(int i = 1; i <= 119; i++){
            gangpadDrama.voegBoekToe(new Boek(testBieb,"actieTitel",1230, "actieAuteur", "Drama"));
        }
        //beide true
        assertTrue(gangpadDrama.checkBoekToevoegen(new Boek(testBieb,"testTitel",12," ","Drama")));

    }

}
