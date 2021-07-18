package Factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarFactoryTest {

    private CarFactory carFactory = new CarFactory();

    @Test
    public void makingNewToyotaCar_whenCheckIfIsInstaceOfCar_shouldReturnTrue(){
        Car toyotaCar = carFactory.makeCar("Toyota");
        assertTrue(toyotaCar instanceof Car);
    }

    @Test
    public void makingNewBMWCar_whenCheckIfIsInstaceOfCar_shouldReturnTrue(){
        Car bmwCar = carFactory.makeCar("BMW");
        assertTrue(bmwCar instanceof Car);
    }

    @Test
    public void makingNewBmwMCar_whenCheckIfIsInstaceOfCar_shouldReturnTrue(){
        Car bmwMCar = carFactory.makeCar("BmwM");
        assertTrue(bmwMCar instanceof Car);
    }
}
