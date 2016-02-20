package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // write your code here

        //Contacts class - name + phone number
        //Master MobilePhone class - ArrayList of contacts
        //Options menu, Quit, print list of contacts, add new contact, update existing contact,
        //remove contact, search contact

        ArrayList<Contact> phoneBook = new ArrayList<>();
        Phone iPhone = new Phone(phoneBook, 123);

        iPhone.getPhoneBook().add(new Contact("nathan", 1234));
        iPhone.getPhoneBook().add(new Contact("Jiawen", 54242));

        menu(iPhone);
    }

    public static boolean menu(Phone phone) {

        System.out.printf("Select an option\n1. Add contact\n2. Print contacts\n3. Edit contact\n4. Remove contact\n5. Quit\n");

        Scanner input = new Scanner(System.in);

        switch (input.nextInt()) {
            case 1:
                System.out.println("Create new contact");
                phone.createContact();
                break;
            case 2:
                phone.printContacts();
                break;
            case 3:
                phone.editContacts();
                break;
            case 4:
                phone.removeContact();
                break;
            case 5:
                System.out.print("Program quitting");
                return true;
            default:
                System.out.println("Invalid input");
        }
        return menu(phone);
    }
}
