package model;

public class Angajat {

    private String numePrenume;
    private Job job;
    private int numarOreSuplimentare;

    public Angajat(String numePrenume, Job job, int numarOreSuplimentare) {
        this.numePrenume = numePrenume;
        this.job = job;
        this.numarOreSuplimentare = numarOreSuplimentare;
    }

    public String getNumePrenume() {
        return numePrenume;
    }

    public void setNumePrenume(String numePrenume) {
        this.numePrenume = numePrenume;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getNumarOreSuplimentare() {
        return numarOreSuplimentare;
    }

    public void setNumarOreSuplimentare(int numarOreSuplimentare) {
        this.numarOreSuplimentare = numarOreSuplimentare;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "numePrenume='" + numePrenume + '\'' +
                ", job=" + job +
                ", numarOreSuplimentare=" + numarOreSuplimentare +
                '}';
    }

}
