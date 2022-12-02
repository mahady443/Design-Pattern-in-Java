package Section_1;
public class Bugatti  implements Car{
  int speed;
    int deacceleration;
    @Override
    public void topSpeed() {
    speed=340;
        System.out.println("The Actual Car Speed is "+ speed+ "KM/H");
    }

    @Override
    public void deacceleration_rate() {
        deacceleration = (speed*8)/100;
        System.out.println("The  Actual deacceleration of car is "+ deacceleration + "KM/H");
    }
}
