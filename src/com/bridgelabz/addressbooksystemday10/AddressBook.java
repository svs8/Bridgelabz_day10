package com.bridgelabz.addressbooksystemday10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class AddressBook {
    static Scanner sc = new Scanner(System.in);

    List<Contacts> ContactsArrayList = new ArrayList<Contacts>();
    public void addContacts() {
        Contacts contact = new Contacts();
        System.out.println("enter the firstname");
        String firstName = sc.next();
        contact.setFirstName(firstName);
        System.out.println("enter the lastname");
        String lastName = sc.next();
        contact.setLastName(lastName);
        System.out.println("enter the email");
        String email = sc.next();
        contact.setEmail(email);
        System.out.println("enter the phonenumber");
        String phoneNumber = sc.next();
        contact.setPhoneNumber(phoneNumber);
        System.out.println("enter the zip code");
        String zip = sc.next();
        contact.setZip(zip);
        System.out.println("enter the cityname");
        String city = sc.next();
        contact.setCity(city);
        System.out.println("enter the name of the state");
        String state = sc.next();
        contact.setState(state);
        System.out.println("enter the address");
        String address = sc.next();
        contact.setAddress(address);
        ContactsArrayList.add(contact);

        System.out.println(contact.toString());
    }

    public void editContact() {
        System.out.println("Enter the first name of the contact you want to edit: ");
        String firstName = sc.next();
        boolean flag = false;
        for (Contacts contact : ContactsArrayList) {
            if (firstName.equals(contact.getFirstName())) {
                contact.editContact();
                System.out.println("Contact edited successfully!");
                flag = true;
               break;
            }
       }
        System.out.print(ContactsArrayList);
        if (flag == false) {
           System.out.println("The contact with first name : " + firstName + " is not found!");
        }
        }
    }
