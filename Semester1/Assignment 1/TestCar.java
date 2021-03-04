
/**
 * Testcar. For testing purposes using the given example.
 *
 * @author Eoin Clarke
 * @version 1.0
 */
public class TestCar
{
    public static void main(String[] args)
    {
        //Example
        Car car = new Car("X7");
        Engine engine = new Engine("DR9", 43);
        car.addEngine(engine);
        Wheel wheel = new Wheel("Wichelin15", 15);
        car.addWheel(wheel);
        engine.setFuel(100);
        System.out.printf("Current fuel: %.2f\n",engine.getFuel());
        car.drive();
        car.printStatement();
        engine.setFuel(50);
        System.out.printf("Current fuel: %.2f\n",engine.getFuel());
        car.drive();
        car.printStatement();
    }
}
