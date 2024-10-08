package aircondition;

public class AirCondition {

    private String powerOn = "on";
    private String powerOff = "off";
    private int increase = 16;

    public String checkAircondition(String powerKey) {
        if(this.powerOn.equalsIgnoreCase(powerKey))  return powerOn;
        else return powerOff;
    }

    public int increment(int increase) {
        boolean incrementEqualsToOne = increase == 1;
        if(incrementEqualsToOne) return this.increase += increase;
            else return this.increase;
    }

    public int decrement(int decrease) {
        boolean decrementEqualsToOne = decrease == 1;
        if(decrementEqualsToOne) return this.increase - decrease;
        else return this.increase;
    }

    public int increase(int increase) {
        increase = 1;
        if(this.increase <= 30) {
            this.increase += increase;
            return this.increase;
        }
                else return this.increase;
    }

    public int decrease() {
        boolean increasementLessThanOrEqualsToSixteen = this.increase <= 6;
        if(increasementLessThanOrEqualsToSixteen) return this.increase;
        else return this.increase;
    }

}
