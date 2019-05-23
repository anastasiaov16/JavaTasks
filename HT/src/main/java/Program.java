import modules.*;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Technique iron = new AuxiliaryTechique("Iron", 200, true, true, true, 3);
        Technique TV = new EntertaimentTechique("TV", 250, false, true, true, 13.5, true, false, true);
        Technique refregerator = new KitchenTechnique("Refregerator", 220, true, true, false, 0, false, 0, true, 2 );

        PowerCompare pc = new PowerCompare();
        ArrayList<Technique> flat = new ArrayList<Technique>();

        flat.add(iron);
        flat.add(TV);
        flat.add(refregerator);

        flat.sort(pc);

        System.out.println("Sorted by power: ");
        for (Technique h: flat) {
            System.out.println(h.getName() + " " + h.getPower());
        }
    }
}
