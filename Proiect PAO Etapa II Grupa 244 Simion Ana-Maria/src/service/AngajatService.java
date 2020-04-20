package service;
import model.Angajat;
import repository.AngajatRepository;


import java.util.List;

public class AngajatService {
    private static AngajatService instance = new AngajatService();
    private AngajatRepository angajatRepository = new AngajatRepository();

    private AngajatService() {
    }

    public static AngajatService getInstance() {
        return instance;
    }

    public void changeNumarOreSuplimentare(String nume, int ore) {
        Angajat p = angajatRepository.findAngajatByNume(nume);
        p.setNumarOreSuplimentare(ore);
    }

    public int bonusOreSuplimentare(String nume){
        Angajat x = angajatRepository.findAngajatByNume(nume);
        return x.getNumarOreSuplimentare()*x.getJob().getComisionPeOraSuplimentara();
    }

    public List<Angajat> getAngajati() {
        return angajatRepository.getAngajati();
    }

    public void addAngajat(Angajat p) {
        angajatRepository.adauga(p);
    }
    public void deleteAngajat(Angajat p) {
        angajatRepository.sterge(p);
    }
    
}
