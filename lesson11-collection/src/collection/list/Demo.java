package collection.list;

import bean.Item;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Integer> items = Arrays.asList(1,2,4,2);
        items.stream().filter(i -> i%2==0).collect(Collectors.toList()).forEach(System.out::println);
        Map<Integer,String > e= new HashMap<>();
        e.put(1,"2");
        for(Map.Entry<Integer,String > l: e.entrySet()){
            System.out.println(e.get(1));
        }
    }
}
