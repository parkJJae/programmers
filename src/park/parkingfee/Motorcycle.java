package park.parkingfee;

public class Motorcycle implements Vehicle {

    @Override
    public int calculateParkingFee(int hours) {
        return 500*hours;
    }
}
