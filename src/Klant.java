import java.util.ArrayList;

public class Klant extends Persoon {
    private Integer uniqueID;
    private Double boeteAantal;

    private Integer makeUniqueID = 0;

    public Klant(String voorNaam, String achterNaam, String postCode, Double geld, Double boeteAantal) {
        super(voorNaam, achterNaam, postCode, geld);
        this.boeteAantal = boeteAantal;
        uniqueID = makeUniqueID();
        Lijsten.getKlantLijst().add(this);
    }

    public Klant(String voorNaam, String achterNaam, String postCode, Double geld, Double boeteAantal, ArrayList<Boek> boekenInBezit) {
        super(voorNaam, achterNaam, postCode, geld, boekenInBezit);
        this.boeteAantal = boeteAantal;
        Lijsten.getKlantLijst().add(this);
    }

    public Integer makeUniqueID() {
        makeUniqueID++;
        return makeUniqueID;
    }

    public Integer getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(Integer uniqueID) {
        this.uniqueID = uniqueID;
    }

    public Double getBoeteAantal() {
        return boeteAantal;
    }

    public void setBoeteAantal(Double boeteAantal) {
        this.boeteAantal = boeteAantal;
    }

    @Override
    public String toString() {
        return "KlantID: '" + uniqueID +
                "', Naam: '" + getVoorNaam() +
                " " + getAchterNaam() +
                "' BoeteBedrag: '"+ boeteAantal + "'";
    }
}
