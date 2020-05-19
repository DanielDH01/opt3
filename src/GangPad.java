public class GangPad {
    private Integer gangID;
    private Integer aantalBoeken;
    private Integer categorie;
    private Integer maxBoeken;

    public static Integer gangIDmaker = 0;

    public GangPad(Integer aantalBoeken, Integer categorie) {
        this.aantalBoeken = aantalBoeken;
        this.categorie = categorie;
        this.gangID = gangIDmaker();
    }

    public int gangIDmaker(){
        gangIDmaker++;
        return gangIDmaker;
    }

}
