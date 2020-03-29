package repository;
import model.Cauciuc;
import model.Masina;
import model.Revizie;

import java.util.ArrayList;
import java.util.List;

public class MasinaRepository {

    List<Masina> masini = new ArrayList<Masina>();
    CauciucuriRepository cauciuc= new CauciucuriRepository();
    List <Cauciuc> cauciucuri=cauciuc.getCauciucuri();

    RevizieRepository revizie= new RevizieRepository();
    List <Revizie> revizii=revizie.getRevizie();


    public MasinaRepository()  {
        masini.add(new Masina("Volvo","VDE451","B01AAA",20000,0.3f,17,255,45,5,4,cauciucuri.get(0),revizii.get(0)));
        masini.add(new Masina("Mazda","AEE651","B02AAB",100000,0.23f,16,255,55,4,4,cauciucuri.get(1),revizii.get(1)));
        masini.add(new Masina("Audi","URE822","B12AAC",250000,0.25f,15,195,65,3,4,cauciucuri.get(2),revizii.get(2)));
        masini.add(new Masina("Lexus","BRT976","B842GAB",5000,0.4f,16,165,60,6,4,cauciucuri.get(3),revizii.get(3)));
        masini.add(new Masina("KIA","AWS434","B45HSA",120000,0.23f,18,285,30,4,4,cauciucuri.get(4),revizii.get(4)));
        masini.add(new Masina("Honda","RDC594","B84DFB",70000,0.28f,19,305,25,6,4,cauciucuri.get(5),revizii.get(5)));

        masini.add(new Masina("Renault","1VDE451","B01HAA",200000,0.31f,17,255,45,5,6,cauciucuri.get(6),revizii.get(6)));
        masini.add(new Masina("Renault","3AEE651","B02AGB",10000,0.28f,16,255,55,4,8,cauciucuri.get(7),revizii.get(7)));
        masini.add(new Masina("Mercedes-Benz","4URE822","B124ABC",25000,0.26f,15,195,65,3,12,cauciucuri.get(8),revizii.get(8)));
        masini.add(new Masina("Toyota","3BRT976","B82GAP",50000,0.41f,16,165,60,6,20,cauciucuri.get(9),revizii.get(9)));
        masini.add(new Masina("Ford","2AWS434","B454RSA",12000,0.24f,18,285,30,4,15,cauciucuri.get(10),revizii.get(10)));
        masini.add(new Masina("Volkswagen","4RDC594","B52FFB",700000,0.2f,19,305,25,6,6,cauciucuri.get(11),revizii.get(11)));

    }

    public void adauga(Masina p)  {
        masini.add(p);

    }
    public void sterge(Masina p){
        masini.remove(p);
    }

    public Masina findMasinaByNumarInmatriculare(String numarInmatriculare)   {
        for(Masina p : masini)   {
            if(p != null)   {
                if(numarInmatriculare.equals(p.getNumarInmatriculare())){
                    return p;
                }
            }
        }
        return null;
    }



    public List<Masina> getMasini() {
        return masini;
    }
}
