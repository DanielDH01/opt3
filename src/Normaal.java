import java.util.ArrayList;

public class Normaal extends Klant{

    public Normaal(Integer id, String voorNaam, String achterNaam, String postCode, Double geld) {
        super(id, voorNaam, achterNaam, postCode, geld, 0.0);
    }

    public Normaal(Integer id, String voorNaam, String achterNaam, String postCode, Double geld, Double boeteAantal, ArrayList<Boek> boekenInBezit) {
        super(id, voorNaam, achterNaam, postCode, geld, boeteAantal, boekenInBezit, 0.0);
    }

    public Normaal(String voorNaam, String achterNaam, String postCode, Double geld, Double boeteAantal, ArrayList<Boek> boekenInBezit) {
        super(voorNaam, achterNaam, postCode, geld, boeteAantal, boekenInBezit, 0.0);
    }
}
