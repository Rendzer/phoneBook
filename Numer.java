package phoneBook;

class Numer implements Comparable<Numer> {

    String code;
    String number;

    Numer(String code, String number) {
        this.code = code;
        this.number = number;
    }

    String phoneNumber() {
        return " " + code + "-" + number;
    }

    public int compareTo(Numer comparedNumber) {
        return (code + number).compareTo(comparedNumber.code + comparedNumber.number);
    }


}

