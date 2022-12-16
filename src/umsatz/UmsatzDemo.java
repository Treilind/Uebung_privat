package umsatz;

public class UmsatzDemo {

    public static void main(String[] args) {
        
        double[] monatlicheUmsaetze = {300, 600, 500, 800, 850, 700, 300, 1000};

        System.out.println("getUmsatzsteigerungGT10(monatlicheUmsaetze) = " + getUmsatzsteigerungGT10(monatlicheUmsaetze));
    }
    
    
    public static int getUmsatzsteigerungGT10(double[] umsaetze){
        int umsatzplus = 0;
        
        for (int i = 0; i < umsaetze.length; i++) {
            if (i == 0){
                umsatzplus = 0;
            }
            else {
                if (umsaetze[i] > umsaetze[i-1]*1.1 ){
                    umsatzplus++;
                }
            }
        }
        return umsatzplus;
    }


}
