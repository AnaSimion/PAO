package repository;
import model.Factura;
import model.Job;
import model.Masina;
import model.Ruta;


import java.util.*;

public class FacturaRepository {

    List<Factura> facturi = new ArrayList<Factura>();
    MasinaRepository masina= new MasinaRepository();
    List <Masina> masini=masina.getMasini();

    RutaRepository ruta= new RutaRepository();
    List <Ruta> rute = ruta.getRute();

    public FacturaRepository()  {

        facturi.add( new Factura(0,masini.get(0),rute.get(0)));
        facturi.add(new Factura(1,masini.get(1),rute.get(1)));

    }

    public void adauga(Factura p)  {
        facturi.add(p);
    }

    public Factura findFacturaByCod(int cod)   {
        for(Factura p : facturi)   {
            
                if(cod == p.getCodUnic()){
                    return p;
                }
            
        }
        return null;
    }

    public List<Factura> getFacturi() {
        return facturi;
    }
}
