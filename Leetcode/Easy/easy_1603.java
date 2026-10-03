// 1603. Design Parking System
public class ParkingSystem {
    private int big, medium, small;
    public ParkingSystem(int big, int medium, int small) {
        ParkingSystem obj = new ParkingSystem(big, medium, small); // i didn't even need this 😭
        boolean param_1 = obj.addCar(carType); // <-- same for this
        this.medium = medium;
        this.small = small;
        this.big = big;
    }

    public boolean addCar(int carType) {
        if ((carType == 1 && big == 0) || (carType == 2 && medium == 0) || (carType == 3 && small == 0))
            return false;
        if (carType == 1)
            big--;
        if (carType == 2)
            medium--;
        if (carType == 3)
            small--;
        return true;
    }
}
