
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.color = "검정색";
        car.model = "아반떼";

        System.out.println("나의 자동차는"+car.model+"이며 색상은"+car.color+"입니다.");
        car.moveForward();
        car.moveBackward();
        car.openWindow();

        bike.moveForward();
        bike.moveBackward();
        bike.stunt();
    }
}