package model;

public class Manager extends Angajat {

    private String codBancar;
    private String urmatoareaSedinta;

    public Manager(String numePrenume, Job job, int numarOreSuplimentare, String codBancar, String urmatoareaSedinta) {
        super(numePrenume, job, numarOreSuplimentare);
        this.codBancar = codBancar;
        this.urmatoareaSedinta = urmatoareaSedinta;
    }

    public String getCodBancar() {
        return codBancar;
    }

    public void setCodBancar(String codBancar) {
        this.codBancar = codBancar;
    }

    public String getUrmatoareaSedinta() {
        return urmatoareaSedinta;
    }

    public void setUrmatoareaSedinta(String urmatoareaSedinta) {
        this.urmatoareaSedinta = urmatoareaSedinta;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "codBancar='" + codBancar + '\'' +
                ", urmatoareaSedinta='" + urmatoareaSedinta + '\'' +
                '}';
    }
}
