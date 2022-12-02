package Section_1;

public class Main {
    public static void main(String[] args) {
        Car car1= new Bugatti();
       Car car1nitro= new Nitro(new Bugatti());
        System.out.println("-------- Adding Nitro In The Car -----------");
       car1nitro.topSpeed();
       car1nitro.deacceleration_rate();
       Car car1Spoiler= new Spoiler(new Bugatti());
        System.out.println("-------- Adding Spoiler In The Car -----------");
       car1Spoiler.topSpeed();
       car1Spoiler.deacceleration_rate();
       Car car1Sunroof = new SunRoof(new Bugatti());
        System.out.println("-------- Adding RoofTop In The Car -----------");
       car1Sunroof.topSpeed();
       car1Sunroof.deacceleration_rate();

    }
}
