/**
 * The Wheel Class.
 *
 * @author Eoin Clarke
 * @version 1.0
 */
public class Wheel
{
    //Declaring all fields
    private double wheelRadius = 0.0f;
    private String wheelName = "";
    
    public Wheel(String name, double r)
    {
        wheelRadius = r;
        wheelName = name;
    }
    
    public double turn()
    {
        //Finding the distance in one turn
        double circumference = 2 * Math.PI * wheelRadius;
        return circumference;
    }
        
    //All the accessor methods
    public String getWheelName()
    {
        return wheelName;
    }
    
    public double getWheelRadius()
    {
        return wheelRadius;
    }
}
