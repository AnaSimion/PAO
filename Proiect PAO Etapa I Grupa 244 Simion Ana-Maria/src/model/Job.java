package model;

public class Job  {
    private String numeJob;
    private int numarDeOreMinimPeLuna;
    private int comisionPeOraSuplimentara;

    public Job(String numeJob, int numarDeOreMinimPeLuna, int comisionPeOraSuplimentara) {
        this.numeJob = numeJob;
        this.numarDeOreMinimPeLuna = numarDeOreMinimPeLuna;
        this.comisionPeOraSuplimentara = comisionPeOraSuplimentara;
    }

    public String getNumeJob() {
        return numeJob;
    }

    public void setNumeJob(String numeJob) {
        this.numeJob = numeJob;
    }

    public int getNumarDeOreMinimPeLuna() {
        return numarDeOreMinimPeLuna;
    }

    public void setNumarDeOreMinimPeLuna(int numarDeOreMinimPeLuna) {
        this.numarDeOreMinimPeLuna = numarDeOreMinimPeLuna;
    }

    public int getComisionPeOraSuplimentara() {
        return comisionPeOraSuplimentara;
    }

    public void setComisionPeOraSuplimentara(int comisionPeOraSuplimentara) {
        this.comisionPeOraSuplimentara = comisionPeOraSuplimentara;
    }

    @Override
    public String toString() {
        return "Job{" +
                "numeJob='" + numeJob + '\'' +
                ", numarDeOreMinimPeLuna=" + numarDeOreMinimPeLuna +
                ", comisionPeOraSuplimentara=" + comisionPeOraSuplimentara +
                '}';
    }
}
