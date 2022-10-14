package hu.petrik.bankiszolgatatasok;

public class HitelSzamla extends Szamla{
    private int hitelKeret;

    public int getHitelKeret() {
        return hitelKeret;
    }

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    @Override
    public boolean kivesz(int osszeg){
        if (hitelKeret+aktualisEgyenleg<osszeg){
            return false;
        }
        else {
            aktualisEgyenleg-=osszeg;
            return true;
        }
    }
}
