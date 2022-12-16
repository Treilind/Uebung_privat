package org.campus02.covidreporting;

import java.util.ArrayList;
import java.util.HashMap;

public class CovidManager {

    private ArrayList<Incidence> recordedValues;

    public CovidManager(ArrayList<Incidence> recordedValues) {
        this.recordedValues = recordedValues;
    }

    public HashMap<String, Integer> groupByState() {
        HashMap<String, Integer> result = new HashMap<>();

        // TODO: Je Bundesland soll die Anzahl (Incidence.getNumber()) der Fälle ermittelt werden

        for (Incidence i : recordedValues) {
            if(result.containsKey(i.getState())) {
                int newIncidents = i.getNumber() + result.get(i.getState());
                result.put(i.getState(),newIncidents);
            }
            else {
                result.put(i.getState(), i.getNumber());
            }

        }

        return result;
    }

    public HashMap<String, Integer> groupByDate() {
        HashMap<String, Integer> result = new HashMap<>();
        // TODO: Je Tag (getDate()) soll die Anzahl (Incidence.getNumber()) der Fälle ermittelt werden

        for (Incidence i : recordedValues) {
            if(result.containsKey(i.getDate())) {
                int newIncidents = i.getNumber() + result.get(i.getDate());
                result.put(i.getDate(),newIncidents);
            }
            else {
                result.put(i.getDate(), i.getNumber());
            }
        }

        return result;
    }

    public int findHighestValue() {
        // TODO: Es soll der höchste gemeldete Wert (Incidence.getNumber()) gefunden werden
        int highestValue = 0;

        for (Incidence i : recordedValues) {
            highestValue = Math.max(i.getNumber(), highestValue);
        }

        return highestValue;
    }

    public int getAverageValueAfter(String date) {
        /* TODO: Es soll der durchschnittliche Wert nach einem
            bestimmten Datum gefunden werden. date ist beispielsweise 2021-08-01 */
        int sumUp = 0;
        int counter = 0;

        for (Incidence i : recordedValues) {
            if(i.getDate().equals(date)) {
                sumUp += i.getNumber();
                counter++;
            }
        }

        return (counter != 0) ? sumUp/counter : 0;
    }

    public Incidence findIncidenceWithHighestValues() {
        /* TODO: Es soll die Meldung (Incidence)
        mit dem höchsten Wert gefunden werden. Tipp: Es gibt schon eine Methode,
        die eventuell einen kleinen Teil erledigt*/

        int highestValue = this.findHighestValue();

        for (Incidence i : recordedValues) {
            if (i.getNumber() == highestValue) {
                return i;
            }
        }


        return null;
    }

    public HashMap<String, ArrayList<Incidence>> getAllElementsToState() {
        // TODO: Alle Elemente je Bundesland retour liefern
        ArrayList<Incidence> sumIncidence = new ArrayList<>();
        HashMap<String, ArrayList<Incidence>> result = new HashMap<>();

        for (Incidence i : recordedValues) {


        }

        return null;
    }

    public ArrayList<Incidence> findValuesAbove(int referenceValue) {
        ArrayList<Incidence> result = new ArrayList<>();
        // TODO: Alle Werte über dem Referenzwert sollen retour geliefert werden

        for (Incidence i : recordedValues) {
            if(i.getNumber() > referenceValue){
                result.add(i);
            }
        }

        return result;
    }
}
