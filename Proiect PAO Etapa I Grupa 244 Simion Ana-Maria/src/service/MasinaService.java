package service;

import model.Cauciuc;
import model.Masina;
import model.Revizie;
import repository.MasinaRepository;

import java.util.List;


public class MasinaService {

    private static MasinaService instance = new MasinaService();
    private MasinaRepository masiniRepository = new MasinaRepository();

    private MasinaService() {
    }

    public static MasinaService getInstance() {
        return instance;
    }


    public void addMasina(Masina p)   {
        masiniRepository.adauga(p);
    }
    public void deleteMasina(Masina p)   {
        masiniRepository.sterge(p);
    }


    public Masina findMasinaByNumarInmatriculare(String p)   {
       return masiniRepository.findMasinaByNumarInmatriculare(p);
    }

    public void changeNumarKm(String p, int x){
        findMasinaByNumarInmatriculare(p).setNumarKm(x);
    }

    public void actualizareRevizie(String p, Revizie x){
        Masina m=findMasinaByNumarInmatriculare(p);
        if(x.getAnExpirare()>m.getRevizie().getAnExpirare())
            m.setRevizie(x);
        else System.out.println("Datele introduse sunt gresite! Revizia noua nu poate expira mai repede decat cea veche.");
    }

    public void schimbareCauciucuri(String p, Cauciuc x){
        Masina m=findMasinaByNumarInmatriculare(p);
        if(m.getRoataDimensiuneInchi()==x.getDimensiuneInchi()&&m.getRoataLatime()==x.getLatime()&&m.getRoataRaportInaltimeLatime()==x.getRaportInaltimeLatime())
            m.setCauciuc(x);
        else System.out.println("Dimensiunile cauciucului pe care doriti sa-l modificati nu se potrivesc");
    }


    public List<Masina> getMasina()  {
        return masiniRepository.getMasini();
    }

}
