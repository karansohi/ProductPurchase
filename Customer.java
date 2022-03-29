package ProductPurchase;

import java.util.*;

public class Customer{
    private String id;
    private Address address;
    private Phone phone;
    private String email;

    Customer(Address address, Phone phone, String email) {
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    void setAddress(Address address) {
        this.address = address;
    }
    void setPhone(Phone phone) {
        this.phone = phone;
    }
    void setEmail(String email) {
        this.email = email;
    }
    Address getAddress() {
        return address;
    }
    String getPhone() {
        return phone.toString();
    }
    String getEmail() {
        return email;
    }
}