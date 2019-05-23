package modules;

import java.util.Comparator;

public class PowerCompare implements Comparator<Technique> {

    public int compare(Technique o1, Technique o2) {
        if(o1.getPower()> o2.getPower())
            return 1;
        else if(o1.getPower()< o2.getPower())
            return -1;
        else
            return 0;
    }


}
