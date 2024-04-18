package model;

import java.util.List;

public class Cititor extends Persoana{

    private String idNumber;
    private String dataInregistrare;

    private List<Carte> cartiCurentImprumutate;

    public Cititor(String nume, String prenume, String cnp, String nrTelefon, String adresa,
                   String idNumber, String dataInregistrare, List<Carte> cartiCurentImprumutate) {
        super(nume, prenume, cnp, nrTelefon, adresa);
        this.idNumber=idNumber;
        this.dataInregistrare=dataInregistrare;
        this.cartiCurentImprumutate=cartiCurentImprumutate;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getDataInregistrare() {
        return dataInregistrare;
    }

    public void setDataInregistrare(String dataInregistrare) {
        this.dataInregistrare = dataInregistrare;
    }

    public List<Carte> getCartiCurentImprumutate() {
        return cartiCurentImprumutate;
    }

    public void setCartiCurentImprumutate(List<Carte> cartiCurentImprumutate) {
        this.cartiCurentImprumutate = cartiCurentImprumutate;
    }

    public void adaugaCarteImprumutata(Carte carte){
        cartiCurentImprumutate.add(carte);
    }
    public void eliminaCarteImprumutata(Carte carte){
        cartiCurentImprumutate.remove(carte);
    }
    @Override
    public String getStatus(){
        return "Cititor";
    }

    @Override
    public String getInformatii() {
        StringBuilder infoBuilder = new StringBuilder();
        for (Carte carte : cartiCurentImprumutate) {
            infoBuilder.append(carte.getNume()).append(", ");
        }

        return super.getInformatii()+" "+idNumber+" "+dataInregistrare+"\nCarti:"+   infoBuilder.toString();
        //return super.getInformatii()+" "+idNumber+" "+dataInregistrare+"  "+cartiCurentImprumutate;
    }
}
