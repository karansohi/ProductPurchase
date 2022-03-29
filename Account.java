package ProductPurchase;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.lang.Class;
/**
 * https://stackoverflow.com/questions/1389736/how-do-i-create-a-unique-id-in-java
 * Method reference for generating unique ID
*/
public class Account {
    private Customer customer;
    private String id;
    private Address billingAddress;
    private boolean is_closed;
    private Date open_date;
    private Date close_date;
    private ShoppingCart shopping_cart;
    private Order orders[];
    private int order_count = 0;

    private static AtomicLong idCounter = new AtomicLong();

    public static String generateID()
    {
        return String.valueOf(idCounter.getAndIncrement());
    }
    Account(Customer c) {
        this.id = generateID();
        this.customer = c;
        this.billingAddress = c.getAddress();
        this.is_closed = false;
        this.open_date = new Date();
        this.shopping_cart = new ShoppingCart();
        this.orders = new Order[5];
    }
    void close() {
        this.is_closed = true;
        this.close_date = new Date();
    }
    void reopen() {
        this.is_closed = false;
        this.close_date = null;
    }
    void change_billingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
    void placeOrder(Order order) {
        if (order_count < orders.length) {
            orders[order_count] = order;
            order_count++;
        }
    }
    void getOrders(){
        for(Order order : orders){
            System.out.println(order.toString());
        }
    }
    void getShoppingCart(){
        System.out.println(shopping_cart.toString());
    }

    
}
