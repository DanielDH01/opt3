public class AdresGegevens extends Bibliotheek{
    //long parameter code smell gefixed
    private String naam;
    private String postCode;
    private String straatNaam;
    private Integer huisNummer;
    private String stad;

    public AdresGegevens(String naam, String postCode, String straatNaam, Integer huisNummer, String stad) {
        super();
        this.naam = naam;
        this.postCode = postCode;
        this.straatNaam = straatNaam;
        this.huisNummer = huisNummer;
        this.stad = stad;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStraatNaam() {
        return straatNaam;
    }

    public void setStraatNaam(String straatNaam) {
        this.straatNaam = straatNaam;
    }

    public Integer getHuisNummer() {
        return huisNummer;
    }

    public void setHuisNummer(Integer huisNummer) {
        this.huisNummer = huisNummer;
    }

    public String getStad() {
        return stad;
    }

    public void setStad(String stad) {
        this.stad = stad;
    }
}
