package com.tematihonov;

public class Phonebook extends Main{
    private static String name;
    private static int phoneNumber;


    public Phonebook(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public void add(String name, int phoneNumber) {
        new Phonebook(name, phoneNumber);
    }

    public static int get(String i){
        return phoneNumber;
    }
}
