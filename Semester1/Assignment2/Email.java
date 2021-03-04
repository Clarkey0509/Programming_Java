
/**
 * @author Eoin Clarke
 * @version V1
 */

public class Email
{
    private Payment payment; //Creating field//
    
    public Email(Payment payment)
    {
        this.payment = payment; //Setting field when object is created//
    }

    public void printEmail()
    {
        if(payment.isValid())
        {
           System.out.println("\nSent to "+payment.getEmailAddress()); //Printing out the Email if the payment is valid.//
           System.out.println("Dear " +payment.getName()+",\n\nYour payment was successful.");
           System.out.println("Order Number: " + payment.getOrderId());
           System.out.println("\nDetails:\n" + payment.getDetails());
           System.out.println("Delivery Address: " + payment.getDelAddress());
           System.out.println("\nTotal: €" + payment.getTotal());
           System.out.println("Billing Address: " + payment.getBillAddress());
           
        }
        else
        {
           //Printing out the Email if the payment is NOT valid.//
           System.out.println("\nSent to "+payment.getEmailAddress()+"\nDear " +payment.getName()+",\nSorry, your payment was invalid. Have a nice day!");
        }
    }
}
