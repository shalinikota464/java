class Bike {
    void showBike() {
        System.out.println("BMW");
    }
}

class SportsBike extends Bike {
    void showBike() {
        System.out.println("Royal Enfield");
    }
}

public class Vehicles {
    public static void main(String[] args) {

        Bike b = new Bike();
        b.showBike();

        SportsBike s = new SportsBike();
        s.showBike();

        Bike b1 = new SportsBike(); 
        b1.showBike(); 
    }
}