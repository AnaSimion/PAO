package service;
import model.Cauciuc;
import model.Cauciuc;
import repository.CauciucuriRepository;
import java.util.List;

public class CauciucuriService {

    private static CauciucuriService instance = new CauciucuriService();
    private CauciucuriRepository cauciucuriRepository = new CauciucuriRepository();

    private CauciucuriService() {
    }

    public static CauciucuriService getInstance() {
        return instance;
    }

    public Cauciuc findCauciucuriByCod(int p)   {
        return cauciucuriRepository.findCauciucuriByCod(p);
    }

    public void changeIndiceUzuraOfCauciucuri(int indice, int cod)  {
        Cauciuc p = cauciucuriRepository.findCauciucuriByCod(cod);
        p.setIndiceUzura(indice);
        cauciucuriRepository.scrie();
    }

    public void addCauciucuri(Cauciuc p)   {
        cauciucuriRepository.adauga(p);
        cauciucuriRepository.scrie();
    }

    public void deleteCauciucuri(Cauciuc p)   {
        cauciucuriRepository.sterge(p);
        cauciucuriRepository.scrie();
    }

    public List<Cauciuc> getCauciucuri()  {
        return cauciucuriRepository.getCauciucuri();
    }

}
