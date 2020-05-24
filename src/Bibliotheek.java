import java.time.LocalDate;
import java.util.ArrayList;

public class Bibliotheek {
    private Integer bibliotheekID;
    private ArrayList<GangPad> gangPaden;
    private ArrayList<Kassa> kassas = new ArrayList<>();
    private ArrayList<Klant> klantLijst = new ArrayList<>();
    private ArrayList<Boek> boekLijst = new ArrayList<>();

    private static Integer bibliotheekIDmaker = 0;

    public Bibliotheek() {
        this.kassas.add(new Kassa(0));
        this.gangPaden = new ArrayList<>();
        this.bibliotheekID = bibliotheekIDmaker();
        //Wordt toegevoegd aan Lijsten.bieblijst
        Lijsten.getBiebLijst().add(this);
    }

    public int bibliotheekIDmaker() {
        bibliotheekIDmaker++;
        return bibliotheekIDmaker;
    }

    public void voegKassaToe(Kassa kas) {
        kassas.add(kas);
    }

    public ArrayList<GangPad> getGangPaden() {
        return gangPaden;
    }

    public void setGangPaden(ArrayList<GangPad> gangPaden) {
        this.gangPaden = gangPaden;
    }

    public ArrayList<Kassa> getKassas() {
        return kassas;
    }

    public void setKassas(ArrayList<Kassa> kassas) {
        this.kassas = kassas;
    }

    public void sorteerGangPaden() {
        ArrayList<Boek> boekLijsten = boekLijst;
        //check per boek
        for (Boek el : boekLijsten) {
            //checkt per gangpad
            for (GangPad el1 : gangPaden) {
                if (checkCat(el1, el)) {
                    el1.getBoekenInGangPad().add(el);
                    System.out.println("Boek: " + el.getTitel() + " toegevoegd aan " + el1.getGangID());
                }
            }
        }
    }

    public boolean checkCat(GangPad el1, Boek el) {
        //checkt voor categorie hetzelfde is als boekCat, of het boek er niet in zit en het max niet geraakt is.

        //longcode voorkomen door ze op te slaan in variabelen
        String categorieGangPad = el1.getCategorie().toLowerCase();
        String categorieBoek = el.getCategorie().toLowerCase();
        boolean boekInGangPad = el1.getBoekenInGangPad().contains(el);
        boolean maxBoekenBereikt = el1.getAantalBoeken() + 1 <= el1.getMaxBoeken();

        return categorieGangPad.equals(categorieBoek)
                && !boekInGangPad
                && maxBoekenBereikt;
    }

    public String leenBoek(int klantID, int uniqueID) {
        Klant klant = klantLijst.get(klantID - 1);
        //checkt of de klant een boek mag lenen
        if (checkToegang(klant)) {
            ArrayList<Boek> boekLijstencopy = new ArrayList<>();
            //checkt voor welk boek de klant wilt lenen
            for (Boek el : boekLijst) {
                if (el.getUniqueID().equals(uniqueID)) {
                    klant.getBoekenInBezit().add(el);
                    el.setUitgeleendAan(klantID);
                    el.setUitgeleendDatum(LocalDate.now());
                } else {
                    //als geen boek overeenkomt voegt toe aan andere lijst
                    boekLijstencopy.add(el);
                }
            }
            setBoekLijst(boekLijstencopy);
            return "Boek geleend";
        } else {
            return "Te veel boeken in bezit";
        }
    }

    public void leverIn(int klantID, int uniqueID) {
        Klant klant = klantLijst.get(klantID - 1);

        for (Boek el : klant.getBoekenInBezit()) {
            if (el.getUniqueID().equals(uniqueID)) {
                klant.getBoekenInBezit().remove(el);
                boekLijst.add(el);
            }
        }
    }

    public boolean checkToegang(Klant klant) {
        return !(klant.getBoeteAantal() >= 10.0) && klant.getBoekenInBezit().size() <= 2;
    }

    public ArrayList<Klant> getKlantLijst() {
        return klantLijst;
    }

    public void setKlantLijst(ArrayList<Klant> klantLijst) {
        this.klantLijst = klantLijst;
    }

    public ArrayList<Boek> getBoekLijst() {
        return boekLijst;
    }

    public void setBoekLijst(ArrayList<Boek> boekLijst) {
        this.boekLijst = boekLijst;
    }

    public Integer getBibliotheekID() {
        return bibliotheekID;
    }

    public void setBibliotheekID(Integer bibliotheekID) {
        this.bibliotheekID = bibliotheekID;
    }

    public String getNaam() {
        return null;
    }

    public void setNaam(String naam) {
    }

    public String getPostCode() {
        return null;
    }

    public void setPostCode(String postCode) {
    }

    public String getStraatNaam() {

        return null;
    }

    public void setStraatNaam(String straatNaam) {
    }

    public Integer getHuisNummer() {
        return null;
    }

    public void setHuisNummer(Integer huisNummer) {
    }

    public String getStad() {
        return null;
    }

    public void setStad(String stad) {
    }
}
