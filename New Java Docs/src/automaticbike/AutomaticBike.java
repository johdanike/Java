package automaticbike;

public class AutomaticBike {
    private boolean isOn = false;
//    private int powerOn = 1;
//    private int powerOff = 0;
    private int speed = 0;
    private int gear = 1;
//
//    public AutomaticBike(int gear, int speed) {
//        this.speed = speed;
//        this.gear = gear;
//    }

//    public int getPowerOn() {
//        return powerOn;
//    }

    public void turnOnBike() {
        this.isOn = true;
    }

    public void turnOffBike() {
        this.isOn = false;
    }

    public boolean getIsOn() {
        return isOn;
    }

//    public void setPowerOff(int powerOff) {
//        this.powerOff = powerOff;
//    }

//    public int getSpeed() {
//        return speed;
//    }
//
//
//    public int getGear() {
//        return gear;
//    }
//
//    public int setGearAccel(int gear) {
//        this.gear = gear;
//        return gear;
//    }
//
//    public int setGearDecel(int gear){
//        return gear;
//    }

//    public int setAccel(int accel) {
//        if(getPowerOn() == 1 ) {
//            int gear = accel + 1;
//            if (accel > 0 && accel <= 20) this.gear += 1;
//            else if (accel > 21 && accel < 30) this.gear += 2;
//            else if (accel > 31 && accel < 40) this.gear += 3;
//            else if (accel > 41 ) this.gear += 4;
//        }
//        return accel;
//    }
    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear() {
        if(speed > 0 && speed <= 20) gear = 1;
        else if(speed > 20 && speed <= 30) gear = 2;
        else if(speed > 30 && speed <= 40) gear = 3;
        else if(speed > 40 ) gear = 4;
    }

    public void setAccelerate() {
        if (isOn) {
            if(gear == 1)speed += 1;
            if(gear == 2)speed += 2;
            if(gear == 3)speed += 3;
            if(gear == 4)speed += 4;
        }
        setGear();
    }

    public void setDecelerate() {
        if (!isOn) {
            if(gear == 1)speed -= 1;
            if(gear == 2)speed -= 2;
            if(gear == 3)speed -= 3;
            if(gear == 4)speed -= 4;
        }
        setGear();
    }

//    public int setDeccel(int decel) {
//        if(getPowerOn() == 1 ) {
//            int gear = decel - 1;
//            if (decel > 0 && decel <= 20) this.gear -= 1;
//            else if (decel > 21 && decel < 30) this.gear -= 2;
//            else if (decel > 31 && decel < 40) this.gear -= 3;
//            else if (decel > 41 ) this.gear -= 4;
//        }
//        return decel;
//    }
}


