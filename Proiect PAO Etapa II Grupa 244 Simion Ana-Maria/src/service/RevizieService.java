package service;
import model.Revizie;
import repository.RevizieRepository;
import java.util.List;

public class RevizieService {

    private static RevizieService instance = new RevizieService();
    private RevizieRepository reviziiRepository = new RevizieRepository();

    private RevizieService() {
    }

    public static RevizieService getInstance() {
        return instance;
    }

    public void addRevizie(Revizie p)   {
        reviziiRepository.adauga(p);
        reviziiRepository.scrie();
    }

    public void afisareReviziicareExpiraAnulAsta(int an){
        List <Revizie> x = reviziiRepository.getRevizie();
        for(int i=0; i<x.size(); i++)
            if(x.get(i).getAnExpirare() == an){
                System.out.print(x.get(i));
                System.out.print(" ");
            }
        System.out.println();
    }

    public List<Revizie> getRevizie()  {
        return reviziiRepository.getRevizie();
    }

}
