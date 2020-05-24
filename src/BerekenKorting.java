public interface BerekenKorting {
    //hiermee voorkom ik duplicate code
    Double korting();

    Integer maxBoekenLeen();

}

class StudentenKorting implements BerekenKorting{

    @Override
    public Double korting() {
        return 10.0;
    }

    @Override
    public Integer maxBoekenLeen() {
        return 10;
    }
}

class SeniorenKorting implements BerekenKorting{

    @Override
    public Double korting() {
        return 12.0;
    }

    @Override
    public Integer maxBoekenLeen() {
        return 6;
    }
}

class NormaalKorting implements BerekenKorting{

    @Override
    public Double korting() {
        return 0.0;
    }

    @Override
    public Integer maxBoekenLeen() {
        return 2;
    }
}
