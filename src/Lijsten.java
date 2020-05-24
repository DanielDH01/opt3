import java.util.ArrayList;

public class Lijsten {
    private Lijsten INSTANCE;
    private static ArrayList<Bibliotheek> biebLijst = new ArrayList<>();

    private Lijsten() {
    }

    public Lijsten getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Lijsten();
        }
        return INSTANCE;

    }

    public static ArrayList<Bibliotheek> getBiebLijst() {
        return biebLijst;
    }

    public static void setBiebLijst(ArrayList<Bibliotheek> biebLijst) {
        Lijsten.biebLijst = biebLijst;
    }

    public static String naarString() {
        if(biebLijst != null) {
            String string = "BiebLijst: ";
            for (Bibliotheek el : biebLijst) {
                if(el.getNaam() != null) {
                    string += "\n" + " - " + el.getNaam();
                }
            }
//        for (Boek el : boekenLijst) {
//            string += "\n" + " - " + el.toString();
//        }
//        string += "\nKlantenLijst: ";
//        for (Klant el : klantLijst) {
//            string += "\n" + " - " + el.toString();
//        }
            return string;
        }
        return "Geen bibliotheken gevonden";
    }
}
