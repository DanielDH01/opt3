import java.util.ArrayList;

public class Senior extends Klant{
    private Integer seniorNummer;

    public Senior(Integer seniorNummer, Integer id, String voorNaam, String achterNaam, String postCode, Double geld) {
        super(id, voorNaam, achterNaam, postCode, geld, 12.0);
        this.seniorNummer = seniorNummer;

    }

    public Senior(Integer seniorNummer, Integer id, String voorNaam, String achterNaam, String postCode, Double geld, Double boeteAantal, ArrayList<Boek> boekenInBezit) {
        super(id, voorNaam, achterNaam, postCode, geld, boeteAantal, boekenInBezit,12.0);
        this.seniorNummer = seniorNummer;
    }

    public Senior(Integer seniorNummer, String voorNaam, String achterNaam, String postCode, Double geld, Double boeteAantal, ArrayList<Boek> boekenInBezit) {
        super(voorNaam, achterNaam, postCode, geld, boeteAantal, boekenInBezit,12.0);
        this.seniorNummer = seniorNummer;
    }

    public Integer getSeniorNummer() {
        return seniorNummer;
    }

    public void setSeniorNummer(Integer seniorNummer) {
        this.seniorNummer = seniorNummer;
    }
}
