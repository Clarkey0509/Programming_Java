
/**
 *
 * @author Eoin Clarke
 * @version V1
 */
public class TestTransaction
{
    public TestTransaction()
    {
        
    }
    
    public static void main(String[] args)
    {
        TestTransaction test = new TestTransaction();
        test.transaction1();
        test.transaction2();
    }
    
    public void transaction1()
    {
        //first test
        //Create Customer Object
        Customer customer = new Customer("Niamh", "O' Leary", "niamhol@zmail.com");
        
        //Create Shopping Cart obj for Customer
        ShoppingCart cart1 = new ShoppingCart(11111111, "13:20 9/4/20");
        cart1.add(customer);
        
        //Add 3 Items with known cost to cart
        Item item1 = new Item("Cookies", 12345678);
        item1.setPrice(2.00);
        cart1.addItem(item1);
        
        Item item2 = new Item("Jaffa Cakes", 22345678);
        item2.setPrice(5.00);
        cart1.addItem(item2);
        
        Item item3 = new Item("Ginger Nuts", 32345678);
        item3.setPrice(3.00);
        cart1.addItem(item3);
        
        //Finalize the cart and create an order
        cart1.close();
        Order order1 = new Order(11111111);
        order1.add(cart1);
        
        //Add a delivery address for the order
        Address address1 = new Address("221b Baker St, Marylebone, London NW1 6XE, United Kingdom");
        order1.addDelAddress(address1);
        
        //Add a payment type
        Payment payment = new Payment(order1, "MasterCard", 1234567890, "7/20");
        
        //Validate the payment
        payment.isValid();
        
        //If successful, email the customer with a success email and the cost of the purchased items
        Email email = new Email(payment);
        email.printEmail();
        
        //Result: Email is created with correct total
        
        System.out.println("\n///////////////////////////////////////////////////////\n");
    }
    
    public void transaction2()
    {
        //second test
        //Create Customer Object
        Customer customer2 = new Customer("Fred", "O' Gorman", "ftheog@umail.com");
        
        //Create Shopping Cart obj for Customer
        ShoppingCart cart2 = new ShoppingCart(14141414, "3:00 11/8/20");
        cart2.add(customer2);
        
        //Add 3 Items with known cost to cart
        Item item4 = new Item("Orange Juice", 11111112);
        item4.setPrice(8.00);
        cart2.addItem(item4);
        
        Item item5 = new Item("Apple Juice", 21111112);
        item5.setPrice(4.50);
        cart2.addItem(item5);
        
        Item item6 = new Item("Ginger Juice", 31111114);
        item6.setPrice(9.00);
        cart2.addItem(item6);
        
        cart2.removeItem("Ginger Juice");
        
        cart2.close();
        Order order2 = new Order(11111112);
        order2.add(cart2);
        
        Address address2 = new Address("221b Baker St, Marylebone, London NW1 6XE, United Kingdom");
        
        //Add a payment type
        Payment payment2 = new Payment(order2, "NasterCard", 1242424242, "11/22");
        
        //Validate the payment
        payment2.isValid();
        
        //If successful, email the customer with a success email and the cost of the purchased items
        Email email2 = new Email(payment2);
        email2.printEmail();
        
        System.out.println("\n///////////////////////////////////////////////////////\n");
    }
}
