package television;

public class Television {

    private String powerKey = "on";
    private String powerKey2 = "off";
    private int increase = 0;
    private int channel = 0;

    public String switchOnTelevision(String keySwitch) {
        if (this.powerKey.equalsIgnoreCase(keySwitch)) return powerKey;
        else return powerKey2;
    }

    public int increasing(int increase){
        increase = 1;
        if(this.increase <= 10) {
            return this.increase += increase;
        }
        else return 10 - increase;
    }

    public int changing(int change){
        change = 1;
        if(this.channel <= 5) {
            return this.channel += change;
        }
        else return 5 - change;
    }

}
