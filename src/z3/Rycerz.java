package z3;

public class Rycerz extends Postac implements Walczaca {
    private int sila;

    public Rycerz(int punktyZycia, int sila) {
        super(punktyZycia);
        this.sila = sila;
    }

    public int getSila() {
        return sila;
    }

    public void atakuj(Postac postac) {
        postac.odejmijPunktyZycia(sila);
    }

}
