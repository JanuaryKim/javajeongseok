package jeongseok.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterator {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("name", "younghyun");
        map.put("age", "31");
        map.put("nick", "januaryman");
        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        Set set1 = map.keySet();
        Iterator keySetItr = set1.iterator();


        System.out.println("=============");
        while(keySetItr.hasNext()){
            String key = (String)keySetItr.next();
            System.out.println(key);
        }
    }
}
