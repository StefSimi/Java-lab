package model;

import java.util.List;

public class Sectiune {

    private String nume;
    private List<Carte> carti;

    public Sectiune(String nume, List<Carte> carti) {
        this.nume = nume;
        this.carti = carti;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Carte> getCarti() {
        return carti;
    }

    public void setCarti(List<Carte> carti) {
        this.carti = carti;
    }

    public void adaugaCarte(Carte carte){
        carti.add(carte);
    }
    public void eliminaCarte(Carte carte){
        carti.remove(carte);
    }
}
