package model;

public class Carte {
    private String nume;
    private String autor;
    //String pentru ca putem avea carti cu mai multi autori, sau cu autor necunoscut
    //plus data redundancy deoarece exista o lista de carti publicate in Autor
    private int anPublicatie;
    private int nrPagini;

    public Carte(String nume, String autor, int anPublicatie, int nrPagini) {
        this.nume = nume;
        this.autor = autor;
        this.anPublicatie = anPublicatie;
        this.nrPagini = nrPagini;
    }

    public String getNume() {
        return nume;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnPublicatie() {
        return anPublicatie;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnPublicatie(int anPublicatie) {
        this.anPublicatie = anPublicatie;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }
}
