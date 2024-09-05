package ac_test_scenerio;

public class AirConditioner {
    private final int on = 1;
    private final int off = 0;
    private int temp;

    public AirConditioner(int temp) {
        this.temp = temp;
    }

    private boolean isAcOn(int on){
        return on == this.on;
    }

    private boolean isAcOff(int off){
        return off == this.off;
    }

    public int getOn(int on) {
        if(isAcOn(on)) return on;
        else return off;
    }

    public int getOff(int off) {
        if(isAcOff(off)) return off;
        return on;
    }

    private boolean isAcTemperatureEqualToSixteenOrMore(int temp){
        return temp >= 16;
    }

    private boolean isAcTemperatureEqualToThirtyOrLess(int temp){
        return temp <= 30;
    }

    private boolean isAcTempMoreThan30(int temp){
        return temp > 30;
    }

    private boolean isAcTempLessThan16(int temp){
        return temp < 16;
    }

    public void setTemp(int temp) {
        if(isAcTempLessThan16(temp))
            this.temp = 16;
        else if(isAcTemperatureEqualToSixteenOrMore(temp) && isAcTemperatureEqualToThirtyOrLess(temp))
            this.temp = temp;
        else if(isAcTempMoreThan30(temp))
            this.temp = 30;
    }

    public int getTemp() {
        return temp;
    }

    public int getDecrease(int temp) {
        if(isAcTemperatureEqualToSixteenOrMore(temp) && isAcTemperatureEqualToThirtyOrLess(temp))
            return temp;
        return 16;
    }



}
