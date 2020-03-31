package repository;
import model.Job;
import java.util.*;

public class JobRepository {

    List<Job> joburi = new ArrayList<Job>();

    public JobRepository() {
        joburi.add(new Job("Sofer", 96, 12));
        joburi.add(new Job("Mecanic", 40, 5));
        joburi.add(new Job("Contabil", 48, 6));
        joburi.add(new Job("Vanzator_De_Servicii", 140, 5));
        joburi.add(new Job("Manager", 200, 0));
    }

    public void adauga(Job x){
        joburi.add(x);
    }

    public void sterge(Job x){
        joburi.remove(x);
    }

    public Job findJobByNume(String nume)   {
        for(Job p : joburi)   {
            if(p != null)   {
                if(nume.equals(p.getNumeJob())){
                    return p;
                }
            }
        }
        return null;
    }

    public List<Job> getJoburi() {
        return joburi;
    }

}



