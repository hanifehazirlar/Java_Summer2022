package day47_maps;

import java.util.HashMap;
import java.util.Map;

public class C06_Example {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap=new HashMap<Integer, String>();
        hmap.put(100, "Ali, Can");
        hmap.put(101, "Veli, Al");
        hmap.put(102, "Can, Tan");
        for (Map.Entry mapEntry:hmap.entrySet()) {
            System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());
            //100 Ali, Can
            //101 Veli, Al
            //102 Can, Tan
        }




    }
}
