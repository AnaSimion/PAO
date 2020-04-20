package repository;
import model.Job;
import model.Oras;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import service.CitireService;
import service.OrasService;
public class OrasRepository {

    List<Oras> orase = new ArrayList<Oras>();

    public OrasRepository()  {
        CitireService in = new CitireService();
        List<String> dateIn = in.citireLista("fisiereIO/Oras.csv");
        for(String date : dateIn) {
            String[] v = date.split(",");
            String a0 = v[0];
            int a1 = Integer.parseInt(v[1]);
            orase.add(new Oras(a0, a1));
        }

        /*
        orase.add(new Oras("Bucuresti", 2));
        orase.add(new Oras("Budapesta", 4));
        orase.add(new Oras("Viena", 5));
        orase.add(new Oras("Berlin", 3));

         */
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

    public void scrie(){
        try {
            FileWriter out = new FileWriter("fisiereIO/Oras2.csv");
            for(Oras x : orase) {
                out.write(x.getNume() + ',' + x.getIndiceMinimPoluare() + "\r\n");
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Eroare");
            e.printStackTrace();
        }
    }

}
