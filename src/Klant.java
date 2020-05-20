import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Klant extends Persoon {
    private Integer uniqueID;
    private Double boeteAantal;
    private Bibliotheek bieb;

    private static Integer makeUniqueID = 0;

    public Klant(Integer id, String voorNaam, String achterNaam, String postCode, Double geld) {
        super(voorNaam, achterNaam, postCode, geld);
        this.boeteAantal = 0.0;
        uniqueID = makeUniqueID();
        bieb = Lijsten.getBiebLijst().get(id-1);
        bieb.getKlantLijst().add(this);
    }

    public Klant(int id,String voorNaam, String achterNaam, String postCode, Double geld, Double boeteAantal, ArrayList<Boek> boekenInBezit) {
        super(voorNaam, achterNaam, postCode, geld, boekenInBezit);
        this.boeteAantal = boeteAantal;
        bieb = Lijsten.getBiebLijst().get(id-1);
        bieb.getKlantLijst().add(this);
    }

    public Integer makeUniqueID() {
        makeUniqueID++;
        return makeUniqueID;
    }

    public String betaalBoete(){
        if(boeteAantal > 0){
            if(getGeld() >= boeteAantal){
                setGeld(getGeld()-boeteAantal);
                boeteAantal = 0.0;
                System.out.println("Je boete is betaald.");
                return "Je boete is betaald";
            }else{
                System.out.println("Je hebt niet genoeg geld op je rekening");
                return "Je hebt niet genoeg geld op je rekening";
            }
        }else{
            System.out.println("Boete aantal is al 0");
            return "Boete aantal is al 0";
        }
    }

    public void berekenBoete(){
        Double boete = 0.0;
        LocalDate now = LocalDate.now();
        for(Boek el: getBoekenInBezit()){
            int duration = (int) ChronoUnit.DAYS.between(el.getUitgeleendDatum(), now);
            System.out.println("Boek: " + el.getTitel() + " is " + duration + " dagen uitgeleend.");
            if(duration > 12) {
                boete  += berekenBoeteBedrag(duration);
            }
        }
        boeteAantal = boete;
    }

    public Double berekenBoeteBedrag(int duration){
        if(duration > 12) {
            return duration * 1.40;
        }else{
            return 0.0;
        }
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
