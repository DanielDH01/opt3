import javafx.scene.Parent;

import java.util.ArrayList;

public class Klant extends Persoon {
    private Integer uniqueID;
    private Double boeteAantal;

    private Integer makeUniqueID = 0;

    public Klant(String voorNaam, String achterNaam, String postCode, Double geld, Double boeteAantal) {
        super(voorNaam, achterNaam, postCode, geld);
        this.boeteAantal = boeteAantal;
        uniqueID = makeUniqueID();
    }

    public Klant(String voorNaam, String achterNaam, String postCode, Double geld, Double boeteAantal, ArrayList<Boek> boekenInBezit) {
        super(voorNaam, achterNaam, postCode, geld, boekenInBezit);
        this.boeteAantal = boeteAantal;
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

}
