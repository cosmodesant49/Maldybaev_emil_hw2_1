// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car objectA = new Car("bmw x5", 22, TypeDriveWheels.AWD);
        Bmw objectB = new Bmw("BMW X5 M", 23, TypeDriveWheels.RWD, "Левый руль");
        Bmw objectC = new Bmw("BMW X5 Hybrid", 21, TypeDriveWheels.AWD);

        // ---
        System.out.println("Свойства объекта objectA:");
        System.out.println("Модель: " + objectA.getModel());
        System.out.println("Год: " + objectA.getYear());
        System.out.println("Тип привода: " + objectA.getTypeDriveWheels());
        System.out.println();

        // ---
        System.out.println("Свойства объекта objectB:");
        System.out.println("Модель: " + objectB.getModel());
        System.out.println("Год: " + objectB.getYear());
        System.out.println("Тип привода: " + objectB.getTypeDriveWheels());
        System.out.println("Руль: " + objectB.getSteeringWheel());
        System.out.println();

        //---
        System.out.println("Свойства объекта objectC:");
        System.out.println("Модель: " + objectC.getModel());
        System.out.println("Год: " + objectC.getYear());
        System.out.println("Тип привода: " + objectC.getTypeDriveWheels());
        System.out.println();


        // ---
        objectA.printInfo("BMW X5", 2022, TypeDriveWheels.AWD);
        objectB.printInfo("BMW X5 M", 2023, TypeDriveWheels.RWD);
        objectC.printInfo("BMW X5 Hybrid", 2021, TypeDriveWheels.AWD);
    }
}