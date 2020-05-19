import java.util.ArrayList;

public class Persoon{
    private String voorNaam;
    private String achterNaam;
    private String postCode;

    private Double uurLoon;
    private Double geld;

    private ArrayList<Boek> boekenInBezit;

    public Persoon(String voorNaam, String achterNaam, String postCode, Double geld, ArrayList<Boek> boekenInBezit) {
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.geld = geld;
        this.boekenInBezit = boekenInBezit;
        this.postCode = postCode;
    }

    public Persoon(String voorNaam, String achterNaam, String postCode, Double geld) {
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.geld = geld;
        this.boekenInBezit = new ArrayList<>();
        this.postCode = postCode;
    }

    public void werk(Double uurGewerkt) {
        if (uurLoon != null) {
            geld += uurGewerkt * uurLoon;
            System.out.println("Uw geldBedrag = " + String.format("%.2f", geld));
        } else {
            System.out.println("U heeft geen uurloon");
        }
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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Double getUurLoon() {
        return uurLoon;
    }

    public void setUurLoon(Double uurLoon) {
        this.uurLoon = uurLoon;
    }

    public Double getGeld() {
        return geld;
    }

    public void setGeld(Double geld) {
        this.geld = geld;
    }

    public ArrayList<Boek> getBoekenInBezit() {
        return boekenInBezit;
    }

    public void setBoekenInBezit(ArrayList<Boek> boekenInBezit) {
        this.boekenInBezit = boekenInBezit;
    }
}
