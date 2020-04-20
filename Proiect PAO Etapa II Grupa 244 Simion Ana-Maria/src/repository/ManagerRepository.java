package repository;
import model.Job;
import model.Manager;

import java.util.List;

public class ManagerRepository {

    Manager manager;
    JobRepository job = new JobRepository();
    List<Job> joburi = job.getJoburi();
    public ManagerRepository() {
        manager = new Manager("Avram Ioana", joburi.get(4), 30, "RO458NS", "25-Apr-2020 Ora 12:00");
    }

    public void setUrmatoareaSedinta(String p){
        manager.setUrmatoareaSedinta(p);
    }

    public Manager getDateManager(){
        return manager;
    }

}
