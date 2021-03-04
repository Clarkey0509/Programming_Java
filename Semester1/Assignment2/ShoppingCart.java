
/**
 * Write a description of class ShoppingCart here.
 *
 * @author Eoin Clarke
 * @version V1
 */
import java.util.ArrayList;

public class ShoppingCart
{
    //Creating fields//
    private long cartId; 
    private String time = ""; 
    private ArrayList<Item> items = new ArrayList<Item>();
    private double total;
    private Customer customer;
    private boolean isClosed = false;
    
    public ShoppingCart(long id, String time)
    {
        //Setting fields when object is created//
        cartId = id; 
        this.time = time;
    }
    
    public void add(Customer customer)
    {
        this.customer = customer; //Adding the Customer Object//
    }
    
    public long getCartId()
    {
        return cartId; //Getting ShoppingCart ID//
    }
    
    public double getTotal()
    {
        return total; //Getting the Total Cost of Items//
    }
  
    public String getEmailAddress()
    {
        return customer.getEmail(); //Getting the Customer's Email address//
    }
    
    public String getName()
    {
        String str = customer.getFirstName() + " " + customer.getSurName(); //Getting the Customer's full Name//
        return str;
    }
    
    public long getCustomerId()
    {
        return customer.getId(); //Getting the Customer's ID//
    }

    public Item addItem(Item item)
    {
        if(!isClosed) //Checks to see if the ShoppingCart is Closed//
        {
            items.add(item); //If not, add the Item//
            total += item.getPrice(); //Add the Item's Price to the Total//
        }
        
        else
        {
            System.out.println("Cart is closed"); //If closed, print statement//
        }
        return item;
    }
    
    public void removeItem(String itemName)
    {
        int i = 0;
        boolean found = false;
        while(i < items.size() && !found) //Checks the entire item array for the item that is being deleted//
        {
            Item item = items.get(i); //Current Item object is the current item in the array//
            if(item.toString().contains(itemName)) //Checks if it contains the query name//
            {
                found = true; //If item found, remove item from array//
                items.remove(i);
                //System.out.println("aaaaa");// //This was me testting the remove method//
                break;
            }
            
            else
            {
                i++; //If not found, check next//
            }
        }
    }
    
    public String printItems()
    {
        String list = "\n"; //Print all Items as a string//
        
        for(Item item: items) 
        {
            list += item.toString();
            list += "\n";
        }
        
        return list;
    }
    
    public boolean close()
    {
        if(!isClosed) //Check if it is not closed//
        {
            isClosed = true; //If not closed, close//
            return true;
        }
        return false; //If closed, ignore//
    }
    
    public boolean clear()
    {
        if(items != null) //Check if Items is empty// 
        {
            items.clear(); //If has something, clear//
        }
        return false; //If 
    }
}
