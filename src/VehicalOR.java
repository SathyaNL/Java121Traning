public class VehicalOR {
    void run(){
        System.out.println("Starting");
}
}

class Bike extends VehicalOR{

}

class Car extends Bike {
    public static void main(String args[]) {
        VehicalOR v = new Car();
        Bike bike  = new Bike();
        bike.run();
        v.run();
    }
}
