package ultimativerUebungstest1.rekursion;

import java.util.ArrayList;

public class Ort {

    private String name;
    private ArrayList<Ort> nachbarn = new ArrayList<>();

    public Ort(String name) {
        this.name = name;
    }

    public void addNachbar(Ort o){
        nachbarn.add(o);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ort> getNachbarn() {
        return nachbarn;
    }


}
