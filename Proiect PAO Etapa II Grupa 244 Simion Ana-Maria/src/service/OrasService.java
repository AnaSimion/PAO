package service;
import model.Oras;
import repository.OrasRepository;
import java.util.List;

public class OrasService {

    private static OrasService instance = new OrasService();
    private OrasRepository oraseRepository = new OrasRepository();

    private OrasService() {
    }

    public static OrasService getInstance() {
        return instance;
    }

    public void addOras(Oras p)   {
        oraseRepository.adauga(p);
        oraseRepository.scrie();
    }

    public void deleteOras(Oras p)   {
        oraseRepository.sterge(p);
        oraseRepository.scrie();
    }

    public Oras findOrasByNume(String p)   {
        return oraseRepository.findOrasByNume(p);
    }

    public void actualizareIndicePoluare(String nume, int p){
        Oras x=findOrasByNume(nume);
        x.setIndiceMinimPoluare(p);
        oraseRepository.scrie();
    }

    public List<Oras> getOras()  {
        return oraseRepository.getOrase();
    }

}
