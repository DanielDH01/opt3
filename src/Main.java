import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bibliotheek deVliet = new Bibliotheek("de vliet","2728pa","aan vliet", 30,"Rijswijk");

        deVliet.getGangPaden().add(new GangPad("actie",500));

        deVliet.getGangPaden().add(new GangPad("drama",200));

        Persoon klant1 = new Klant("Daniel", "den Heijer", "2728PA", 200.0, 200.0);

        Lijsten.getBoekenLijst().add(new Boek("appel", 300,"frankie","Actie"));
        Lijsten.getBoekenLijst().add(new Boek("appel2", 300,"frankie2","Humor"));
        Lijsten.getBoekenLijst().add(new Boek("appel3", 300,"frankie3","drama"));
        Lijsten.getBoekenLijst().add(new Boek("appel", 300,"frankie","Actie"));

        deVliet.leenBoek(1, "appel");

        deVliet.sorteerGangPaden();


        System.out.println(klant1.getBoekenInBezit().get(0).getUitgeleendDatum().toString());
        System.out.println(Lijsten.naarString());
    }
}
