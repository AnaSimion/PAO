package model;

public class Factura {

    private int codUnic;
    private int numarFactura;
    private Masina masina;
    private Ruta ruta;
    private float total;


    public Factura( int numarFactura, Masina masina, Ruta ruta) {
        this.codUnic = 1100*10+numarFactura;
        this.numarFactura = numarFactura;
        this.masina = masina;
        this.ruta = ruta;
        this.total = masina.getTarifPerKm()*ruta.getDistanta();
    }

    public int getCodUnic() {
        return codUnic;
    }

    public void setCodUnic(int codUnic) {
        this.codUnic = codUnic;
    }

    public int getNumarFactura() {
        return numarFactura;
    }

    public void setNumarFactura(int numarFactura) {
        this.numarFactura = numarFactura;
    }

    public Masina getMasina() {
        return masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "codUnic=" + codUnic +
                ", numarFactura=" + numarFactura +
                ", masina=" + masina +
                ", ruta=" + ruta +
                ", total=" + total +
                '}';
    }
}
