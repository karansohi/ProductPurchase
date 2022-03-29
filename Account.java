package ProductPurchase;
import java.util.*;

public class Account {
    private String id;
    private String billingAddress;
    private boolean is_closed;
    private Date open_date;
    private Date close_date;
    Customer customer;
    Account(String id, String billingAddress, Customer customer) {
        this.id = id;
        this.billingAddress = billingAddress;
        this.customer = customer;
        this.is_closed = false;
        this.open_date = new Date();
    }
    void close() {
        this.is_closed = true;
        this.close_date = new Date();
    }
    void reopen() {
        this.is_closed = false;
        this.close_date = null;
    }
    void change_billingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
    
}
