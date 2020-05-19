public class Kassa {
    private Integer kassaID;
    private Double geld;


    private static Integer kassaIDmaker = 0;

    public Kassa(Double geld) {
        this.geld = geld;
        this.kassaID = kassaIDmaker();
    }

    public Kassa(int geld) {
        this.geld =(double) geld;
        this.kassaID = kassaIDmaker();
    }

    public int kassaIDmaker() {
        kassaIDmaker++;
        return kassaIDmaker;
    }
}
