package hu.petrik.bankiszolgatatasok;

public abstract class HitelSzamla extends Szamla{
    private int hitelKeret;

    public int getHitelKeret() {
        return hitelKeret;
    }

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }
}
