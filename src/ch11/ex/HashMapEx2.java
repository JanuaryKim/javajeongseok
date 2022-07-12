package ch11.ex;
import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put("강감찬", 1900);
        map.put("을지문덕", 1800);
        map.put("이순신", 2000);
        map.put("복지겸", 1000);
        map.put("여포", 10);

        Set set = map.entrySet();
        Iterator entryIter = set.iterator();

        while (entryIter.hasNext()) {
            Map.Entry entry = (Map.Entry)entryIter.next();

            System.out.printf("key : %s , value : %s",entry.getKey(), entry.getValue());
            System.out.println();
        }

        System.out.println("참가자 : "+ map.keySet());

        Collection collection = map.values();
        Iterator iterator = collection.iterator();

        int total = 0;
        while (iterator.hasNext()) {
            total += (int)iterator.next();
        }

        System.out.println("총점 : "+ total);
        System.out.println("평균 : "+ total/collection.size());
        System.out.println("최고점 : "+ Collections.max(collection));
        System.out.println("최저점 : "+ Collections.min(collection));

    }
}
