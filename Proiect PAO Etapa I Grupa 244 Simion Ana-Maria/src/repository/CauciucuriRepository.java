package repository;
import model.Cauciuc;

import java.util.ArrayList;
import java.util.List;

public class CauciucuriRepository {

    List<Cauciuc> cauciucuri = new ArrayList<Cauciuc>();


    public CauciucuriRepository()  {
        cauciucuri.add(new Cauciuc(101,"Continental", 0,false,true,17,255,45));
        cauciucuri.add(new Cauciuc(102,"Michelin",  0,false,true,16,255,55));
        cauciucuri.add(new Cauciuc(103,"Goodyear",  4,false,true,15,195,65));
        cauciucuri.add(new Cauciuc(104,"Hankook", 2,false,true,16,165,60));
        cauciucuri.add(new Cauciuc(105,"Pirelli",  1,false,true,18,285,30));
        cauciucuri.add(new Cauciuc(106,"Dunlop",  3,false,true,19,305,25));

        cauciucuri.add(new Cauciuc(107,"Continental",  0,true,false,17,255,45));
        cauciucuri.add(new Cauciuc(108,"Nokian",  0,true,false,16,255,55));
        cauciucuri.add(new Cauciuc(109,"Bridgestone", 4,true,false,15,195,65));
        cauciucuri.add(new Cauciuc(110,"Yokohama",  2,true,false,16,165,60));
        cauciucuri.add(new Cauciuc(111,"Barum", 2,true,false,18,285,30));
        cauciucuri.add(new Cauciuc(112,"Bridgestone", 3,true,false,19,305,25));
    }

    public void adauga(Cauciuc p)  {
        cauciucuri.add(p);
    }

    public void sterge(Cauciuc p){
        cauciucuri.remove(p);

    }

    public void verificareUzura(Cauciuc p){

            if(p.getIndiceUzura()==5)
                System.out.println("Atentie! Cauciucurile trebuie schimbate");
            else
                if(p.getIndiceUzura()>=3&&p.getIndiceUzura()<=4)
                    System.out.println("Cauciucurile sunt la mijlocul perioadei de folosire.");
                else if(p.getIndiceUzura()<=2)
                    System.out.println("Cauciucurile sunt in perfecta stare de folosire.");
    }

    public Cauciuc findCauciucuriByCod(int cod)   {
        for(Cauciuc p : cauciucuri)   {
                if(cod == p.getCod()){
                    return p;
            }
        }
        return null;
    }

    public List<Cauciuc> getCauciucuri() {
        return cauciucuri;
    }
}
