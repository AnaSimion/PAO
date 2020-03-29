package service;
import model.Job;
import repository.JobRepository;

import java.util.List;

public class JobService {
    private static JobService instance = new JobService();
    private JobRepository jobRepository = new JobRepository();

    private JobService() {
    }

    public static JobService getInstance() {
        return instance;
    }

    public void changeComisionPeOraOfJob(String name, int price) {
        Job p = jobRepository.findJobByNume(name);
        p.setComisionPeOraSuplimentara(price);
    }
    public void changeNumarDeOreMinimPeLuna(String name, int price) {
        Job p = jobRepository.findJobByNume(name);
        p.setNumarDeOreMinimPeLuna(price);
    }

    public List<Job> getJobs() {
        return jobRepository.getJoburi();
    }

    public void addJob(Job p) {
        jobRepository.adauga(p);
    }
    public void deleteJob(Job p) {
        jobRepository.sterge(p);
    }
}
