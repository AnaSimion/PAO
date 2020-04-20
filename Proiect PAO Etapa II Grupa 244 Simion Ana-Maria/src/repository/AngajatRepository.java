package repository;
import model.Angajat;
import model.Job;

import java.util.*;

public class AngajatRepository {

    List<Angajat> angajati = new ArrayList<Angajat>();
    JobRepository job= new JobRepository();
    List <Job> joburi=job.getJoburi();

    public AngajatRepository() {
        angajati.add(new Angajat("Ionescu Paul", joburi.get(0), 5));
        angajati.add(new Angajat("Popescu Ion", joburi.get(0), 10));
        angajati.add(new Angajat("Negru Petru", joburi.get(0), 12));
        angajati.add(new Angajat("Pana Dan", joburi.get(1), 4));
        angajati.add(new Angajat("Dancescu Andrei", joburi.get(2), 6));
        angajati.add(new Angajat("Badea Marcel", joburi.get(3), 8));
        angajati.add(new Angajat("Iancu Radu", joburi.get(3), 15));
        angajati.add(new Angajat("Parvan Dana", joburi.get(3), 11));
        angajati.add(new Angajat("Avram Ioana", joburi.get(4), 30));
    }

    public void adauga(Angajat x) {
        angajati.add(x);
    }

    public void sterge(Angajat x) {
        angajati.remove(x);
    }

    public Angajat findAngajatByNume(String nume)   {
        for(Angajat p : angajati)   {
            if(p != null)   {
                if(nume.equals(p.getNumePrenume())){
                    return p;
                }
            }
        }
        return null;
    }

    public List<Angajat> getAngajati() {
        return angajati;
    }

}
