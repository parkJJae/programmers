package park.parkingfee;

public class Car implements Vehicle{

    @Override
    public int calculateParkingFee(int hours) {
        return 1000*hours;
    }
}
