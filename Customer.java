import java.util.*;

public class Customer {
    private String id;
    private String address;
    private String phone;
    private String email;

    Customer(String id, String address, String phone, String email) {
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    void setId(String id) {
        this.id = id;
    }
    void setAddress(String address) {
        this.address = address;
    }
    void setPhone(String phone) {
        this.phone = phone;
    }
    void setEmail(String email) {
        this.email = email;
    }
    String getId() {
        return id;
    }
    String getAddress() {
        return address;
    }
    String getPhone() {
        return phone;
    }
    String getEmail() {
        return email;
    }
    public String toString() {
        return "Customer [id=" + id + ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
    }
}