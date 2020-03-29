package repository;

import model.Oras;

import java.util.ArrayList;
import java.util.List;

public class OrasRepository {

    List<Oras> orase = new ArrayList<Oras>();

    public OrasRepository()  {
        orase.add(new Oras("Bucuresti",2));
        orase.add(new Oras("Budapesta",4));
        orase.add(new Oras("Viena",5));
        orase.add(new Oras("Berlin",3));

    }

    public void adauga(Oras p)  {
        orase.add(p);
    }
    public void sterge(Oras p)  {
        orase.remove(p);
    }


    public Oras findOrasByNume(String nume)   {
        for(Oras p : orase)   {
            if(p != null)   {
                if(nume.equals(p.getNume())){
                    return p;
                }
            }
        }
        return null;
    }

    public List<Oras> getOrase() {
        return orase;
    }
}
