package bike;

public class Bike {

    private String switchOn = "on";
    private String switchOff = "off";
    private int gear1 = 20;
    private int gear2 = 30;
    private int gear3 = 40;
    private int gear4 = 41;

    public String getSwitchOn(String onSwitch) {
        if(switchOn.equalsIgnoreCase(onSwitch)) {
            return switchOn;
        }
        else return switchOff;
    }

    public int gearing1(int gear1){
        int acceleration1 = 15;
        if(acceleration1 <= this.gear1) {
            return acceleration1 = acceleration1 + gear1;
        }
        else return acceleration1;
    }

    public int gearing2(int gear2){
        int acceleration2 = 24;
        if(acceleration2 >= 21 && acceleration2 <= this.gear2) {
            return acceleration2 = acceleration2 + gear2;
        }
        else return acceleration2;
    }

    public int gearing3(int gear3){
        int acceleration3 = 35;
        if(acceleration3 >= 31 && acceleration3 <= this.gear3) {
            return acceleration3 = acceleration3 + gear3;
        }
        else return acceleration3;
    }

    public int gearing4(int gear4){
        int acceleration4 = 44;
        if(acceleration4 >= this.gear4) {
            return acceleration4 = acceleration4 + gear4;
        }
        else return acceleration4;
    }

    public int gearingDown1(int geardown1){
        int decceleration1 = 15;
        if(decceleration1 <= this.gear1) {
            return decceleration1 = decceleration1 - geardown1;
        }
        else return decceleration1;
    }

    public int gearingDown2(int geardown2){
        int decceleration2 = 24;
        if(decceleration2 >= 21 && decceleration2 <= this.gear2) {
            return decceleration2 = decceleration2 - geardown2;
        }
        else return decceleration2;
    }

    public int gearingDown3(int geardown3){
        int decceleration3 = 35;
        if(decceleration3 >= 31 && decceleration3 <= this.gear3) {
            return decceleration3 = decceleration3 - geardown3;
        }
        else return decceleration3;
    }

    public int gearingDown4(int geardown4){
        int decceleration4 = 44;
        if(decceleration4 >= 41) {
            return decceleration4 = decceleration4 - geardown4;
        }
        else return decceleration4;
    }
}
