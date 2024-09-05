package estore;

import java.util.Scanner;

public class BillingInformation {
    private String phoneNumber;
    private String email;
    private String address;
    private String creditCardNumber;
    private Users user;

    public BillingInformation(Users user,String phoneNumber, String email, String address, String creditCardNumber) {
        this.user = user;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
    }

}
