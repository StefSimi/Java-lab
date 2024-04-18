
import model.Biblioteca;
import model.Carte;
import model.Cititor;
import model.Sectiune;
import service.Serviciu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Carte carte1= new Carte("The Hunger Games", "Suzanne Collins",2008,384);
        Carte carte2= new Carte("The 100", "Kass Morgan",2013,336);
        List<Carte> cartiTest= new ArrayList<>();
        cartiTest.add(carte1);
        cartiTest.add(carte2);
        Cititor citior1 = new Cititor("Simion","Stefan","123","07","Titan","001","18-4-2024",cartiTest);
        System.out.println(citior1.getInformatii());


        List< Sectiune> sectiuniTest=new ArrayList<>();
        sectiuniTest.add(new Sectiune("B", cartiTest));
        sectiuniTest.add(new Sectiune("A", cartiTest));


        Biblioteca biblioteca= Biblioteca.getInstance();
        biblioteca.setSectiuni(sectiuniTest);



        Serviciu s= new Serviciu();
        s.adaugaCarte(carte1);
        s.adaugaCarte(carte2);
        s.adaugaCititor(citior1);





    }
}