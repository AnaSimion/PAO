package repository;
import model.Ruta;
import model.Oras;
import java.util.ArrayList;
import java.util.List;

public class RutaRepository {

    List <Ruta> rute = new ArrayList<Ruta>();
    OrasRepository oras = new OrasRepository();
    List <Oras> orase = oras.getOrase();

    public RutaRepository()  {
        rute.add(new Ruta(500, 250, orase.get(0), orase.get(1)));
        rute.add(new Ruta(600, 300, orase.get(1), orase.get(2)));
        rute.add(new Ruta(700, 350, orase.get(2), orase.get(3)));
        rute.add(new Ruta(700, 400, orase.get(3), orase.get(2)));
        rute.add(new Ruta(600, 200, orase.get(2), orase.get(1)));
        rute.add(new Ruta(500, 150, orase.get(1), orase.get(0)));
    }

    public void adauga(Ruta p)  {
      rute.add(p);
    }

    public void sterge(Ruta p){
        rute.remove(p);
    }

    public Ruta findRutaByStart(String start)   {
        for(Ruta p : rute)   {
            if(p != null)   {
                if(start.equals(p.getStart().getNume())){
                    return p;
                }
            }
        }
        return null;
    }

    public Ruta findRutaByDestinatie(String destinatie)   {
        for(Ruta p : rute)   {
            if(p != null)   {
                if(destinatie.equals(p.getDestinatie().getNume())){
                    return p;
                }
            }
        }
        return null;
    }

    public List<Ruta> getRute() {
        return rute;
    }

}
