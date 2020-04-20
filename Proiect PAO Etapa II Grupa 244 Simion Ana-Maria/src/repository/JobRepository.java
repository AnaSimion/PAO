package repository;
import model.Job;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import service.CitireService;

public class JobRepository {

    List<Job> joburi = new ArrayList<Job>();

    public JobRepository() {

        CitireService in = new CitireService();
        List<String> dateIn = in.citireLista("fisiereIO/Job.csv");
        for(String date : dateIn) {
            String[] v = date.split(",");
            String a0 = v[0];
            int a1 = Integer.parseInt(v[1]);
            int a2 = Integer.parseInt(v[2]);
            joburi.add(new Job(a0, a1, a2));

        }

        /* EtapaI

           joburi.add(new Job("Sofer", 96, 12));
           joburi.add(new Job("Mecanic", 40, 5));
           joburi.add(new Job("Contabil", 48, 6));
           joburi.add(new Job("Vanzator_De_Servicii", 140, 5));
           joburi.add(new Job("Manager", 200, 0));
         */

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

    public void scrie(){
        try {
            FileWriter out = new FileWriter("fisiereIO/Job2.csv");
            for(Job x : joburi) {
                out.write(x.getNumeJob() + ',' + x.getNumarDeOreMinimPeLuna() + ',' + x.getComisionPeOraSuplimentara() + "\r\n");
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Eroare");
            e.printStackTrace();
        }
    }

}

