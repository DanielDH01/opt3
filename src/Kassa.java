public class Kassa {
    private Integer kassaID;
    private Double geld;


    private static Integer kassaIDmaker = 0;

    public Kassa(int geld) {
        this.geld =(double) geld;
        this.kassaID = kassaIDmaker();
    }

    public int kassaIDmaker() {
        kassaIDmaker++;
        return kassaIDmaker;
    }

    public Integer getKassaID() {
        return kassaID;
    }

    public void setKassaID(Integer kassaID) {
        this.kassaID = kassaID;
    }

    public Double getGeld() {
        return geld;
    }

    public void setGeld(Double geld) {
        this.geld = geld;
    }
}
