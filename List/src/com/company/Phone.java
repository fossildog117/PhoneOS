package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by nathanliu on 20/02/2016.
 */

class Phone {

    private ArrayList<Contact> PhoneBook;
    private int number;

    public Phone(ArrayList<Contact> phoneBook, int number) {
        this.PhoneBook = phoneBook;
        this.number = number;
    }

    public boolean checkContact(String name) {
        for (int i = 0; i < PhoneBook.size(); i++) {
            if (getPhoneBook().get(i).getName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    public void createContact() {

        Scanner name = new Scanner(System.in);
        Scanner number = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String contactName = name.nextLine();
        System.out.print("Enter a number: ");

        int contactNumber = number.nextInt();

        if (checkContact(contactName) == false) {

            System.out.println("Contact already exists");

        } else {
            System.out.println("Contact created");
            PhoneBook.add(new Contact(contactName, contactNumber));

        }

    }

    public void printContacts () {
        for (Contact e : PhoneBook) {
            System.out.println(e.getName() + " has number " + e.getNumber());
        }
    }

    public int searchContact(String name) {
        for (int i = 0; i < PhoneBook.size(); i++) {
            if (PhoneBook.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void editContacts() {

        System.out.print("Enter a name: ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int temp = searchContact(name);

        if (temp == -1) {
            System.out.println("Contact does not exist");
        } else {

            System.out.print("Change name: ");
            String newName = input.nextLine();

            if (checkContact(newName) == false) {
                System.out.println("Cannot change name to an existing contact");
            } else {

                PhoneBook.get(temp).setName(newName);

                Scanner in = new Scanner(System.in);

                System.out.print("Change phone number: ");
                PhoneBook.get(temp).setNumber(in.nextInt());

            }
        }
    }

    public void removeContact() {

        System.out.print("Enter a name: ");

        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        int temp = searchContact(in);

        if (temp == -1) {
            System.out.println("Contact does not exist");
        } else {
            PhoneBook.remove(temp);
        }

    }

    public ArrayList<Contact> getPhoneBook() {
        return PhoneBook;
    }

    public int getNumber() {
        return number;
    }
}