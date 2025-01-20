package park.parkingfee;

public class Truck implements Vehicle {

    @Override
    public int calculateParkingFee(int hours) {
        return 1500*hours;
    }
}
