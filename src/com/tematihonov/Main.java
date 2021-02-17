package com.tematihonov;

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
    Map<String, Integer> map = new TreeMap();
    map.put("Tikhonov Artem", 123);
    map.put("Fomichev Igor", 6969);
    map.put("Sartov Mikhail", 1337);
    for (Map.Entry<String, Integer> o : map.entrySet()) {
        if (o.getKey().equals())
        System.out.println(o.getKey() + ": " + o.getValue());
    }

    }

}