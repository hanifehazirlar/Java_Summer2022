package day43_interfaces_iteretors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_ListIterator {
    /*
    ListIterator Iterator'in interface'inin child interface'dir
    ama daha cok method'a sahiptir
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);// [10, 20, 30]
        int temp;
        ListIterator lit1=list.listIterator();
        while(lit1.hasNext()) { // list'in yaninda eleman oldugu müddetce devam eder
            temp=(int)lit1.next()+3;
            lit1.set(temp);

        }
        System.out.println(list);
    }
}
