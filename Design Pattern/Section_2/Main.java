package Section_2;

public class Main {
    public static void main(String[] args) {
    GarmentFactory garmentfactory=new GarmentFactory();
    Garments cloth1= garmentfactory.getclothsbyfabric("silk");
        System.out.println("-----------Call by Fabric Name------------");
    cloth1.cloths();
    Garments cloth2= garmentfactory.getclothsbySeasonname("Winter");
        System.out.println("-----------Call by Season Name------------");
    cloth2.cloths();
    }
}
