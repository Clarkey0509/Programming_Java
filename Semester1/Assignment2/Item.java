
/**
 * Write a description of class Item here.
 *
 * @author Eoin Clarke
 * @version V1
 */
public class Item
{
    private String name; //Creating fields//
    private double price;
    private long itemId;
    
    public Item(String itemName, long id)
    {
        name = itemName; //Setting fields when object is created//
        itemId = id;
    }
    
    public void setPrice(double price)
    {
        this.price = price; //Setting the Item's Price//
    }
    
    public double getPrice()
    {
        return price; //Getting the Item's Price//
    }
    
    @Override
    public String toString()
    {
        String out = "Item Id: " + itemId + "\t" + name + "\tPrice: €" + price; //Converting all the Item's Details into one String//
        return out;
    }
}
