package z2;

public class Ryba implements Zwierze {
    private int wiek;

    public Ryba(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public int getIleNog() {
        return 0;
    }

    @Override
    public int getWiek() {
        return this.wiek;
    }

    @Override
    public String dajGlos() {
        return "Bul bul";
    }
}