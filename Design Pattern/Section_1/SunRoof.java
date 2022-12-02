package Section_1;

public class SunRoof extends CarDecorator{
    public SunRoof(Car decoratedcar) {
        super(decoratedcar);
    }
    public void topSpeed(){
        decoratedcar.topSpeed();
        System.out.println("By Adding Sunroof Car Speed Not Increased ");
    }
    public void deacceleration_rate(){
        decoratedcar.deacceleration_rate();
        System.out.println("By Adding Sunroof Car accelerator is Not Decreased");
    }
}
