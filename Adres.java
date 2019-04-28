package phoneBook;

class Adres {

    String ulica;
    int numerUlicy;
    int numerLokalu;
    String miasto;
    String kodPocztowy;
    Numer numer;

    Adres(String ulica, int numerUlicy, int numerLokalu, String miasto, String kodPocztowy, Numer numer) {
        this.ulica = ulica;
        this.numerUlicy = numerUlicy;
        this.numerLokalu = numerLokalu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.numer = numer;
    }

    public String toString() {
        return ("ul. " + ulica + " " + numerUlicy + " m. " + numerLokalu + " " + miasto + " " + kodPocztowy + " tel.:" + numer.phoneNumber());
    }

}
