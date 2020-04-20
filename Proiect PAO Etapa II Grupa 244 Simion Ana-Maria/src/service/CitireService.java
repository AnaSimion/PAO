package service;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CitireService {

    public List<String> citireLista(String in) {
        String linie = "";
        List<String> dateNeprelucrate = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader(in))) {

            while ((linie = br.readLine()) != null) {
                dateNeprelucrate.add(linie);

            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }
return dateNeprelucrate;
    }

}
