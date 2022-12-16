package uebungtest1.rekursion;

import java.util.ArrayList;

public class Ort {
    private String name;
    private ArrayList<Ort> nachbarn;

    public Ort(String name) {
        this.name = name;
        this.nachbarn = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNachbar(Ort neuerNachbar){
        this.nachbarn.add(neuerNachbar);
    }

    public boolean hasCircle(Ort o){

        if (o.nachbarn.size() == 0){
            return false;
        }



        return false;
    }
}
