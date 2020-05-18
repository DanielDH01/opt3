import java.util.ArrayList;

public class Lijsten {
    private Lijsten INSTANCE;
    private static ArrayList<Boek> boekenLijst;
    private static ArrayList<Klant> klantLijst;

    private Lijsten(){

    }

    public Lijsten getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new Lijsten();
        }
        return INSTANCE;
    }

    public static ArrayList<Boek> getBoekenLijst() {
        return boekenLijst;
    }

    public static void setBoekenLijst(ArrayList<Boek> boekenLijst) {
        Lijsten.boekenLijst = boekenLijst;
    }

    public static ArrayList<Klant> getKlantLijst() {
        return klantLijst;
    }

    public static void setKlantLijst(ArrayList<Klant> klantLijst) {
        Lijsten.klantLijst = klantLijst;
    }
}
