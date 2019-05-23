package modules;

import lombok.Data;

@Data
public abstract class Technique {
    private String name;
    private int power;
    private boolean connection;
    private boolean goodCondition;

}
