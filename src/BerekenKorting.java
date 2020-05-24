public interface BerekenKorting {

    Double korting();

}

class StudentenKorting implements BerekenKorting{

    @Override
    public Double korting() {
        return 10.0;
    }
}

class SeniorenKorting implements BerekenKorting{

    @Override
    public Double korting() {
        return 12.0;
    }
}

class NormaalKorting implements BerekenKorting{

    @Override
    public Double korting() {
        return 0.0;
    }
}
