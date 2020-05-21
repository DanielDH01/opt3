import java.time.LocalDate;

public class Boek {
    private Integer uniqueID;
    private String titel;
    private Integer paginas;
    private String auteur;
    private String categorie;
    private LocalDate uitgeleendDatum;
    private int uitgeleendAan;
    private Bibliotheek bieb;


    private static Integer makeUniqueID = 0;

    public Boek(int id, String titel, Integer paginas, String auteur, String categorie) {
        this.titel = titel;
        this.paginas = paginas;
        this.auteur = auteur;
        this.categorie = categorie;
        this.uniqueID = makeUniqueID();
        bieb = Lijsten.getBiebLijst().get(id-1);
        bieb.getBoekLijst().add(this);
    }

    public Integer makeUniqueID() {
        makeUniqueID++;
        return makeUniqueID;
    }

    public Integer getUniqueID() {
        return this.uniqueID;
    }

    public void setUniqueID(Integer uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public LocalDate getUitgeleendDatum() {
        return uitgeleendDatum;
    }

    public void setUitgeleendDatum(LocalDate uitgeleendDatum) {
        this.uitgeleendDatum = uitgeleendDatum;
    }

    public int getUitgeleendAan() {
        return uitgeleendAan;
    }

    public void setUitgeleendAan(int uitgeleendAan) {
        this.uitgeleendAan = uitgeleendAan;
    }

    @Override
    public String toString() {
        return  "titel: '" + titel +
                "' paginas: '" + paginas +
                "' auteur: '" + auteur +
                "' categorie: '" + categorie +
                "' uitgeleendAan: '" + uitgeleendAan + "'";
    }
}
