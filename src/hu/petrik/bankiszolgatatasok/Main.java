package hu.petrik.bankiszolgatatasok;

public class Main {
    public static void main(String[] args) {
        Tulajdonos tulaj1 = new Tulajdonos("Techno Kolos");
        Tulajdonos tulaj2 = new Tulajdonos("Present Simple");
        Tulajdonos tulaj3 = new Tulajdonos("Heu Réka");

        Bank bank1 = new Bank();
        bank1.szamlaNyitas(tulaj1,5624).befizet(3421);
        bank1.szamlaNyitas(tulaj2, 2311).befizet(3321);
        bank1.szamlaNyitas(tulaj3, 0);

        System.out.println(bank1.getOsszHitelkeret());
        System.out.println(bank1.getOsszEgyenleg(tulaj1));
        System.out.println(bank1.getLegnagyobbEgyenleguSzamla(tulaj2).getAktualisEgyenleg());
    }
}
