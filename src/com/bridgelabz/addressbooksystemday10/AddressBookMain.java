package com.bridgelabz.addressbooksystemday10;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AddressBook addressbook=new AddressBook();
        addressbook.addContacts();
        System.out.println("Enter the details");
        addressbook.addContacts();

        addressbook.editContact();

    }

}
