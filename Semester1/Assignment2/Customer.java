
/**
 * Write a description of class Customer here.
 *
 * @author Eoin Clarke
 * @version V1
 */

import java.lang.Math;
import java.util.Random;

public class Customer
{
    //Creating fields//
    private String customerFirstName; 
    private String customerSurName;
    private String email;
    private final long customerId;
    
    public Customer(String fname, String sname, String email)
    {
        //Setting fields when object is created//
        customerFirstName = fname; 
        customerSurName = sname;
        this.email = email;
        customerId = makeCustomerId();
    }
    
    public long getId()
    {
        return customerId;   //Getting the Customer ID//
    }
    
    public String getFirstName()
    {
        return customerFirstName; //Getting the Customer's First Name//
    }
    
    public String getSurName()
    {
        return customerSurName; //Getting the Customer's Surname//
    }
    
    public String getEmail()
    {
        return email; //Getting the Customer's Email address//
    }
    
    public long makeCustomerId()
    {
        //This is a random num generator for the customer Id. I don't think we need this but it was fun to figure out.//
        long id = 000001L + (long) (Math.random() * (1000000L - 000001L));
        return id;
    }
}
