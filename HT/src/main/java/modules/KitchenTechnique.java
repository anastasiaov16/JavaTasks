package modules;

import lombok.Data;

@Data
public class KitchenTechnique extends Technique {
    private String name;
    private int power;
    private boolean connection;
    private boolean goodCondition;
    private boolean countOfburners;
    private int cOfburners;
    private boolean countOfspeed;
    private int cOfspeed;
    private boolean countOfStorageRoom;
    private int cOfStRoom;

    public KitchenTechnique(String name, int power, boolean connection, boolean goodCondition, boolean countOfburners, int cOfburners, boolean countOfspeed, int cOfspeed, boolean countOfStorageRoom, int cOfStRoom) {
        this.name = name;
        this.power = power;
        this.connection = connection;
        this.goodCondition = goodCondition;
        this.countOfburners = countOfburners;
        this.cOfburners = cOfburners;
        this.countOfspeed = countOfspeed;
        this.cOfspeed = cOfspeed;
        this.countOfStorageRoom = countOfStorageRoom;
        this.cOfStRoom = cOfStRoom;
    }
}
