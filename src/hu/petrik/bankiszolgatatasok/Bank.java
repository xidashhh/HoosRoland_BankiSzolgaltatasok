package hu.petrik.bankiszolgatatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista;
    public Bank(){
        this.szamlaLista = new ArrayList<>();
    }



    public Szamla szamlaNyitas(Tulajdonos tulajdonos, int hitelKeret){
        if (hitelKeret > 0){
            HitelSzamla hitelszamla = new HitelSzamla(tulajdonos, hitelKeret);
            szamlaLista.add(hitelszamla);
            return new HitelSzamla(tulajdonos, hitelKeret);
        }
        else if(hitelKeret == 0){
            MegtakaritasiSzamla megtakaritasiszamla = new MegtakaritasiSzamla(tulajdonos);
            szamlaLista.add(megtakaritasiszamla);
            return new MegtakaritasiSzamla(tulajdonos);
        }
        else {
            throw new IllegalArgumentException("A hitelkeret nem lehet negatív!");
        }
    }

    public int getOsszEgyenleg(Tulajdonos tulajdonos){
        int ossz = 0;
        for (Szamla aktualis : szamlaLista) {
            if (aktualis.getTulajdonos() == tulajdonos){
                ossz += aktualis.getAktualisEgyenleg();
            }
        }
        return ossz;
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos){
        Szamla legnagyobb = null;
        for (Szamla aktualis : szamlaLista) {
            if (legnagyobb == null && aktualis.getTulajdonos() == tulajdonos){
                legnagyobb = aktualis;
            }
            else if (aktualis.getTulajdonos() == tulajdonos){
                if (aktualis.getAktualisEgyenleg() > legnagyobb.aktualisEgyenleg){
                    legnagyobb = aktualis;
                }
            }
        }
        return legnagyobb;
    }

    public long getOsszHitelkeret(){

        long ossz = 0;
        for (Szamla aktualis : szamlaLista) {
            if (szamlaLista instanceof HitelSzamla){
                ossz += ((HitelSzamla) aktualis).getHitelKeret();
            }
        }
        return ossz;
    }
}
