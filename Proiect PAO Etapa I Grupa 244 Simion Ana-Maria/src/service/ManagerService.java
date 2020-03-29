package service;


import model.Manager;
import repository.ManagerRepository;


public class ManagerService {
    private static ManagerService instance = new ManagerService();
    private ManagerRepository managerRepository = new ManagerRepository();

    private ManagerService() {
    }

    public static ManagerService getInstance() {
        return instance;
    }

    public void nouaIntalnireDeAfaceri(String nou){
        managerRepository.setUrmatoareaSedinta(nou);
    }

    public Manager getManager() {
        return managerRepository.getDateManager();
    }

}
