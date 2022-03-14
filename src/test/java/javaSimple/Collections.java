package javaSimple;

import java.util.*;
import java.util.stream.Collectors;

public class Collections {

    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        try {
            nums[1] = 1;
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("UUPS");
        }


        System.out.println(nums[1]);

        String[] str = {"2", "4", "8"};
        System.out.println(str[1]);


        ArrayList<String> list = new ArrayList<>();
        list.add("SAgsdgsdg");
        list.add("jghkghsdgsdgsdg");
        list.add("12354");


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String s : list) {
            System.out.println("ForEach=" + s.length());
        }

        list.forEach(s -> System.out.println("strim=" + s));
        list.stream().filter(s -> s.length() < 14).forEach(s -> System.out.println("filtred=" + s));


        list.stream().filter(s -> s.contains("A")).forEach(s -> System.out.println("filtred2=" + s));

        for (String s : list) {
            if (s.contains("A")) {
                System.out.println(s);
            }
        }

        List<String> secondList = list.stream().filter(s -> s.length() < 14).collect(Collectors.toList());
        secondList.forEach(s -> System.out.println("second list item=" + s));


        HashMap<String, String> map = new HashMap<>();
        map.put("Key1", "Value1");

        map.put("Key2", "Value1");
        map.put("Key3", "Value1");
        map.put("Key4", "Value1");
        map.put("Key1", "Привет как дела.");
        System.out.println(map.get("Key1"));

        Set<String> set;
        set = map.keySet();
        set.forEach(s -> System.out.println("keys=" + s));

        for (String s : set) {
            System.out.println("Значение ключа " + s + "=" + map.get(s));
        }

        for (Map.Entry<String,String> m :map.entrySet()){
            System.out.println( "Key= "+ m.getKey());
            System.out.println( "Value= "+ m.getValue());
        }

    }
}
