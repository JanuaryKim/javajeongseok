package ch11.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("deleter", "1111");
        map.put("deleter", "2232"); //deleter 키의 value는 2232로 덮어쓰여진다

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("id와 pwd를 입력하여 주세요 : ");
            System.out.printf("id : ");
            String id = scanner.nextLine().trim();

            System.out.printf("pwd : ");
            String pwd = scanner.nextLine().trim();

//            Set<Map.Entry<String, String>> maps = map.entrySet();

            if (!map.containsKey(id)) {
                System.out.println("id가 존재하지 않습니다. 다시 입력하세요");
                continue;
            }

            if (!map.get(id).toString().equals(pwd)) {
                System.out.println("pwd가 일치하지 않습니다. 다시 입력하세요");
            }
            else
            {
                System.out.println("비밀번호가 일치합니다");

                Set<Map.Entry<String, String>> maps = map.entrySet();

                break;
            }
        }
    }
}
