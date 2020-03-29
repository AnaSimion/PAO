package model;

public class Revizie {
    private int id;
    private int anExpirare;
    private int lunaExpirare;
    private int ziExpirare;

    public Revizie(int id, int anExpirare, int lunaExpirare, int ziExpirare) {
        this.id = id;
        this.anExpirare = anExpirare;
        this.lunaExpirare = lunaExpirare;
        this.ziExpirare = ziExpirare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnExpirare() {
        return anExpirare;
    }

    public int getLunaExpirare() {
        return lunaExpirare;
    }

    public int getZiExpirare() {
        return ziExpirare;
    }

    public void setDataExpirare(int anExpirare, int lunaExpirare, int ziExpirare) {
        if(anExpirare > this.anExpirare) {
            this.anExpirare = anExpirare;
            this.lunaExpirare = lunaExpirare;
            this.ziExpirare = ziExpirare;
        }
        else System.out.println("Datele au fost introduse gresit! Anul de expirare pentru noua revizie trebuie sa fie mai mare decat precedentul.");
    }

    @Override
    public String toString() {
        return "Revizie{" +
                "id=" + id +
                ", anExpirare=" + anExpirare +
                ", lunaExpirare=" + lunaExpirare +
                ", ziExpirare=" + ziExpirare +
                '}';
    }
}
