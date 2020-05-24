import java.util.ArrayList;

public class Student extends Klant{
    private Integer studentNummer;


    public Student(Integer studentNummer,Integer id, String voorNaam, String achterNaam, String postCode, Double geld) {
        super(id, voorNaam, achterNaam, postCode, geld);
        this.studentNummer = studentNummer;
        korting = new StudentenKorting();
    }

    public Student(Integer studentNummer,Integer id, String voorNaam, String achterNaam, String postCode, Double geld, Double boeteAantal, ArrayList<Boek> boekenInBezit) {
        super(id, voorNaam, achterNaam, postCode, geld, boeteAantal, boekenInBezit);
        this.studentNummer = studentNummer;
        korting = new StudentenKorting();
    }

    public Student(Integer studentNummer,String voorNaam, String achterNaam, String postCode, Double geld, Double boeteAantal, ArrayList<Boek> boekenInBezit) {
        super(voorNaam, achterNaam, postCode, geld, boeteAantal, boekenInBezit);
        this.studentNummer = studentNummer;
        korting = new StudentenKorting();
    }

    public Integer getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(Integer studentNummer) {
        this.studentNummer = studentNummer;
    }
}
