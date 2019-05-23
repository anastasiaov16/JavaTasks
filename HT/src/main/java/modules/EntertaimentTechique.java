package modules;

import lombok.Data;

@Data
public class EntertaimentTechique extends Technique {
    private String name;
    private int power;
    private boolean connection;
    private boolean goodCondition;
    private boolean screenDiagonal;
    private double scrD;
    private boolean internetAccess;
    private boolean headphoneJack;
    private boolean USBConnector;

    public EntertaimentTechique(String name, int power, boolean connection, boolean goodCondition, boolean screenDiagonal, double scrD, boolean internetAccess, boolean headphoneJack, boolean USBConnector) {
        this.name = name;
        this.power = power;
        this.connection = connection;
        this.goodCondition = goodCondition;
        this.screenDiagonal = screenDiagonal;
        this.scrD = scrD;
        this.internetAccess = internetAccess;
        this.headphoneJack = headphoneJack;
        this.USBConnector = USBConnector;
    }
}
