package hu.petrik.bankiszolgatatasok;

public abstract class BankiSzolgaltatas {
    private Tulajdonos tulajdonos;

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }

    public BankiSzolgaltatas(Tulajdonos tulajdonos) {
        this.tulajdonos = tulajdonos;
    }
}
