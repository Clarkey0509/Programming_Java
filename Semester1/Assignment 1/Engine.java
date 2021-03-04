
/**
 * The Engine .
 *
 * @author Eoin Clarke
 * @version 1.0
 */
public class Engine
{
    //Declaring all fields
    private String engineName = "";
    private double engineTpl = 0.0f;
    private double totalNumTurns = 0;
    private double fuelLevel = 0;
    
    public Engine(String name, double tpl)
    {
        engineName = name;
        engineTpl = tpl;
    }
    
    public void setFuel(double fuel)
    {
        //Input for how much fuel is in the engine
        if (fuel > 0)
        {
            fuelLevel = fuel;
        }
        else
        {
            System.out.println("Invalid fuel level!");
        }
    }

    public double findTotalTurns()
    {
        //Find the total turns possible given an amount of fuel
        totalNumTurns = engineTpl * fuelLevel;
        return totalNumTurns;
    }
    
    //All the accessor methods
    public String getEngineName()
    {
        return engineName;
    }
    
    public double getEngineTpl()
    {
        return engineTpl;
    }
    
    public double getTotalTurns()
    {
        return totalNumTurns;
    }
    
    public double getFuel()
    {
        return fuelLevel;
    }
}    
