
/**
 * Write a description of class Order here.
 *
 * @author Eoin Clarke
 * @version V1
 */

public class Order
{
    private long orderId; //Creating fields//
    private ShoppingCart cart;
    private String details;
    private Address deladdress;
    private Address billaddress;
    
    public Order(long id)
    {
        orderId = id; //Setting field when object is created//
    }

    public void add(ShoppingCart cart)
    {
        this.cart = cart; //adding ShoppingCart object//
    }
    
    public void addDelAddress(Address deladdress)
    {
        this.deladdress = deladdress; //Adding delivery Address object//
        
        if(billaddress == null)
        {
            billaddress = deladdress; //If there is no billing Address, make it delivery Address by default//
        }
    }
    
    public void addBillAddress(Address billaddress)
    {
        this.billaddress = billaddress; //Adding billing Address object//
    }
    
    public String getDetails()
    {
        details = "Customer ID: " + cart.getCustomerId() + cart.printItems(); //Getting the Order Details for the Email//
        return details;
    }
    
    public long getId()
    {
        return orderId; //Getting Order ID//
    }
    
    public double getTotal()
    {
        return cart.getTotal(); //Getting the total price of Items in ShoppingCart//
    }
    
    public String getEmailAddress()
    {
        return cart.getEmailAddress(); //Getting Customer Email//
    }
    
    public String getName()
    {
        return cart.getName(); //Getting Customer Name//
    }
    
    public String getDelAddress()
    {
        return deladdress.getAddress(); //Getting Delivery Address//
    }
    
    public String getBillAddress()
    {
        return billaddress.getAddress(); //Getting Billing Address//
    }
}
