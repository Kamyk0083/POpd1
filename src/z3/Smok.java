package z3;

public class Smok extends Postac implements Walczaca {
    public Smok() {
        super(1000);
    }

    public void atakuj(Postac postac) {
        postac.odejmijPunktyZycia(100);
    }
}
