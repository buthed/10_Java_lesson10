package com.tematihonov;

import javafx.beans.binding.MapExpression;

import java.util.*;

public class Main {

    public static void main(String[] args){
        String months[] = {"January" , "February" , "January", "March" , "April", "May", "June", "July", "January", "August", "April", "September", "October", "November", "December"};
        List<String> list = new ArrayList<>(Arrays.asList("January" , "February" , "January", "March" , "April", "May", "June", "July", "January", "August", "April", "September", "October", "November", "December"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
        }

//1.1
        System.out.println("1.1");
        System.out.println("Заданный массив: ");
        System.out.println(list);

//1.2
        System.out.println("1.2");
        System.out.println("Вывод уникальных слов: ");
        Set set = new HashSet(list);
        System.out.println(set);

//1.3
        System.out.println("1.3");
        System.out.println("Вывод с колличеством повторений: ");
        HashMap hashMap = new HashMap();
        for (int i = 0; i < months.length; i++) {
            int count = 0;
            for (int j = 0; j < months.length; j++) {
                if(months[i].equals(months[j])){
                    count++;
                }
            }
            hashMap.put(months[i], count + " повторений");
        }
        System.out.println(hashMap);

//2
    System.out.println("2");
    Map<String, String> phonebook = new TreeMap();

        phonebook.put("88008008888", "Tikhonov Artem");
        phonebook.put("88008007777", "Fomichev Igor");
        phonebook.put("88008006666", "Sartov Mikhail");
        phonebook.put("88008005555", "Tikhonov Artem");

        System.out.println("Вывод Tikhonov Artem: ");
        get(phonebook, "Tikhonov Artem");
        System.out.println("Вывод после добавления второго номера для Sartov Mikhail: ");
        add(phonebook, "88008004444", "Sartov Mikhail");
        get(phonebook, "Sartov Mikhail");

    }

    private static void add(Map<String, String> phonebook, String phoneNumber,  String name) {
        phonebook.put(phoneNumber, name);
    }
    private static void get(Map<String, String> phonebook,  String name) {
        for (Map.Entry<String,String> o : phonebook.entrySet()) {
            if (o.getValue().equals(name)) {
                System.out.println(o.getValue() + ": " + o.getKey());
            }
        }
    }

}