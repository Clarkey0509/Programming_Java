
/**
 * The Car Class.
 *
 * @author Eoin Clarke
 * @version 1.0
 */
public class Car
{
    //Declaring fields
    private String carName = "";
    private double carDistance = 0.0f;
    private double carTotalKm = 0.0f;
    private double fuel = 0.0f;
    
    //Declaring reference fields
    private Engine engine;
    private Wheel wheel;
    
    public Car(String name)
    {
        carName = name;
    }
    
    //Mutator method for adding an Engine object to reference
    public void addEngine(Engine obj)
    {
        engine = obj;
    }
    
    //Mutator method for adding a Wheel object to reference
    public void addWheel(Wheel obj)
    {
        wheel = obj;
    }
    
    public void drive()
    {
        if (engine.getFuel() > 0)
        {
            //Given an amount of fuel, find the distance the car drives
            carDistance = engine.findTotalTurns() * wheel.turn(); 
            //Add this distance to the total distance this car has travelled
            carTotalKm += carDistance;
        }
        
        else
        {
            //State when the car has no fuel
            System.out.printf("No Fuel");
        }
    }
    
    public void printStatement()
    {
        //All details about the car, enigne and wheel
        System.out.printf("Car Model:" + getCarName() + "\n");
        System.out.printf("Engine Model:" + engine.getEngineName() + "\n");
        System.out.printf("Engine turns per Litre: %.2f\n", engine.getEngineTpl());
        System.out.printf("Engine total turn count: %.2f\n", engine.getTotalTurns());
        System.out.printf("Wheel name:" + wheel.getWheelName() + "\n");
        System.out.printf("Wheel radius: %.2f\n", wheel.getWheelRadius());
        System.out.printf("Wheel circumference (distance per turn): %.2f\n", wheel.turn());
        System.out.printf("Distance this trip %.2f\n", getCarDistance());
        System.out.printf("Total distance travelled: %.2f\n\n", getCarTotalKm());
    }
    
    //All the accessor methods
    public String getCarName()
    {
        return carName;
    }
    
    public double getCarDistance()
    {
        return carDistance;
    }
    
    public double getCarTotalKm()
    {
        return carTotalKm;
    }
}
