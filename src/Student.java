import java.util.ArrayList;

public class Student extends Klant{
    private Integer studentNummer;


    public Student(Integer studentNummer,Integer id, String voorNaam, String achterNaam, String postCode, Double geld) {
        super(id, voorNaam, achterNaam, postCode, geld,10.0);
        this.studentNummer = studentNummer;
    }

    public Student(Integer studentNummer,Integer id, String voorNaam, String achterNaam, String postCode, Double geld, Double boeteAantal, ArrayList<Boek> boekenInBezit) {
        super(id, voorNaam, achterNaam, postCode, geld, boeteAantal, boekenInBezit,10.0);
        this.studentNummer = studentNummer;
    }

    public Student(Integer studentNummer,String voorNaam, String achterNaam, String postCode, Double geld, Double boeteAantal, ArrayList<Boek> boekenInBezit) {
        super(voorNaam, achterNaam, postCode, geld, boeteAantal, boekenInBezit,10.0);
        this.studentNummer = studentNummer;
    }

    public Integer getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(Integer studentNummer) {
        this.studentNummer = studentNummer;
    }
}
