package static2.ex;

public class Car {
    String carName;
    static int carCount;

    public Car(String carName) {
        this.carName = carName;
        System.out.println("차량 구입, 이름: " + carName);
        carCount++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + carCount);
    }
}
