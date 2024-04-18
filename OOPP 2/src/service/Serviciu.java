package service;

import model.*;

public class Serviciu {
    Biblioteca biblioteca=Biblioteca.getInstance();
    public void adaugaCarte(Carte carte){
        biblioteca.getCarti().add(carte);
    }
    public void eliminaCarte(Carte carte){
        biblioteca.getCarti().remove(carte);
    }
    public void adaugaSectiune(Sectiune sectiune){
        biblioteca.getSectiuni().add(sectiune);
    }
    public void eliminaSectiune(Sectiune sectiune){
        biblioteca.getSectiuni().remove(sectiune);
    }
    public void adaugaAutor(Autor autor){
        biblioteca.getAutori().add(autor);
    }
    public void eliminaAutor(Autor autor){
        biblioteca.getAutori().remove(autor);
    }
    public void adaugaCititor(Cititor cititor){
        biblioteca.getCititori().add(cititor);
    }
    public void eliminaCititor(Cititor cititor){
        biblioteca.getCititori().remove(cititor);
    }
    public void adaugaCarteSectiune(Carte carte, Sectiune sectiune){
        sectiune.adaugaCarte(carte);
    }
    public void eliminaCarteSectiune(Carte carte, Sectiune sectiune){
        sectiune.eliminaCarte(carte);
    }

}
