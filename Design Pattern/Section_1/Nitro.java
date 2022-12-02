package Section_1;

public class Nitro extends CarDecorator{
    public Nitro(Car decoratedcar) {
        super(decoratedcar);
    }
    public void topSpeed(){
        decoratedcar.topSpeed();
        System.out.println("By Adding Nitro Car Speed Is Increased By 20 KMH");
    }
    public void deacceleration_rate(){
        decoratedcar.deacceleration_rate();
        System.out.println("By Adding Nitro Car accelerator is decreased by 1ms");
    }
}
