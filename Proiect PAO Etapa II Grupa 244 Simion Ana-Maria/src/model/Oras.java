package model;

public class Oras {

    private String nume;
    private int indiceMinimPoluare;


    public Oras(String nume, int indiceMinimPoluare) {
        this.nume = nume;
        this.indiceMinimPoluare = indiceMinimPoluare;

    }

    public String getNume() {
        return nume;
    }

    public int getIndiceMinimPoluare() {
        return indiceMinimPoluare;
    }

    public void setIndiceMinimPoluare(int indiceMinimPoluare) {
        if(indiceMinimPoluare >= 1 && indiceMinimPoluare <= 7)
            this.indiceMinimPoluare = indiceMinimPoluare;
        else System.out.println("Valoare gresita! Indicele de poluare apartine intervalului [1,7]");
    }

    @Override
    public String toString() {
        return "Oras{" +
                "nume='" + nume + '\'' +
                ", indiceMinimPoluare=" + indiceMinimPoluare +
                '}';
    }

}
