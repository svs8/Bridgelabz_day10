package com.bridgelabz.addressbooksystemday10;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static Scanner sc=new Scanner(System.in);
    ArrayList<String> ContactsArrayList = new ArrayList<>();
    public void addContacts() {
        Contacts contact = new Contacts();
        System.out.println("enter the firstname");
        String firstName=sc.next();
        contact.setFirstName(firstName);
        System.out.println("enter the lastname");
        String lastName=sc.next();
        contact.setLastName(lastName);
        System.out.println("enter the email");
        String email=sc.next();
        contact.setEmail(email);
        System.out.println("enter the phonenumber");
        String phoneNumber=sc.next();
        contact.setPhoneNumber(phoneNumber);
        System.out.println("enter the zip code");
        String zip=sc.next();
        contact.setZip(zip);
        System.out.println("enter the cityname");
        String city=sc.next();
        contact.setCity(city);
        System.out.println("enter the name of the state");
        String state=sc.next();
        contact.setState(state);
        System.out.println("enter the address");
        String address=sc.next();
        contact.setAddress(address);

        System.out.println(contact.toString());
    }
}
