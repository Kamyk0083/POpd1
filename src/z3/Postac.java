package z3;

public abstract class Postac {
    protected int punktyZycia;

    public Postac(int punktyZycia) {
        this.punktyZycia = punktyZycia;
    }

    public int getPunktyZycia() {
        return punktyZycia;
    }

    public void odejmijPunktyZycia(int ilosc) {
        this.punktyZycia -= ilosc;
    }

    public void dodajPunktyZycia(int ilosc) {
        this.punktyZycia += ilosc;
    }
}