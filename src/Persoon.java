import java.util.ArrayList;

public class Persoon {
    private Integer uniqueIDpersoon;
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


    public String werk(Double uurGewerkt) {
        //Design smell voorkomen: duplicate code
        //eerst gekeken of uurgewerkt > 0 zodat ik niet 2x hetzelfde hoef te checken
        if (uurGewerkt <= 0) {
            return "U heeft niet meer dan 0 uur gewerkt dus geen loon ontvangen";
        } else if (uurLoon != null) {
            geld += uurGewerkt * uurLoon;
            return "Uw geldBedrag = " + String.format("%.2f", geld);
        } else {
            return "U heeft geen uurloon";
        }
    }

    public Integer getUniqueIDpersoon() {
        return uniqueIDpersoon;
    }

    public void setUniqueIDpersoon(Integer uniqueIDpersoon) {
        this.uniqueIDpersoon = uniqueIDpersoon;
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
