package phoneBook;

class Firma extends Wpis {

    String nazwa;
    Adres adres;

    Firma(String n, Adres a) {
        nazwa = n;
        adres = a;
    }

    @Override
    String opis() {
        return (nazwa + " " + adres);
    }

}
