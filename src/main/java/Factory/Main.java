package Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car newCar = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of car? (Toyota / BMW / BmwM)");
        if (userInput.hasNextLine()){
            String typeOfCar = userInput.nextLine();
            newCar = carFactory.makeCar(typeOfCar);
        }
        if (newCar != null){
            doCarStuff(newCar);
        } else System.out.println("Next time enter a Toyota, BMW or BmwM");
    }

    private static void doCarStuff(Car newCar) {
        newCar.drive();
        newCar.stop();
    }
}
