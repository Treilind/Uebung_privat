package Wasserstand;

public class WasserstandDemo {
    public static void main(String[] args) {
        Wasserstand stand1 = new Wasserstand(1, "Safen", 10, 30, 500);
        Wasserstand stand2 = new Wasserstand(2, "Safen", 7, 30, 8758);
        Wasserstand stand3 = new Wasserstand(3, "Mur", 20, 50, 500);
        Wasserstand stand4 = new Wasserstand(4, "Mur", 55, 50, 104545785);
        Wasserstand stand5 = new Wasserstand(5, "Safen", 15, 30, 786785782);

        WasserstandManager manager = new WasserstandManager();

        manager.add(stand1);
        manager.add(stand2);
        manager.add(stand3);
        manager.add(stand4);
        manager.add(stand5);

        System.out.println("manager.findById(3) = " + manager.findById(3));

        System.out.println("manager.findAllByGewaesser(\"Safen\") = " + manager.findAllByGewaesser("Safen"));



    }
}
