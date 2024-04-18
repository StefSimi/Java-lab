package model;

import java.util.List;

public class Autor extends Persoana{


    private List<Carte> cartiPublicate;
    public Autor(String nume, String prenume, String cnp, String nrTelefon, String adresa, List<Carte> cartiPublicate) {
        super(nume, prenume, cnp, nrTelefon, adresa);
        this.cartiPublicate=cartiPublicate;
    }
    public List<Carte> getCartiPublicate(){
        return cartiPublicate;
    }
    public void setCartiPublicate(List<Carte> cartiPublicate){
        this.cartiPublicate=cartiPublicate;
    }
    public void adaugaCartePublicata(Carte carte){
        cartiPublicate.add(carte);
    }
    public void eliminaCartePublicata(Carte carte){
        cartiPublicate.remove(carte);
    }


    @Override
    public String getStatus() {
        return "Autor";
    }

    @Override
    public String getInformatii() {
        StringBuilder infoBuilder = new StringBuilder();
        for (Carte carte : cartiPublicate) {
            infoBuilder.append(carte.getNume()).append(", ");
        }
        return super.getInformatii()+" "+cartiPublicate;
    }
}
