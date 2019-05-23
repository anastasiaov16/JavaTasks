package modules;

import lombok.Data;

@Data
public class AuxiliaryTechique extends Technique {
    private String name;
    private int power;
    private boolean connection;
    private boolean goodCondition;
    private  boolean countOfspeed;
    private int cOfspeed;

    public AuxiliaryTechique(String name, int power, boolean connection, boolean goodCondition, boolean countOfspeed, int cOfspeed) {
        this.name = name;
        this.power = power;
        this.connection = connection;
        this.goodCondition = goodCondition;
        this.countOfspeed = countOfspeed;
        this.cOfspeed = cOfspeed;
    }
}
