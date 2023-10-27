package z3;

public class Druid extends Postac implements Walczaca, Leczaca {
    private int mana;

    public Druid(int punktyZycia, int mana) {
        super(punktyZycia);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void atakuj(Postac postac) {
        postac.odejmijPunktyZycia(1);
        this.mana -= 1;
    }

    public void wylecz(Postac postac) {
        postac.dodajPunktyZycia(200);
        this.mana -= 20;
    }
}
