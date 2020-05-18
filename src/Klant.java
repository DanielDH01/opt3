import java.util.ArrayList;

public class Klant {
    private Integer uniqueID;
    private String voorNaam;
    private String achterNaam;
    private Double boeteAantal;
    private ArrayList<Boek> boekenInBezit;

    private Integer makeUniqueID = 0;

    public Klant(String voorNaam, String achterNaam, Double boeteAantal) {
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.boeteAantal = boeteAantal;
        boekenInBezit = new ArrayList<>();
        uniqueID = makeUniqueID();
    }

    public Integer makeUniqueID(){
        makeUniqueID++;
        return makeUniqueID;
    }

    public Integer getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(Integer uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getVoorNaam() {
        return voorNaam;
    }

    public void setVoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public void setAchterNaam(String achterNaam) {
        this.achterNaam = achterNaam;
    }

    public Double getBoeteAantal() {
        return boeteAantal;
    }

    public void setBoeteAantal(Double boeteAantal) {
        this.boeteAantal = boeteAantal;
    }

    public ArrayList<Boek> getBoekenInBezit() {
        return boekenInBezit;
    }

    public void setBoekenInBezit(ArrayList<Boek> boekenInBezit) {
        this.boekenInBezit = boekenInBezit;
    }
}
