package phoneBook;

class Osoba extends Wpis {

    String imie;
    String nazwisko;
    Adres adres;

    Osoba(String i, String n, Adres a) {
        imie = i;
        nazwisko = n;
        adres = a;
    }

    @Override
    String opis() {
        return (imie + " " + nazwisko + " " + adres);
    }

}
