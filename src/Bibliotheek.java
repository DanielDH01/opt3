import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Bibliotheek {
    private Integer bibliotheekID;
    private String naam;
    private String postCode;
    private String straatNaam;
    private Integer huisNummer;
    private String stad;
    private ArrayList<GangPad> gangPaden;
    private ArrayList<Kassa> kassas = new ArrayList<>();

    private static Integer bibliotheekIDmaker = 0;

    public Bibliotheek(String naam, String postCode, String straatNaam, Integer huisNummer, String stad) {
        this.kassas.add(new Kassa(0));
        this.naam = naam;
        this.postCode = postCode;
        this.straatNaam = straatNaam;
        this.huisNummer = huisNummer;
        this.stad = stad;
        this.gangPaden = new ArrayList<GangPad>();
        this.bibliotheekID = bibliotheekIDmaker();
    }

    public int bibliotheekIDmaker() {
        bibliotheekIDmaker++;
        return bibliotheekIDmaker;
    }

    public ArrayList<GangPad> getGangPaden() {
        return gangPaden;
    }

    public void setGangPaden(ArrayList<GangPad> gangPaden) {
        this.gangPaden = gangPaden;
    }

    public void sorteerGangPaden() {
        ArrayList<Boek> boekLijsten = Lijsten.getBoekenLijst();
        for (Boek el : boekLijsten) {
            for (GangPad el1 : gangPaden) {
                if (el.getCategorie().toLowerCase().equals(el1.getCategorie()) && !el1.getBoekenInGangPad().contains(el) && el1.getAantalBoeken() + 1 <= el1.getMaxBoeken()) {
                    el1.getBoekenInGangPad().add(el);
                    System.out.println("Boek: " + el.getTitel() + " toegevoegd aan " + el1.getGangID());
                }
            }
        }
    }

    public ArrayList<Kassa> getKassas() {
        return kassas;
    }

    public void setKassas(ArrayList<Kassa> kassas) {
        this.kassas = kassas;
    }

    public void leenBoek(int klantID, String titelBoek){
        ArrayList<Boek> boekLijstencopy = new ArrayList<>();
        for(Boek el : Lijsten.getBoekenLijst()){
            if(el.getTitel().toLowerCase().equals(titelBoek.toLowerCase())){
                Lijsten.getKlantLijst().get(klantID-1).getBoekenInBezit().add(el);
                el.setUitgeleendAan(klantID);
                el.setUitgeleendDatum(LocalDate.now());
            }else{
                boekLijstencopy.add(el);
            }
        }
        Lijsten.setBoekenLijst(boekLijstencopy);
    }
}
