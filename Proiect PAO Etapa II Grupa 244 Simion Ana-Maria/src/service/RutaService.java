package service;
import model.Ruta;
import repository.RutaRepository;
import java.util.List;

public class RutaService {

    private static RutaService instance = new RutaService();
    private RutaRepository rutaRepository = new RutaRepository();

    private RutaService() {
    }

    public static RutaService getInstance() {
        return instance;
    }

    public void addRuta(Ruta p)   {
        rutaRepository.adauga(p);
    }

    public Ruta findRutaByStart(String p)   {
        return rutaRepository.findRutaByStart(p);
    }

    public Ruta findRutaByDestinatie(String p)   {
        return rutaRepository.findRutaByDestinatie(p);
    }

    public List<Ruta> getRuta()  {
        return rutaRepository.getRute();
    }

}
