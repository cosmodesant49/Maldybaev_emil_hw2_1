public class Bmw extends Car {

    private String steeringWheel;
    @Override
    public void printInfo(String Model, int year, Enum typeDriveWheels) {
        super.printInfo(Model, year, typeDriveWheels);
        if (steeringWheel != null) {
            System.out.println("Руль: " + steeringWheel);
        } else {
            System.out.println();
        }
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public Bmw(String model, int year, TypeDriveWheels typeDriveWheels, String steeringWheel) {
        super(model, year, typeDriveWheels);
        this.steeringWheel = steeringWheel;
    }

    public Bmw(String model, int year, TypeDriveWheels typeDriveWheels) {
        super(model, year, typeDriveWheels  );

    }
}
