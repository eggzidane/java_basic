package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        Gascar gascar = new Gascar();
        gascar.move();
        gascar.fillup();

    }
}
