package Section_2;

public class GarmentFactory {
    public Garments getclothsbyfabric(String fabric) {
        if (fabric == "cotton") {
            return new SummerCloths();
        } else if (fabric == "wool") {
            return new WinterCloths();
        } else if (fabric == "silk") {
            return new SpringCloths();
        }
        return null;
    }
    public Garments getclothsbySeasonname(String season){
        if (season== "Summer"){
            return new SummerCloths();
        } else if (season=="Winter") {
            return new WinterCloths();
        } else if (season=="Spring") {
            return new SpringCloths();
        }
        return null;
    }
    }

