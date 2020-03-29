package model;

public class Ruta {

    private int distanta;
    private int durataInMinute;
    private Oras start;
    private Oras destinatie;


    public Ruta(int distanta, int durataInMinute, Oras start, Oras destinatie) {
        this.distanta = distanta;
        this.durataInMinute = durataInMinute;
        this.start = start;
        this.destinatie = destinatie;
    }


    public Oras getStart() {
        return start;
    }

    public void setStart(Oras start) {
        this.start = start;
    }

    public Oras getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(Oras destinatie) {
        this.destinatie = destinatie;
    }

    public int getDistanta() {

        return distanta;
    }

    public void setDistanta(int distanta) {
        if(distanta > 0)
            this.distanta = distanta;
        else System.out.println("Distanta nu poate sa fie o valoare negativa.");
    }

    public int getDurataInMinute() {

        return durataInMinute;
    }

    public void setDurataInMinute(int durataInMinute) {
        if(durataInMinute > 0)
            this.durataInMinute = durataInMinute;
        else System.out.println("Durata nu poate sa fie o valoare negativa.");
    }



    @Override
    public String toString() {
        return "Ruta{" +
                "distanta=" + distanta +
                ", durataInMinute=" + durataInMinute +
                ", start=" + start +
                ", destinatie=" + destinatie +
                '}';
    }
}
