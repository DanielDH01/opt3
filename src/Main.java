public class Main {
    public static void main(String[] args) {
        Bibliotheek deVliet = new Bibliotheek("de vliet","2728pa","vliet", 30,"Rijswijk");

        Lijsten.getBiebLijst().add(deVliet);

        deVliet.getGangPaden().add(new GangPad("actie",500));

        deVliet.getGangPaden().add(new GangPad("drama",200));

        Persoon klant1 = new Klant(deVliet.getBibliotheekID(),"Daniel", "den Heijer", "2728PA", 200.0);


        Lijsten.getBiebLijst().get(0).getBoekLijst().add(new Boek(deVliet.getBibliotheekID(),"appel", 300,"frankie","Actie"));
        Lijsten.getBiebLijst().get(0).getBoekLijst().add(new Boek(deVliet.getBibliotheekID(),"appel2", 300,"frankie2","Humor"));
        Lijsten.getBiebLijst().get(0).getBoekLijst().add(new Boek(deVliet.getBibliotheekID(),"appel3", 300,"frankie3","drama"));
        Lijsten.getBiebLijst().get(0).getBoekLijst().add(new Boek(deVliet.getBibliotheekID(),"appel", 300,"frankie","Actie"));

        deVliet.leenBoek(1, 1);

        deVliet.sorteerGangPaden();


        System.out.println(klant1.getBoekenInBezit().get(1).getUitgeleendDatum().toString());
        System.out.println(Lijsten.naarString());
    }
}
