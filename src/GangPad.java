import java.util.ArrayList;

public class GangPad{
    private Integer gangID;
    private Integer aantalBoeken;
    private String categorie;
    private Integer maxBoeken;
    private ArrayList<Boek> boekenInGangPad;

    public static Integer gangIDmaker = 0;

    public GangPad(String categorie, Integer maxBoeken) {
        this.maxBoeken = maxBoeken;
        this.aantalBoeken = 0;
        this.categorie = categorie;
        this.gangID = gangIDmaker();
        boekenInGangPad = new ArrayList<>();
    }

    public int gangIDmaker(){
        gangIDmaker++;
        return gangIDmaker;
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
        return aantalBoeken;
    }

    public void setAantalBoeken(Integer aantalBoeken) {
        this.aantalBoeken = aantalBoeken;
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
                ", aantalBoeken=" + aantalBoeken +
                ", categorie='" + categorie + '\'' +
                ", maxBoeken=" + maxBoeken +
                '}';
    }
}
