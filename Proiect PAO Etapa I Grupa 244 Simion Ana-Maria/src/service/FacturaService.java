package service;

import model.Factura;

import repository.FacturaRepository;

import java.util.List;


public class FacturaService {

    private static FacturaService instance = new FacturaService();
    private FacturaRepository facturiRepository = new FacturaRepository();

    private FacturaService() {
    }

    public static FacturaService getInstance() {
        return instance;
    }


    public void addFactura(Factura p)   {
        facturiRepository.adauga(p);
    }


    public Factura findFacturaByCod(int p)   {
        return facturiRepository.findFacturaByCod(p);
    }

    public void findFacturaMaiMareCa(int x)   {

        for(Factura p: facturiRepository.getFacturi())
            if(p.getTotal()>=x) {
                System.out.print(p.getCodUnic()+" "+p.getTotal()+" ");
                System.out.println();
            }
    }


    public List<Factura> getFactura()  {
        return facturiRepository.getFacturi();
    }

}
