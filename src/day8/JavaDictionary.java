package day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaDictionary {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBookMap = phoneBookMap = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            // Write code here
            phoneBookMap.put(name, phone);
           System.out.println(phoneBookMap);

        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phoneBookMap.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + phoneBookMap.get(s));
            }
        }
        in.close();
        System.exit(1);
    }
}