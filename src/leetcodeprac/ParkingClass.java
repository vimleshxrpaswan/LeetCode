package leetcodeprac;

class  ParkingSystem {
   int small,big,medium;
    public ParkingSystem(int big, int medium, int small) {

        this.big =big;
        this.small=small;
        this.medium=medium;

    }
    public boolean addCar(int carType) {
        if (carType==1) {
            if (big == 0)
                return false;
            big--;
        }
        if (carType==2) {
            if (medium == 0)
                return false;
            medium--;
        }
        if (carType==3){
            if (small==0)
                return false;
            small--;
        }
        return true;

        }
}

class ParkingClass {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1,1,0);
        boolean param_1 = parkingSystem.addCar(1);
        boolean param_2 = parkingSystem.addCar(2);
        boolean param_3 = parkingSystem.addCar(3);
        boolean param_4 = parkingSystem.addCar(1);
        System.out.println(param_1+ " : "+param_2+ " : "+ param_3+ " : "+param_4);

    }

}