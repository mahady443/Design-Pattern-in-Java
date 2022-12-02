package Section_1;

public  abstract class CarDecorator implements Car{
    protected Car decoratedcar;
    public CarDecorator(Car decoratedcar){
        this.decoratedcar=decoratedcar;
    }

    @Override
    public void topSpeed() {
        decoratedcar.topSpeed();
    }

    @Override
    public void deacceleration_rate() {
        decoratedcar.deacceleration_rate();
    }
}
