    public class Car extends Transport {
    private int released;
        private TypeDriveWheels typeDriveWheels;

        public Car(String model, int year, TypeDriveWheels typeDriveWheels) {
            super(model, year);
            this.typeDriveWheels = typeDriveWheels;
        }

        public TypeDriveWheels getTypeDriveWheels() {
            return typeDriveWheels;
        }
            public void printInfo(String Model,int year,Enum typeDriveWheels) {
                System.out.println("Модель: " + getModel() + ", Год: " + getYear() + ", привод: " + typeDriveWheels );

        }
            public final void printInfo(String Model,int year){
                System.out.println("Модель: " + getModel() + ", Год: " + getYear());

        }
    }
