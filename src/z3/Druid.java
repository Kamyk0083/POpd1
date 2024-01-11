package z3;

public class Druid implements Postac, Leczaca, Walczaca {
    private int punktyZycia;
    private int mana;
    private final int silaAtaku = 1;

    public Druid(int punktyZycia, int mana) {
        this.punktyZycia = punktyZycia;
        this.mana = mana;
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
    public void wylecz(Postac postac) {
        if (mana >= 10) {
            postac.zmienPunktyZycia(200);
            zmienMana(-10);
        }
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public void zmienMana(int zmiana) {
        this.mana += zmiana;
    }

    @Override
    public void atakuj(Postac postac) {
        postac.zmienPunktyZycia(-silaAtaku);
    }

    @Override
    public int getSila() {
        return silaAtaku;
    }
}
