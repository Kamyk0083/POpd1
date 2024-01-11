package z3;

public class Smok implements Postac, Walczaca {
    private int punktyZycia = 1000;

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
        postac.zmienPunktyZycia(-100);
    }

    @Override
    public int getSila() {
        return 100;
    }
}
