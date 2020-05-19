import java.util.ArrayList;

public class Bibliotheek {
    private Integer biblioTheekID;
    private String naam;
    private String postCode;
    private String straatNaam;
    private Integer huisNummer;
    private String stad;
    private ArrayList<GangPad> gangPaden;

    private static Integer biblioTheekIDmaker = 0;

    public Bibliotheek(String naam, String postCode, String straatNaam, Integer huisNummer, String stad) {
        this.naam = naam;
        this.postCode = postCode;
        this.straatNaam = straatNaam;
        this.huisNummer = huisNummer;
        this.stad = stad;
        this.biblioTheekID = biblioTheekIDmaker();
    }

    public int biblioTheekIDmaker(){
        biblioTheekID++;
        return biblioTheekID;
    }

    public ArrayList<GangPad> getGangPaden() {
        return gangPaden;
    }

    public void setGangPaden(ArrayList<GangPad> gangPaden) {
        this.gangPaden = gangPaden;
    }
}
