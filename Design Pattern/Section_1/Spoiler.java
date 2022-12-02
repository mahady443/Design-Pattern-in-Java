package Section_1;

public class Spoiler extends CarDecorator{
    public Spoiler(Car decoratedcar) {
        super(decoratedcar);
    }
    public void topSpeed(){
        decoratedcar.topSpeed();
        System.out.println("By Adding Spoiler Car Speed Is decreased By 5 KMH");
    }
    public void deacceleration_rate(){
        decoratedcar.deacceleration_rate();
        System.out.println("By Adding Spoiler Car accelerator Increased  by 2ms");
    }
}
