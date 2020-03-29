package model;

public class Masina {
    private String marca;
    private String serieSasiu;
    private String numarInmatriculare;
    private int numarKm;
    private float tarifPerKm;
    private int roataDimensiuneInchi;
    private int roataLatime;
    private int roataRaportInaltimeLatime;
    private int indicePoluare;
    private int numarLocuri;
    private Cauciuc cauciuc;
    private Revizie revizie;

    public Masina(String marca, String serieSasiu, String numarInmatriculare, int numarKm, float tarifPerKm, int roataDimensiuneInchi, int roataLatime, int roataRaportInaltimeLatime, int indicePoluare, int numarLocuri, Cauciuc cauciuc, Revizie revizie) {
        this.marca = marca;
        this.serieSasiu = serieSasiu;
        this.numarInmatriculare = numarInmatriculare;
        this.numarKm = numarKm;
        this.tarifPerKm = tarifPerKm;
        this.roataDimensiuneInchi = roataDimensiuneInchi;
        this.roataLatime = roataLatime;
        this.roataRaportInaltimeLatime = roataRaportInaltimeLatime;
        this.indicePoluare = indicePoluare;
        this.numarLocuri = numarLocuri;
        this.cauciuc = cauciuc;
        this.revizie = revizie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerieSasiu() {
        return serieSasiu;
    }

    public void setSerieSasiu(String serieSasiu) {
        this.serieSasiu = serieSasiu;
    }

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    public void setNumarInmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    public int getNumarKm() {
        return numarKm;
    }

    public void setNumarKm(int numarKm) {
        this.numarKm = numarKm;
    }

    public float getTarifPerKm() {
        return tarifPerKm;
    }

    public void setTarifPerKm(float tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }

    public int getRoataDimensiuneInchi() {
        return roataDimensiuneInchi;
    }

    public void setRoataDimensiuneInchi(int roataDimensiuneInchi) {
        this.roataDimensiuneInchi = roataDimensiuneInchi;
    }

    public int getRoataLatime() {
        return roataLatime;
    }

    public void setRoataLatime(int roataLatime) {
        this.roataLatime = roataLatime;
    }

    public int getRoataRaportInaltimeLatime() {
        return roataRaportInaltimeLatime;
    }

    public void setRoataRaportInaltimeLatime(int roataRaportInaltimeLatime) {
        this.roataRaportInaltimeLatime = roataRaportInaltimeLatime;
    }

    public int getIndicePoluare() {
        return indicePoluare;
    }

    public void setIndicePoluare(int indicePoluare) {
        this.indicePoluare = indicePoluare;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    public void setNumarLocuri(int numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    public Cauciuc getCauciuc() {
        return cauciuc;
    }

    public void setCauciuc(Cauciuc cauciuc) {
        this.cauciuc = cauciuc;
    }

    public Revizie getRevizie() {
        return revizie;
    }

    public void setRevizie(Revizie revizie) {
        this.revizie = revizie;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", serieSasiu='" + serieSasiu + '\'' +
                ", numarInmatriculare='" + numarInmatriculare + '\'' +
                ", numarKm=" + numarKm +
                ", tarifPerKm=" + tarifPerKm +
                ", roataDimensiuneInchi=" + roataDimensiuneInchi +
                ", roataLatime=" + roataLatime +
                ", roataRaportInaltimeLatime=" + roataRaportInaltimeLatime +
                ", indicePoluare=" + indicePoluare +
                ", numarLocuri=" + numarLocuri +
                ", cauciuc=" + cauciuc +
                ", revizie=" + revizie +
                '}';
    }
}
