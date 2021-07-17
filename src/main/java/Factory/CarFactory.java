package Factory;

public class CarFactory {

    public Car makeCar(String newCarType){
        Car car = null;
        if (newCarType.equalsIgnoreCase("BMW")){
            return new BMW();
        } else if (newCarType.equalsIgnoreCase("BmwM")){
            return new BmwM();
        } else if (newCarType.equalsIgnoreCase("Toyota")){
            return new Toyota();
        }
        return car;
    }
}
