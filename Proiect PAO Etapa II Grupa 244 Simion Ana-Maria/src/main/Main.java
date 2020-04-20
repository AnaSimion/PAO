package main;
import model.*;
import service.*;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //1.Actualizam gradul de uzura al cauciucului cu codul 101.
        //2.Adaugam un nou cauciuc

        CauciucuriService cauciucuriService = CauciucuriService.getInstance();
        List <Cauciuc> cauciucuri = cauciucuriService.getCauciucuri();
        cauciucuriService.changeIndiceUzuraOfCauciucuri(1, 101);
        cauciucuriService.addCauciucuri(new Cauciuc(113, "Debica", 1, false, true, 18, 285, 30));

        for(Cauciuc p : cauciucuri)   {
            System.out.println(p);
        }
        System.out.println();
        System.out.println();

        //3.Au fost cumparate cauciucuri noi in locul celor ce aveau gradul de uzura >=4. Sa se actualizeze indicii de uzura.
        //4.Stergem cauciucul adaugat la 2) folosind cautarea dupa cod

        for(Cauciuc p : cauciucuri)   {
            if(p.getIndiceUzura() >= 4)
                p.setIndiceUzura(0);
        }

        cauciucuriService.deleteCauciucuri(cauciucuriService.findCauciucuriByCod(113));

        for(Cauciuc p : cauciucuri)   {
            System.out.println(p);
        }

        System.out.println();
        System.out.println();

        AngajatService angajatiService =  AngajatService.getInstance();
        List < Angajat>angajati = angajatiService.getAngajati();

        //5.Sa se afiseze bonusul pentru orele suplimentare pentru fiecare angajat
        for(Angajat p : angajati)   {
            System.out.print(p.getNumePrenume() + ' ' + angajatiService.bonusOreSuplimentare(p.getNumePrenume()) + '\n');
        }

        System.out.println();
        System.out.println();

        FacturaService facturiService = FacturaService.getInstance();

        //6. Sa se afiseze toate facturile cu valoare mai mare de 15

        facturiService.findFacturaMaiMareCa(15);
        System.out.println();
        System.out.println();

        //7.Sa se modifice comisionul pentru postul de sofer si numarul de ore minim pentru postul de mecanic si sa se sorteze descrescator lista dupa bonus apoi dupa ore

        JobService joburiService = JobService.getInstance();
        List <Job> joburi = joburiService.getJobs();
        joburiService.changeComisionPeOraOfJob("Sofer", 20);
        joburiService.changeNumarDeOreMinimPeLuna("Mecanic", 75);

        Comparator<Job> comparatorJob = new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                if(o1.getComisionPeOraSuplimentara() < o2.getComisionPeOraSuplimentara())
                    return 1;
                else if(o1.getComisionPeOraSuplimentara() == o2.getComisionPeOraSuplimentara())
                        if(o1.getNumarDeOreMinimPeLuna() < o2.getNumarDeOreMinimPeLuna())
                            return 1;
                        else return 0;
                return -1;
            }
        };

        joburi.sort(comparatorJob);

        for(Job x : joburi){
            System.out.println("Bonus: " + x.getComisionPeOraSuplimentara() + " Ore: " + x.getNumarDeOreMinimPeLuna());
        }

        System.out.println();
        System.out.println();

        //8.Sa se afiseze masinile cu mai putini de 150000 km

        MasinaService masiniService = MasinaService.getInstance();
        List <Masina> masini = masiniService.getMasina();

        for(Masina m:masini ){
            if(m.getNumarKm() < 150000)
                System.out.println(m.getMarca() + " " + m.getNumarInmatriculare() + " " + m.getNumarKm() + " Km");
        }

        System.out.println();
        System.out.println();


        //9.Sa se afiseze toate masinile care pot circula in Viena luan in considerare nivelul de poluare admis in oras

        OrasService oraseService = OrasService.getInstance();
        int indice = oraseService.findOrasByNume("Viena").getIndiceMinimPoluare();
        System.out.println("Norma de poluare minima admisa in Viena este " + indice);
        oraseService.actualizareIndicePoluare("Viena", 6);
        for(Masina m : masini){
            if(m.getIndicePoluare() >= indice)
                System.out.println(m.getMarca() + " " + m.getNumarInmatriculare() + " Euro " + m.getIndicePoluare());
        }

        System.out.println();
        System.out.println();

        RevizieService reviziiService = RevizieService.getInstance();
        List <Revizie> revizii = reviziiService.getRevizie();

        //10. Sa se afiseze toate rutele disponibile care incep sau se termina in Bucuresti

        RutaService ruteService = RutaService.getInstance();
        List <Ruta> rute = ruteService.getRuta();
        System.out.println(ruteService.findRutaByStart("Bucuresti"));
        System.out.println(ruteService.findRutaByDestinatie("Bucuresti"));
        System.out.println();
        System.out.println();

        //11. Sa se afiseze datele specifice postului de manager (nu datele despre angajatul care e manager)

        ManagerService managerService = ManagerService.getInstance();
        System.out.println(managerService.getManager());

    }
}
