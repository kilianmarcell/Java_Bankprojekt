package hu.petrik.bankproject;

import java.util.HashMap;
import java.util.List;

public class Bank {
    private HashMap<String, Szamla> hashMap;
    public Bank() {
        hashMap = new HashMap<>();
    }
    // Egy létező számlára pénzt helyez
    public void egyenlegFeltolt(String szamlaszam, long osszeg)
    {
        Szamla sz = hashMap.get(szamlaszam);
        sz.setEgyenleg(sz.getEgyenleg() + osszeg);
    }

    // Új számlát nyit a megadott névvel, számlaszámmal
    public void ujSzamla(String nev, String szamlaszam)
    {
        Szamla sz = new Szamla(nev, szamlaszam);
        hashMap.put(szamlaszam, sz);
    }

    // Két számla között utal.
    // Ha nincs elég pénz a forrás számlán, akkor
    public boolean utal(String honnan, String hova, long osszeg)
    {
        throw new UnsupportedOperationException();
    }

    // Lekérdezi az adott számlán lévő pénzösszeget
    public long egyenleg(String szamlaszam)
    {
        Szamla sz = hashMap.get(szamlaszam);
        return sz.getEgyenleg();
    }

    private class Szamla {
        private String tulajdonos;
        private String szamlaszam;
        private long egyenleg;

        public Szamla(String tulajdonos, String szamlaszam) {
            this.tulajdonos = tulajdonos;
            this.szamlaszam = szamlaszam;
            this.egyenleg = 0;
        }

        public String getTulajdonos() {
            return tulajdonos;
        }

        public void setTulajdonos(String tulajdonos) {
            this.tulajdonos = tulajdonos;
        }

        public String getSzamlaszam() {
            return szamlaszam;
        }

        public long getEgyenleg() {
            return egyenleg;
        }

        public void setEgyenleg(long egyenleg) {
            this.egyenleg = egyenleg;
        }
    }
}
