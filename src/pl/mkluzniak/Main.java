package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {
        // inheritance = the process where one class acquires,
        //              the attributes and methods of another.
        Car car = new Car(); //creating object car
        //car.go();

        Bicycle bike = new Bicycle(); //creating object bicycle
        //bike.stop();
        System.out.println(car.doors); //printing unique attributes from their class
        System.out.println(bike.pedals);

    }
}
