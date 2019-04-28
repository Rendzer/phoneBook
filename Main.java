package phoneBook;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main mainApp = new Main();

        Numer numer1 = new Numer("42", "232111897");
        Numer numer2 = new Numer("32", "732111897");
        Numer numer3 = new Numer("32", "432111897");
        Numer numer4 = new Numer("32", "132111577");
        Numer numer5 = new Numer("52", "232111897");
        Numer numer6 = new Numer("32", "123224577");
        Numer numer7 = new Numer("52", "896725143");
        Numer numer8 = new Numer("52", "896725143");

        Adres adres1 = new Adres("Piotrkowska", 12, 135, "Łódź", "90-123", numer1);
        Adres adres2 = new Adres("Politechniki", 2, 45, "Łódź", "90-156", numer2);
        Adres adres3 = new Adres("Włókniarzy", 76, 1, "Łódź", "90-323", numer3);
        Adres adres4 = new Adres("Firmowa", 2, 53, "Warszawa", "90-123", numer4);
        Adres adres5 = new Adres("Zakładowa", 19, 5, "Kraków", "90-106", numer5);
        Adres adres6 = new Adres("Piotrkowska", 12, 135, "Łódź", "90-123", numer6);
        Adres adres7 = new Adres("Piotrkowska", 12, 135, "Łódź", "90-123", numer7);
        Adres adres8 = new Adres("Piotrkowska", 12, 135, "Łódź", "90-123", numer8);

        Osoba osoba1 = new Osoba("Ala", "Nowak", adres1);
        Osoba osoba2 = new Osoba("Jan", "Kowalski", adres2);
        Osoba osoba3 = new Osoba("Kasia", "Nowak", adres3);
        Firma firma1 = new Firma("Company", adres4);
        Firma firma2 = new Firma("Enterprise", adres5);
        Osoba osoba4 = new Osoba("Ola", "Nowakowska", adres6);
        Osoba osoba5 = new Osoba("Łukasz", "Nowak", adres7);
        Osoba osoba6 = new Osoba("Tadeusz", "Kowalczyk", adres8);

        List<Wpis> lista = new ArrayList<>();
        lista.add(osoba1);
        lista.add(osoba2);
        lista.add(osoba3);
        lista.add(firma1);
        lista.add(firma2);
        lista.add(osoba4);
        lista.add(osoba5);
        lista.add(osoba6);

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put(numer1.phoneNumber(), osoba1.opis());
        treeMap.put(numer2.phoneNumber(), osoba2.opis());
        treeMap.put(numer3.phoneNumber(), osoba3.opis());
        treeMap.put(numer4.phoneNumber(), firma1.opis());
        treeMap.put(numer5.phoneNumber(), firma2.opis());
        treeMap.put(numer6.phoneNumber(), osoba4.opis());
        treeMap.put(numer7.phoneNumber(), osoba5.opis());
        treeMap.put(numer8.phoneNumber(), osoba6.opis());

        mainApp.wypiszKsiazkeTelefoniczna(treeMap);

    }

    public void wypiszKsiazkeTelefoniczna(TreeMap<String,String> treeMap) {
        Set set = treeMap.entrySet();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Map.Entry<String,String> entry = (Map.Entry) iter.next();
            String value = entry.getValue();
            System.out.println(value);
        }
    }
}
