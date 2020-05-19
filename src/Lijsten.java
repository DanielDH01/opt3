import java.util.ArrayList;

public class Lijsten {
    private Lijsten INSTANCE;
    private static ArrayList<Boek> boekenLijst = new ArrayList<>();
    private static ArrayList<Klant> klantLijst = new ArrayList<>();

    private Lijsten() {
    }

    public Lijsten getINSTANCE() {
        if (INSTANCE == null) {
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

    public static String naarString() {
        String string = "BoekenLijst: ";
        for (Boek el : boekenLijst) {
            string += "\n" + " - " + el.toString();
        }
        string += "\nKlantenLijst: ";
        for (Klant el : klantLijst) {
            string += "\n" + " - " + el.toString();
        }
        return string;
    }
}
