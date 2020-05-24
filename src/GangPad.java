import java.util.ArrayList;

public class GangPad{
    private Integer gangID;
    private String categorie;
    private Integer maxBoeken;
    private ArrayList<Boek> boekenInGangPad;

    public static Integer gangIDmaker = 0;

    public GangPad(Bibliotheek bieb,String categorie, Integer maxBoeken) {
        this.maxBoeken = maxBoeken;
        this.categorie = categorie;
        this.gangID = gangIDmaker();
        boekenInGangPad = new ArrayList<>();
        bieb.getGangPaden().add(this);
    }

    public int gangIDmaker(){
        gangIDmaker++;
        return gangIDmaker;
    }

    public String voegBoekToe(Boek boekie){
        if(checkBoekToevoegen(boekie)) {
            boekenInGangPad.add(boekie);
            return "Boek: "+ boekie.getTitel() + " Toegevoegd";
        }else{
            return "Boek: " + boekie.getTitel() + " Kon niet toegevoegd worden. GangPad te klein\n" +
                    " of je categorie klopt niet";

        }
    }

    public boolean checkBoekToevoegen(Boek boekie){
        return getAantalBoeken() + 1 <= maxBoeken &&
                boekie.getCategorie().toLowerCase().equals(categorie.toLowerCase());
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public ArrayList<Boek> getBoekenInGangPad() {
        return boekenInGangPad;
    }

    public Integer getAantalBoeken() {
        return boekenInGangPad.size();
    }

    public Integer getMaxBoeken() {
        return maxBoeken;
    }

    public void setMaxBoeken(Integer maxBoeken) {
        this.maxBoeken = maxBoeken;
    }

    public Integer getGangID() {
        return gangID;
    }

    public void setGangID(Integer gangID) {
        this.gangID = gangID;
    }

    @Override
    public String toString() {
        return "GangPad{" +
                "gangID=" + gangID +
                ", aantalBoeken=" + getAantalBoeken() +
                ", categorie='" + categorie + '\'' +
                ", maxBoeken=" + maxBoeken +
                '}';
    }
}
