package model3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args){
        Map<String, String> hashMap = new  HashMap<>();
        hashMap.put("A", "str");
        hashMap.put("B", "str");
        hashMap.put("C", "str");
        hashMap.put("Dima", "str");
        Set<String> keySet = hashMap.keySet();
        keySet.stream().forEach(System.out::println);
        final Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        hashMap.forEach((k, v)->System.out.print(k+":"+v+" "));
        hashMap.put("Dima", "srt111");
        System.out.println();
        System.out.println("After add element with  key Dima set value str111");
        hashMap.forEach((k, v)->System.out.print(k+":"+v+"  "));


    }
}
