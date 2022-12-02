package Section_1;

public class Porsche implements Car {
    int speed;
    int deacceleration;
    @Override
    public void topSpeed() {
        speed=280;
        System.out.println("The Car Speed is "+ speed+ "KM/H");
    }

    @Override
    public void deacceleration_rate() {
        deacceleration = (speed*8)/100;
        System.out.println("The deacceleration of car is "+ deacceleration + "KM/H");
    }
}

