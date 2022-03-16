package hu.petrik.bankproject;

import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista;
    public Bank() {

    }
    // Egy létező számlára pénzt helyez
    public void egyenlegFeltolt(String szamlaszam, long osszeg)
    {
        throw new UnsupportedOperationException();
    }

    // Új számlát nyit a megadott névvel, számlaszámmal
    public void ujSzamla(String nev, String szamlaszam)
    {
        Szamla sz = new Szamla(nev, szamlaszam);
        szamlaLista.add(sz);
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
        throw new UnsupportedOperationException();
    }

    private class Szamla {
        private String tulajdonos;
        private String szamlaszam;
        private int egyenleg;

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

        public int getEgyenleg() {
            return egyenleg;
        }

        public void setEgyenleg(int egyenleg) {
            this.egyenleg = egyenleg;
        }
    }
}
