package hu.petrik.bankiszolgatatasok;

public abstract class Szamla extends BankiSzolgaltatas{

    protected int aktualisEgyenleg;

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public Szamla tulajdonos;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }


    public void befizet(int osszeg){
        aktualisEgyenleg+=osszeg;
    }

    //Hiányzik: 4. feladat e.)

    public boolean kivesz(int osszeg){
        if (aktualisEgyenleg < 0){
            return false;
        }
        else{
            aktualisEgyenleg -= osszeg;
            return true;
        }
    }

    public Kartya ujKartya(String kartyaszam){
        return new Kartya(this.getTulajdonos(), this, kartyaszam);
    }
}
