package Wasserstand;

import java.util.ArrayList;

public class WasserstandManager {

    private ArrayList<Wasserstand> wasserstaende;

    public WasserstandManager () {
        wasserstaende = new ArrayList<>();
    }

    public void add (Wasserstand newWasserstand) {
        wasserstaende.add(newWasserstand);
    }

    public void print (){
        for (Wasserstand w : wasserstaende) {
            System.out.println("w = " + w);
        }
    }

    public Wasserstand findById(int id) {
        for (Wasserstand w : wasserstaende) {
            if (w.getId() == id){
                return w;
            }
        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName) {
        ArrayList<Wasserstand> gewaesserListe = new ArrayList<>();

        for (Wasserstand w : wasserstaende) {
            if (w.getGeweasserName().equals(gewaesserName)){
                gewaesserListe.add(w);
            }
        }
        return gewaesserListe;
    }



}
