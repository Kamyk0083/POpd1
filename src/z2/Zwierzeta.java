package z2;

abstract class Zwierze {
    private int wiek;
    private int ileNog;

    public Zwierze(int wiek, int ileNog) {
        this.wiek = wiek;
        this.ileNog = ileNog;
    }

    public int getWiek() {
        return wiek;
    }

    public int getIleNog() {
        return ileNog;
    }

    public abstract String dajGlos();
}

interface ImienneZwierze {
    String getImie();
}

class Pies extends Zwierze implements ImienneZwierze {
    private String imie;

    public Pies(int wiek, String imie) {
        super(wiek, 4);
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public String dajGlos() {
        return "Hau Hau";
    }
}

class Ryba extends Zwierze {
    public Ryba(int wiek) {
        super(wiek, 0);
    }

    public String dajGlos() {
        return "Bul bul";
    }
}
