package park.parkingfee;

public class ParkingFeeMain {
    public static void main(String[] args) {
    Vehicle car = new Car();
    int fee = car.calculateParkingFee(2);
        System.out.println("Car fee: " + fee + "원");
    }
}
