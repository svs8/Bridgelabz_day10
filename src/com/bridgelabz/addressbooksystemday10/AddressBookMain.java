package com.bridgelabz.addressbooksystemday10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner scanner=new Scanner(System.in);

    static Map<String,AddressBook> addressBookMap=new HashMap<>();

    public static void addMultipleAddressBook() {
        int choice = 0;
        do {
            System.out.println("Please enter the Choice");
            System.out.println("1.Add AddressBook, 2.Delete AddressBook, 3.Display AddressBook 4.edit AddressBook, 5.Add/edit/delete/display AddressBook 6.exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addAddressBook();
                    break;
                case 2:
                    deleteAddressBook();
                    break;
                case 3:
                    displayAddressBook();
                    break;
                case 4:
                    editAddressBook();
                    break;
                case 5:
                    updateAddressBook();
                    break;
                case 6:
                    break;

                default:
                    System.out.println("Wrong Choice Entered");
                    addMultipleAddressBook();
            }
        } while (choice != 6);

    }


    private static void updateAddressBook() {
        System.out.println("Please enter the AddressBookName ");
        String addressBookName = scanner.next();
        AddressBook addressBook = addressBookMap.get(addressBookName);
        addressBook.addMultipleContact();

    }

    private static void editAddressBook() {
        System.out.println("Please enter the AddressBook Name to be changed ");
        String addressBookName = scanner.next();
        AddressBook addressBook = addressBookMap.get(addressBookName);
        addressBook.editAddressBookName();

    }

    private static void displayAddressBook() {
        System.out.println("Please enter the AddressBookName ");
        String addressBookName = scanner.next();
        AddressBook addressBook=addressBookMap.get(addressBookName);

        if(addressBook==null){
            System.out.println("AddressBook not present");
        }else{
            System.out.println(addressBook);
        }
    }

    private static void deleteAddressBook() {
        System.out.println("Please enter the AddressBookName ");
        String addressBookName = scanner.next();
        addressBookMap.remove(addressBookName);

    }


    private static void addAddressBook() {
        AddressBook addressBook = new AddressBook();
        System.out.println("Enter the AddressBook Name");
        String addressBookName = scanner.next();
        addressBook.setAddressBookName(addressBookName);

        addressBookMap.put(addressBook.getAddressBookName(), addressBook);
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        addMultipleAddressBook();

    }

}