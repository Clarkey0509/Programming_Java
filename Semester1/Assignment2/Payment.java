
/**
 * Write a description of class Payment here.
 *
 * @author Eoin Clarke
 * @version V1
 */
public class Payment
{
    private Order order; //Creating fields//
    private String creditCardType;
    private long creditCardNum;
    private String date;
    private String address;
    private String bankName;
    
    public Payment(Order order, String creditCardType, long creditCardNum, String date)
    {
        this.order = order; //Setting fields when object is created//
        this.creditCardType = creditCardType;
        this.creditCardNum = creditCardNum;
        this.date = date;
    }
    
    public boolean isValid()
    {
        if (creditCardType == "MasterCard" || creditCardType == "Visa") //Boolean method to see if payment details are valid. This checks card type.//
        {
            long length = String.valueOf(creditCardNum).length(); //Bonus: check if card number has right amount of digits.//
            if(length == 10)
            {
                //Tried to do bonus++ but could not get Date objects working properly//
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public long getOrderId()
    {
        return order.getId(); //Getting Order ID//
    }
    
    public String getDetails()
    {
        return order.getDetails(); //Getting Order Details//
    }
    
    public double getTotal()
    {
        return order.getTotal(); //Getting Order Total//
    }
    
    public String getEmailAddress()
    {
        return order.getEmailAddress(); //Getting Customer's Email address//
    }
    
    public String getName()
    {
        return order.getName(); //Getting Customer's full Name//
    }
    
    public String getDelAddress()
    {
        return order.getDelAddress(); //Getting Order Delivery Address//
    }
    
    public String getBillAddress()
    {
        return order.getBillAddress(); //Getting Order Billing Address//
    }
}
