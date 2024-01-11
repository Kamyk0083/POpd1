package z3;

public class Rycerz implements Postac, Walczaca {
    private int punktyZycia;
    private int sila;

    public Rycerz(int punktyZycia, int sila) {
        this.punktyZycia = punktyZycia;
        this.sila = sila;
    }

    @Override
    public int getPunktyZycia() {
        return punktyZycia;
    }

    @Override
    public void zmienPunktyZycia(int zmiana) {
        this.punktyZycia += zmiana;
    }

    @Override
    public void atakuj(Postac postac) {
        postac.zmienPunktyZycia(-sila);
    }

    @Override
    public int getSila() {
        return sila;
    }
}
