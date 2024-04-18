package model;

public abstract class Persoana {
    private String nume;
    private String prenume;
    private String cnp;
    private String nrTelefon;
    private String adresa;

    public Persoana(String nume, String prenume, String cnp, String nrTelefon, String adresa){
        this.nume=nume;
        this.prenume=prenume;
        this.cnp=cnp;
        this.nrTelefon=nrTelefon;
        this.adresa=adresa;
    }
    //Getters
    public String getNume(){
        return nume;
    }
    public String getPrenume(){
        return prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getNumeComplet(){
        return nume + " " + prenume;
    }

    //Setters
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public abstract String getStatus();

    public String getInformatii(){
        return getNumeComplet()+ " "+cnp+" "+nrTelefon+" "+adresa;
    }
}
