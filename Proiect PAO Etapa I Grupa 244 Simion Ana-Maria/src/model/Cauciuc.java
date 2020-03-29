package model;

public class Cauciuc {
    private int cod;
    private String producator;
    private int indiceUzura;
    private boolean deIarna;
    private boolean deVara;
    private int dimensiuneInchi;
    private int latime;
    private int raportInaltimeLatime;

    public Cauciuc(int cod, String producator, int indiceUzura, boolean deIarna, boolean deVara, int dimensiuneInchi, int latime, int raportInaltimeLatime) {
        this.cod = cod;
        this.producator = producator;
        this.indiceUzura = indiceUzura;
        this.deIarna = deIarna;
        this.deVara = deVara;
        this.dimensiuneInchi = dimensiuneInchi;
        this.latime = latime;
        this.raportInaltimeLatime = raportInaltimeLatime;
    }

    public void setIndiceUzura(int indiceUzura) {
        if(indiceUzura >= 0 &&indiceUzura <= 5)
            this.indiceUzura = indiceUzura;
        else
                System.out.println("Indicele de uzura trebuie sa fie in intervalului [0,5]");

    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public int getIndiceUzura() {
        return indiceUzura;
    }

    public boolean isDeIarna() {
        return deIarna;
    }

    public void setDeIarna(boolean deIarna) {
        this.deIarna = deIarna;
    }

    public boolean isDeVara() {
        return deVara;
    }

    public void setDeVara(boolean deVara) {
        this.deVara = deVara;
    }

    public int getDimensiuneInchi() {
        return dimensiuneInchi;
    }

    public void setDimensiuneInchi(int dimensiuneInchi) {
        this.dimensiuneInchi = dimensiuneInchi;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public int getRaportInaltimeLatime() {
        return raportInaltimeLatime;
    }

    public void setRaportInaltimeLatime(int raportInaltimeLatime) {
        this.raportInaltimeLatime = raportInaltimeLatime;
    }

    @Override
    public String toString() {
        return "Cauciuc{" +
                "cod=" + cod +
                ", producator='" + producator + '\'' +
                ", indiceUzura=" + indiceUzura +
                ", deIarna=" + deIarna +
                ", deVara=" + deVara +
                ", dimensiuneInchi=" + dimensiuneInchi +
                ", latime=" + latime +
                ", raportInaltimeLatime=" + raportInaltimeLatime +
                '}';
    }
}
