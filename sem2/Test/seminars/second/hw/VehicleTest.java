package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Company", "Model", 2021);
        Assertions.assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Company", "Model", 2021);
        Assertions.assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2021);
        Assertions.assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeedAfterTestDrive() {
        Car car = new Car("Company", "Model", 2021);
        car.testDrive();
        Assertions.assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedAfterTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2021);
        motorcycle.testDrive();
        Assertions.assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarSpeedAfterPark() {
        Car car = new Car("Company", "Model", 2021);
        car.testDrive();
        car.park();
        Assertions.assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedAfterPark() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        Assertions.assertEquals(0, motorcycle.getSpeed());
    }
}