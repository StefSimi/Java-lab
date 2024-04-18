package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {
    //Singleton class
    private static Biblioteca instance;
    public static Biblioteca getInstance(){
        if(instance==null){
            instance=new Biblioteca();
        }
        return instance;
    }
    private List<Autor> autori= new ArrayList<>();
    private List<Carte> carti= new ArrayList<>();;
    private List<Cititor>cititori= new ArrayList<>();;
    private List<Sectiune>sectiuni= new ArrayList<>();;

    public List<Sectiune> getSectiuni() {
        Collections.sort(sectiuni, new Comparator<Sectiune>() {
            @Override
            public int compare(Sectiune o1, Sectiune o2) {
                return o1.getNume().compareTo(o2.getNume());
            }
        });
        return sectiuni;

    }


    public void setSectiuni(List<Sectiune> sectiuni) {
        this.sectiuni = sectiuni;
    }


    public List<Autor> getAutori() {
        return autori;
    }

    public void setAutori(List<Autor> autori) {
        this.autori = autori;
    }

    public List<Carte> getCarti() {
        return carti;
    }

    public void setCarti(List<Carte> carti) {
        this.carti = carti;
    }

    public List<Cititor> getCititori() {
        return cititori;
    }

    public void setCititori(List<Cititor> cititori) {
        this.cititori = cititori;
    }


}
