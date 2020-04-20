package repository;
import model.Revizie;
import service.CitireService;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RevizieRepository {

    List <Revizie> revizii = new ArrayList<Revizie>();

    public RevizieRepository()  {

        CitireService in = new CitireService();
        List<String> dateIn = in.citireLista("fisiereIO/Revizie.csv");
        for(String date : dateIn) {
            String[] v = date.split(",");
            int a0 = Integer.parseInt(v[0]);
            int a1 = Integer.parseInt(v[1]);
            int a2 = Integer.parseInt(v[2]);
            int a3 = Integer.parseInt(v[3]);
            revizii.add(new Revizie(a0, a1, a2, a3));

        }

        /*
        revizii.add( new Revizie(101, 2020, 12, 7));
        revizii.add( new Revizie(102, 2021, 11, 2));
        revizii.add( new Revizie(103, 2020, 12, 25));
        revizii.add( new Revizie(104, 2020, 10, 20));
        revizii.add( new Revizie(105, 2021, 12, 8));
        revizii.add( new Revizie(106, 2020, 8, 20));

        revizii.add( new Revizie(107, 2022, 7, 10));
        revizii.add( new Revizie(108, 2020, 6, 20));
        revizii.add( new Revizie(109, 2020, 8, 20));
        revizii.add( new Revizie(110, 2022, 2, 15));
        revizii.add( new Revizie(111, 2021, 3, 18));
        revizii.add( new Revizie(112, 2020, 6, 9));
        */

    }

    public void adauga(Revizie p)  {
        revizii.add(p);
    }


    public List<Revizie> getRevizie() {
        return revizii;
    }

    public void scrie(){
        try {
            FileWriter out = new FileWriter("fisiereIO/Revizie2.csv");
            for(Revizie x : revizii) {
                out.write(x.getId() + ',' + x.getAnExpirare() + ',' + x.getLunaExpirare() + ',' + x.getZiExpirare() + "\r\n");
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Eroare");
            e.printStackTrace();
        }
    }

}
